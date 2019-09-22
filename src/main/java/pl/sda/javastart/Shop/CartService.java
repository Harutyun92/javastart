package pl.sda.javastart.Shop;

import pl.sda.javastart.day4.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CartService {

    private Map<Long, Cart> carts = new HashMap<>();                    // napisalismy dwie mapy ktory beda nam trzymac id uzytkownika i utworzony dla niego koszyk
    private Map<Long, List<Cart>> oldCarts = new HashMap<>();

    public void addProduct(Product product) {  // metoda na dodawanie produktu do koszyka
        Cart currentCart = getCart();     // pobieramy koszyk i przypisujemy do zmiennej
        currentCart.addProduct(product);
        addCartToMap(currentCart);                       // dodajemy do mapy koszyk
    }
    public void removeProduct(Product product){
        Cart currentCart=getCart();
        currentCart.removeProduct(product);
        addCartToMap(currentCart);
    }

    public Set<CartProduct> getCartProducts() {
        return getCart().getCartProducts();
    }

    public Cart getCart() {       // metoda do pobierania koszyka jesli juz istnieje dla jakiegos uzytkownika po userID
        return carts.getOrDefault(MainShop.user.getId(), new Cart(MainShop.user));     // tworzymy koszyk jesli nie znajdzie nam koszylka to dalismy ordefault metode i utworzymy nowy koszyk new cart
    }

    private void addCartToMap(Cart newCart) {   // wrzucamy nowy utowrzony koszyk do naszej mapy koszykow
        carts.put(MainShop.user.getId(), newCart);
    }
}
