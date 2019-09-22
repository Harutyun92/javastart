package pl.sda.javastart.Programowanie1;

import java.util.EmptyStackException;

public class Stos3<T> {

    private int containerSize = 20;
    private Object[] container = new Object[containerSize]; // tworzymy konterner i najlepiej zeby nie byl pusty wyzej piszemy cokolwiek do int containersize
    private int position = -1;  // pozycja ostatnio wrzuconego elementu, zeby wiedzeic na jakies pozycji jest ostatni nasz wrzucony element , zebysmy wiedzieli ktore dorzucic nastepnie
// zaczynamy od -1 bo jest ++ i zeby lecialo od 0

    public void push(T t) {
        if (t == null) {                     // jesli wrzucimy nulla to wyskoczy nam wyjatek
            throw new RuntimeException();
        }
        position++;                           // podbijamy pozycje w naszym stosie
        if (position > container.length - 1) {        // jesli stos sie wypelni stworzy sie nowy objekt
            Object[] c = new Object[container.length + containerSize];
            for (int i = 0; i < container.length; i++) {
                c[i] = container[i];
            }
            container = c;
        }
        container[position] = t; // wrzucoamy cos do naszego kontenera
    }

    //metoda na sprawdzenie isEmpty
    public boolean isEmpty() {
        return position == -1;
    }

    public T pop() {
        if (position == -1) {
            throw new EmptyStackException();
        }
        T element = (T) container[position];
        container[position] = null;
        position--;
        return element;
    }

    public T peek() {
        if (position == -1) {
            throw new EmptyStackException();
        }
        return (T) container[position];

    }
}