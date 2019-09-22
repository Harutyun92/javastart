package yt.rekurencja.kurss.a2.a2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bucky8 {
    public static void main(String[] args) {


        //create an array and convert to list

        Character[] ray = {'p' , 'w', 'n'};

        List<Character> l = Arrays.asList(ray);
        System.out.println("List is: ");
        output(l);

        // reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);

        //create new array and new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        //chcemy skopiowac to tej listy co teraz zrobilismy to co bylo wyzej w innej liscie
        Collections.copy(listCopy, l);
        System.out.println("Copy of list : ");
        output(listCopy);

        // fill collection with crap , uzupelnianie kolekcji czyms co wczesniej tam nie bylo
        Collections.fill(l, 'X'); // chcemy kazdy element list l zmienic na X
        System.out.println("AFter filling the list: ");
        output(l);
    }

    // output method
    private static void output(List<Character> thelist) {
        for (Character thing : thelist)
            System.out.printf("%s", thing);
        System.out.println();
    }
}
