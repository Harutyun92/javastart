package program.categories;

import com.google.common.io.Resources;
import lombok.Getter;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InMemoryCategoryDAO {

    @Getter  // bedzie tylko getter do tego pola nizej
    private List<Category> categoryList = new ArrayList<>();
    private static InMemoryCategoryDAO instance;

    public static InMemoryCategoryDAO getInstance() {
        if (instance == null) { //1
            synchronized (InMemoryCategoryDAO.class) { //2
                if (instance == null) { //3
                    instance = new InMemoryCategoryDAO();
                }
            }
        }
        return instance;
    }


    public InMemoryCategoryDAO() {
        initializeCategories();
    }

    private List<String> loadCategoriesFromFile() {
        try {
            return Resources.readLines(Resources.getResource("kategorie.txt"), Charset.forName("UNICODE"));  // sposob na odczytywanie wszystkich liniej kodu
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void initializeCategories() {     // metoda ma za zadanie wczytac linijki kodu i zrobic z niej liste kategorii
        List<String> categoriesFromFile = loadCategoriesFromFile(); //tu odczytujemy plik z dysku
        AtomicInteger counter = new AtomicInteger(1);
        List<Category> categories = categoriesFromFile.stream() //tu zamieniamy napisy z pliku na kategorie
                .map(s ->
                {
                    Category category = new Category();   //ustawiamy kolejne id, ze stringa robi sie id , chyba :D
                    category.setCategoryName(s);
                    category.setId(counter.getAndIncrement());
                    return category;
                })
                .collect(Collectors.toList());

        Map<Integer, List<Category>> categoriesMap =   // robimy mape z naszymi kategoriami (ksiazka,powiesc fantastyka itp)
                categories.stream()
                        .collect(Collectors.groupingBy(
                                c -> calculateDepth(c.getCategoryName()))); //grupujemy kategorie po głębokości zagnieżdżenia (do mapy)

        // Z UZYCIEM PETLI
//        for (Category category : categories) {
//            Integer depth = calculateDepth(category.getCategoryName());
//            if (categoriesMap.containsKey(depth)) {
//                categoriesMap.get(depth).add(category);
//            } else {                                               // jesli nie zawiera klucza
//                List<Category> depthCategoryList = new ArrayList<>();
//                depthCategoryList.add(category);
//                categoriesMap.put(depth, depthCategoryList);
//            }
//        }

        populateParentId(categoriesMap, 0); //rekurencyjnie uzupełniamy parentId kategorii używając do tego mapy i zaczynając od zerowego zagnieżdżenia
        categoryList = categories; //przypisujemy kategorie do listy w klasie (to jest niejako cache tych kategorii)


    }

    private void populateParentId(Map<Integer, List<Category>> categoriesMap, int depth) { // metoda rekurencyjna
        List<Category> children = categoriesMap.get(depth);    // pobieramy liste
        children.stream()
                .forEach(c -> findAndSetParentId(categoriesMap, depth, c));
        if (categoriesMap.containsKey(depth + 1)) {
            populateParentId(categoriesMap, depth + 1);  // jak sie skonczy to zejdzie o poziom nizej po to +1

        }
    }

    private void findAndSetParentId(Map<Integer, List<Category>> categoriesMap, int depth, Category c) { //Szukamy parentId w mapie (z poziomu wyżej)
        List<Category> potentialParents = categoriesMap.get(depth - 1);

        Integer parentId = potentialParents == null ? null : potentialParents.stream()
                .map(Category::getId)
                .filter(id -> id < c.getId())
                .sorted((a, b) -> b - a)  // posortuje w odworconej kolejnosci
                .findFirst()
                .orElse(null);
        c.setParentId(parentId);
    }

    private Integer calculateDepth(String categoryName) { //na podstawie spacji liczymy zagnieżdżenie kategorii
        return categoryName.startsWith("")
                ? categoryName.split("\\S+") //robimy splita na napisie naszych kategorii czyli ksiazka powiesc itp i uzywamy do tego regexu , splituje po napisie i zostawia wole pola z przodu i mowi nam ile tych spacji jest przed dana kategoria
                [0].length()                   // split zwraca tablice i mozemy zrobic metode length i poda nam spacje ile ich jest
                : 0;   // sprawdzamy z ternary czyli z ?
    }
}

