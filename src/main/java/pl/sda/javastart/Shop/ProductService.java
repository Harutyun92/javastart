package pl.sda.javastart.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// klasa kontener dla produktow
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void showListOfProducts() {  // metoda show ktora wyswietli nam produkty
        products.stream()
                .map(Product::view)
                .forEach(System.out::println);  // :: poprzez referencje do metody
    }

    public Optional<Product> getById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))  // pobieramy id i porownujemy do naszego , czy jest taki produkt
                .findAny();  // jest to opcja z optional dlatego wyzej w metodzie piszemy optional i return
    }

    public void addAll(Product... products) {  // jest to tablica , nie wiemy ile produktow bedzie wiec dajemy ...
        this.products.addAll(Arrays.asList(products)); // zamiana tablicy products na liste produktow

    }

}
