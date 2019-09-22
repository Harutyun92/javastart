package pl.sda.javastart.aaa.Sety;

import java.util.*;

public class CwiczeniaSetTotolotek {
    public static void main(String[] args) {

        HashSet<Integer> setStrr = new HashSet<>();

        Random r = new Random();

        while (setStrr.size() < 5) {
            int x = r.nextInt(36) + 1; // zeby losowalo od 1
            System.out.println("Wylosowano " + x);
            setStrr.add(x);
        }

        // kolejnosc wyswietlania seta moze byc rozna niz kolejnosc w jakiej zostaly dodane do seta elementy
        for (Integer i : setStrr) {
            System.out.println(i);
        }
        // sprawdzamy czy wyloswalo nam liczbe 5
        System.out.println(setStrr.contains(5));

        //KONWERTOWANIE KOLEKCJI DO LISTY
        List<Integer>intList=new ArrayList<>();
        intList.addAll(setStrr);

        System.out.println("Lista po dodaniu do niej seta");
        for (int i=0;i<intList.size();i++){
            System.out.println(intList.get(i));
        }
    }
}
