package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", " pig", "dog", null, "parrot"};

    public static void main(String[] args) {
        firstStream();
        secondStream();
        sortExample();
    }

    private static void firstStream() {
        for (String animal : animals) {        //klikamy skrot iter
            if (animal == null) {                  // sprawdza po kolei i jak null==null to jest if na continue
                continue;
            }
            animal = animal.trim();            // WYTNA SIE BIALE ZNAKI PRZED LUB PO NAZWA ZWIERZAT
            if (animal.length() >= 4) {
                System.out.println(animal);
            }
        }
        System.out.println("Teraz wyswietla steam");
        Arrays.stream(animals)
                .filter(e -> e != null)                               //tu jest strumien Stringow
                .map(e -> e.trim())                                //mapowanie zmiana na inny typ , ale ze tu sa stringi to zostaja stringi, wycinanie pustych miejsc przez lub po nazwach zwierzat
                .filter(e -> e.length() >= 4)                    //kazde "Employe" to obiekt typu String
                .distinct()                                     // unikalnosc , wstawia kazde Zwierze jeden raz , mamy dwa parroty ale wystwietla jeden
                .forEach(e -> System.out.println(e));            //ta metoda pozwala uruchomic steama na tablicy
    }                                                            // forEach operacja konczaca wyswietla tylko cos , Computerr collect zwraca stringa

    private static void secondStream() {
        System.out.println("Stream dla secondStream");
        for (String animal : animals) {       //skrot iter
            if (animal == null) {
                continue;
            }
            System.out.println(animal + ",");  //todo brak przecinka po ostatnim
        }
        System.out.println("@ Teraz steam");
        String result = Arrays.stream(animals)
                .filter(a -> StringUtils.isNotBlank(a))                    // sprawdza zeby nie bylo empty "" , blank "  " i null
                .map(a -> a.trim())                                        // wycina biale pola
                .distinct()
                .sorted((e, f) -> e.compareTo(f))    // sortuje alfabetycznie
                .collect(Collectors.joining(","));              // daje nam przecinki
        System.out.println(result);                                      // jest collect ktory odpowiada za zwracanie stringa , dlatego musi byc result
    }

    private static void sortExample() {
        String name1 = "Anna";
        String name2 = "Ola";
        System.out.println(name1.compareTo(name2));
        System.out.println("Sortowanie alfabetyczne");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())                                //map wykonuje operacje na obiekcie i zwraca albo taki sam albo zmieniony
                .distinct()
                .sorted((e, f) -> e.compareTo(f))                          //e,f bo porownujemy dwa elementy, sortuje alfabetycznie
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Sortowanie po dlugosci Stringa");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())                                //map wykonuje operacje na obiekcie i zwraca albo taki sam albo zmieniony
                .distinct()
                .sorted((e, f) -> e.compareTo(f))                   // ustawia alfabetycznie
                .sorted((e, f) -> Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length()))) //porownujemy dlugosci
                .forEach(e -> System.out.print(e + " "));
    }
}
