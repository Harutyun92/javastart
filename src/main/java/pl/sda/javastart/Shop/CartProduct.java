package pl.sda.javastart.Shop;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.BigDecimal.valueOf;
// import statyczny importuje tylko metody

public class CartProduct {
    private Product product;
    private Cart cart;
    private BigDecimal price;
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartProduct that = (CartProduct) o;
        return Objects.equals(product, that.product);       // tylko produkty zostawiamy

    }

    @Override
    public int hashCode() {
        return Objects.hash(product);   // tylko produkt zostawaimy
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String viewProduct() {
        return new StringBuilder()
                .append(product.getName())
                .append(" ")
                .append(this.price)   // bo odnosi ci do ceny z tej klasy
                .append(this.quantity)
                .append(" ")
                .append(this.price.multiply(valueOf(quantity)))            // bez BigDecimal.valueOf bo zaimportowalismy na gorze BigDecimal
                .toString();
    }
}
