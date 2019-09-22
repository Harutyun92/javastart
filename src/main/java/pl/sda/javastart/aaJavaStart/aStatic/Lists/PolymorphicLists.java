package pl.sda.javastart.aaJavaStart.aStatic.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphicLists {
    public static void main(String[] args) {
        LinkedList<Integer> ints1 = new LinkedList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ints1.add(i);
            ints2.add(i);
        }

        printList(ints1);
        printList(ints2);

    }

    static void printList(List<Integer> list) {
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
//Metoda printList(), dzięki przyjmowaniu ogólniejszego typu kolekcji jest bardziej uniwersalna. Jeśli nie wykorzystujesz metod
// specyficznych dla danej implementacji, np. removeLast() z klasy LinkedList, to rozważ także posługiwanie się referencjami
// ogólniejszego typu dla zwykłych zmiennych, czyli, np:
//
//List<Integer> ints1 = new LinkedList<>();
//List<Integer> ints2 = new ArrayList<>();1

//Jeśli jednak potrzebujesz metodę z konkretnego typu, np. wspomniana removeLast() to definiuj od razu kolekcję konkretnego typu,
// aby uniknąć rzutowania.
 //list<Integer> link = new LinkedList<>();
 //link.add(5);
 //     link.add(10);
 //     link.add(15);

 //     link.removeLast(); // błąd1

 //     W powyższym kodzie nie mamy dostępu do metody removeLast(), ponieważ zadeklarowaliśmy zmienną jako ogólniejszy typ List.
//     Deklarując zmienną jako LinkedList problem nie występuje:

 //     LinkedList<Integer> link = new LinkedList<>();
 //     link.add(5);
 //     link.add(10);
 //     link.add(15);

 //     link.removeLast(); // ok1

 //     Powyższe rady dotyczą wszystkich typów kolekcji, nie tylko list. Ogólna zasada brzmi: definiuj zmienne jako najogólniejszy
//     możliwy typ, który nie powoduje utraty funkcjonalności i nie zmusza cię do rzutowania.