package pl.sda.javastart.Shop;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;

public class MainShop {
    public static User user;
    public static ProductService productService = new ProductService();
    private final static Scanner scanner = new Scanner(System.in);
    public static UserService userService = new UserService();
    public static CartService cartService = new CartService();


    public static void main(String[] args) {

        initproducts();
        start();
    }

    private static void start() {
        if (user == null) {       // piszemy ifa zeby przy wyswietlaniu wybieralo odpowiednie menu
            initialMenu();
        } else {
            loggedMenu();
        }
    }

    private static void showCartProducts() {
        Set<CartProduct> cartProducts = cartService.getCartProducts();
        cartProducts.stream()
                .map(CartProduct::viewProduct)
                .forEach(System.out::println);
        start();
    }

    private static void initproducts() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        product1.setId(1L);
        product2.setId(2L);
        product3.setId(3L);
        product4.setId(4L);
        product1.setName(" chleb");
        product2.setName(" śledź");
        product3.setName(" paluszki");
        product4.setName(" dziecko");
        product1.setPrice(new BigDecimal("2.04"));
        product2.setPrice(new BigDecimal("3"));
        product3.setPrice(new BigDecimal("4.6"));
        product4.setPrice(new BigDecimal("3.55"));

        productService.addAll(product1, product2, product3, product4);  // dzieki metody addALL z product service dodalismy tutaj
    }

    private static void loggedMenu() {
        System.out.println("Wybierz opcje ");
        System.out.println("1. Zakoncz");
        System.out.println("2. Pokaz dostepne produkty");
        System.out.println("3. Dodaj do koszyka produkt");
        System.out.println("4. Pokaz zawartosc koszyka");
        System.out.println("5. Usun produkt z koszyka");

        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.exit(0);
                break;
            case 2:
                showProducts();
                break;
            case 3:
                addToCart();
                break;
            case 4:
                showCartProducts();
                break;
            case 5:
                removeFromCart();
                break;
            default:
                System.out.println("Wybrales nieprawidlowa opcje");
        }
        start(); // dajemy zeby sie powtarzalo wyswietlanie po wprowadzeniu tanych
    }

    private static void addToCart() {
        System.out.println("Podaj id produktu");
        Long productId = scanner.nextLong();
        Optional<Product> product = productService.getById(productId);   // zwraca to optionala

        product.ifPresent(cartService::addProduct);
        // case kiedy produkt nie istnieje
        if (!product.isPresent()) {
            System.out.println("Nie ma takiego produktu, podaj prawidlowe id");
        } else {
            System.out.println("Dodano produkt");


            start();  // musimy znow wykonac start zeby znow przeszlo od nowa
        }
    }

    private static void removeFromCart() {
        System.out.println("Podaj id produktu: ");
        Long productId = scanner.nextLong();
        Optional<Product> product = productService.getById(productId);   // zwraca to optionala
        product.ifPresent(cartService::removeProduct);

        if (!product.isPresent()) {
            System.out.println("Nie ma takiego produktu, podaj prawidlowe id");
        } else {
            System.out.println("Usunieto produkt");
        }
        start();
    }

    private static void productManagement(Consumer<Product> manage) {
        System.out.println("Podaj id produktu: ");
        Long productId = scanner.nextLong();
        Optional<Product> product = productService.getById(productId);
        product.ifPresent(manage);
    }

    private static void showProducts() {
        productService.showListOfProducts();
    }

    private static void initialMenu() {
        System.out.println("Wybierz opcje:");
        System.out.println("1. Zaloguj");
        System.out.println("2. Zarejestruj");
        System.out.println("3. Zakończ");


        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Wybrales nieprawidlowa opcje");
        }
        start();
    }

    private static void login() {  // metoda na logowanie
        System.out.println("Podaj login: ");
        String login = scanner.next();
        System.out.println("Podaj hasło: ");
        String password = scanner.next();
        boolean ifSuccess = userService.login(login, password);          // tworzymy poprzez userService uzytkownika , i booleanem sprawdzamy czy sie udalo
        if (ifSuccess) {
            System.out.println("Udało sie zalogowac ");
        } else {
            System.out.println("Nie udało sie zalogowac ");
        }
    }

    private static void register() {  // piszemy metode na case 2 jesli ktos wybierze opcje rejestracji
        System.out.println("Podaj login: ");
        String login = scanner.next();
        System.out.println("Podaj hasło: ");
        String password = scanner.next();
        boolean ifSuccess = userService.registration(login, password);          // tworzymy poprzez userService uzytkownika , i booleanem sprawdzamy czy sie udalo
        if (ifSuccess) {
            System.out.println("Udało sie zarejestrowac ");
        } else {
            System.out.println("Nie udało sie zarejestrowac ");
        }
    }
}
