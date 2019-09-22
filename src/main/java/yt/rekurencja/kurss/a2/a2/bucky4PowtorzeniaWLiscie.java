package yt.rekurencja.kurss.a2.a2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class bucky4PowtorzeniaWLiscie {
    public static void main(String[] args) {


        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //add array items to list
        for (String x : things)
            list1.add(x);
        System.out.println(list1);

        String[] morethings = {"lasers", "hats", "abc"};
        List<String> list2 = new ArrayList<String>();

        //add array items to list
        for (String y : morethings)
            list2.add(y);

        // drukowanie listy 1
        System.out.println("WYswietlenie listy1");
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        editlist(list1, list2);
        System.out.println();

        System.out.println("Usuniecie z listy1 elementow ktore sie powtrzaja w liscie2");

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editlist(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();  // przechodzi przez kazdy element list iterator,
        while (it.hasNext()) { // idz do czasu do poki nie dojdzeisz do konca list
            if (l2.contains(it.next()))   //sprawdzamy czy te elementy sprawdzane wyzej znajduja sie w liscie2
                it.remove();        // usuwa wszystkie elementy z list 1 ktore znajduja sie rowniez w liscie 2
        }
    }
}