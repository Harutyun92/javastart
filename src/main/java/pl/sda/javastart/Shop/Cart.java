package pl.sda.javastart.Shop;

import java.util.*;

public class Cart {
    private User user;
    private Set<CartProduct> cartProducts = new HashSet<>();   // dajemy sety zeby byly unikatowe elementy , np jesli wrzucimy dwa razy chleb zeby chleb zostal nadpisany i bylo 2

    public Cart(User user) {
        this.user = user;
    }

    public void removeProduct(Product product){
        cartProducts.removeIf(cartProduct -> cartProduct.getProduct().equals(product));
    }

    public void addProduct(Product product) {   // metoda na dodawanie produktu jest nie znajdziemy dodajemy nowy , jesli znajdziemy nadpisujemy do juz obecnego
        CartProduct cartProductTemp = cartProducts.stream()
                .filter(cartProduct -> cartProduct.getProduct().equals(product))
                .findAny()
                .orElse(null);
        if (cartProductTemp == null) {   // jezeli nie istnieje tworzymy nowy cartProduct nizej i dodajemy do listy , jezeli istnieje to else
            cartProductTemp = new CartProduct();
            cartProductTemp.setCart(this);    // this odwoluje sie do tego obiektu
            cartProductTemp.setPrice(product.getPrice());
            cartProductTemp.setProduct(product);
            cartProductTemp.setQuantity(1);
        } else {
            cartProductTemp.setQuantity(cartProductTemp.getQuantity() + 1);
        }
        cartProducts.add(cartProductTemp);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(Set<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
