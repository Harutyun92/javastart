package yt.rekurencja.kurss.a2.a2;


import java.util.Arrays;
import java.util.LinkedList;

// zmiana tablicy na liste i odwrotnie
public class bucky6 {
    public static void main(String[] args) {

        //tworzymy tablice
        String[]stuff = {"babies","watermelon","melons","fudge"};

        //zmiana naszej tablicy na liste
        LinkedList<String>thelist= new LinkedList<String>(Arrays.asList(stuff));

        //robimy metody ktore sa mozliwe na liscie
        thelist.add("pumpkin");
        thelist.addFirst("firstthing");

        //zmiana listy z powrotem na tablice
        stuff=thelist.toArray(new String[thelist.size()]);

        for (String s : stuff) {
            System.out.println(s);
        }
        for (String a : thelist) {
            System.out.printf("%s ", a);
        }
    }
}
