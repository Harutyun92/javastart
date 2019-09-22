package pl.sda.javastart.programowanie2;

import org.apache.commons.lang3.StringUtils;
import pl.sda.javastart.programowanie2.Zadanie.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

// za pomoca streama robimy liste zwierzat , dajemy nazwy z malej litery potem zamieniamy na duze i wyswietlamy nazwe
public class Stream {
    public static void main(String[] args) {

        // List<String> animals = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     Animal animal = new Animal("Name" + i)        petla WartoscAbsolutna nizej zamiast niej stream !
        //     animals.add(animal);
        // }
        IntStream.range(0, 10)                      //dajemy nasz range za od 0-10
                .mapToObj(i -> new Animal(i))
                .map(animal -> animal.getName())                // daje imiona
                .map(str -> StringUtils.capitalize(str))         // dajemy zeby zamienilo male litery na duze
                .forEach(x -> System.out.println(x));

    }
}