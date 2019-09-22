package pl.sda.javastart.aaa.ListyiMapy;

import java.util.ArrayList;
import java.util.List;
// tworzenie i dodawanie elementow do listy
//Array list szybciej sie odczytuje jakis element , linked list lepiej umieszczac  i usuwac elementy
public class CwiczeniaListy {
    public static void main(String[] args) {
        List<String> listaStr = new ArrayList<>();
        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");
        // wyswietlanie za pomoca petli for each
        for (String s : listaStr) {
            System.out.println(s);
        }
        // dodawanie do jakiegos indeksu elementu i wyswietlanie za pomoca petli for
        listaStr.add(1, "zero");
        for (int i = 0; i < listaStr.size(); i++) {
            System.out.println(listaStr.get(i));
        }
        System.out.println("rozmiar listy");
        System.out.println(listaStr.size());

        // usuniecie elementu z indeksu 3
        listaStr.remove(1);

        for (String s : listaStr) {
            System.out.println(s);
        }
        for (int i = 0; i < listaStr.size(); i++) {
            System.out.println(listaStr.get(i));
        }
        System.out.println("rozmiar po usunieciu jednego elementu");
        System.out.println(listaStr.size());
        // sprawdzanie czy cos sie znajduje na liscie / true
        System.out.println(listaStr.contains("dwa"));
        //sprawdzenie na jakim indeksie znajduje sie jakis element
        System.out.println(listaStr.indexOf("trzy"));

        listaStr.clear();
        System.out.println(listaStr);
    }
}
