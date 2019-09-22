package pl.sda.javastart.day8;

public class GenericFruitBox<T> { // uzywamy najczesciej T, E lub R
    private T fruit;

    public GenericFruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
