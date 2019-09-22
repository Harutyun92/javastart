package pl.sda.javastart.day8;

public class FruitBox {
    private Fruit  fruit;  // stworzylismy pudelko i przechowujemy tam tylko jeden owoc

    public FruitBox(Fruit fruit) {
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }
}
