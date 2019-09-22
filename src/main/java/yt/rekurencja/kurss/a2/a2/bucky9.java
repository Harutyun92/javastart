package yt.rekurencja.kurss.a2.a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bucky9 {
    public static void main(String[] args) {

        //convert stuff array to list
        String[]stuff = {"apples","beef","corn","ham"};

        // tablcie zamieniami na list
        List<String> list1 = Arrays.asList(stuff);

        //tworzymy nowa liste i dodajemy do niej elementy
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("allegro");

        for (String s : list2) {
            System.out.printf("%s ",s);
        }

        // dodajemy do listy2 elementy z tablicy stuff
        Collections.addAll(list2,stuff);

        System.out.println();
        for (String s : list2) {
            System.out.printf("%s ", s);
        }
        System.out.println();

        // metoda frequency mowi nam ile razy dany element wystepuje w liscie
        System.out.println(Collections.frequency(list2,"google"));

        // sprawdze dwie listy i zwraca true jest nie maja nic wspolnego

        boolean trueOrFalse = Collections.disjoint(list1,list2);

        System.out.println(trueOrFalse);

if(trueOrFalse)
    System.out.println("these list dont have anything in common");
else
    System.out.println("these list must have somthing in common");
    }
}
