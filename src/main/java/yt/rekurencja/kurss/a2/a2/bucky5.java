package yt.rekurencja.kurss.a2.a2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class bucky5 {
    public static void main(String[] args) {

        String[] things = {"apples", "noobs", "pwnge", "bacon", "goATs"};
        List<String> list1 = new LinkedList<String>();

        for (String x : things) {
            list1.add(x);
        }
        String[] things2 = {"sasusage", "bacon", "goats", "hairypotter"};
        List<String> list2 = new LinkedList<String>();
        for (String y : things2) {
            list2.add(y);
        }
        list1.addAll(list2);  // dodajemy do listy1 to co jest w liscie2
        list2 = null;    // nie potrzebujemy juz listy dwa wiec piszemy ze jest nullem

        System.out.println("Lista1 polaczona z Lista2");
        printMe(list1);
        System.out.println("Lista1 z usunietymi elementami 2-5");
        removeStuff(list1, 2, 5);
        printMe(list1);
        System.out.println("Odwrocona lista");
        reverseMe(list1);
    }

    // printMe method
    private static void printMe(List<String> l) {
        for (String s : l)
            System.out.printf("%s ", s);
            System.out.println();
    }

    // removeStuff method

    private static void removeStuff(List<String> l, int from, int to) {
        l.subList(from, to).clear();

    }
        //reverseMe
    private static void reverseMe(List<String>l){
        System.out.println("Odwrocona lista");
        ListIterator<String>bobby=l.listIterator(l.size());  // chcemy iterowac po liscie i zeby zwracalo od konca mozemy sprawdzic ile jest elemtnow w liscie i wstawic koncowy indeks lub napisac l.size to zrobi od konca od ostatniego elementu
   while(bobby.hasPrevious())   // od konca lecimy wiec sprawdzamy previous wczesniejsze elementy
       System.out.printf("%s ", bobby.previous());
    }
}

