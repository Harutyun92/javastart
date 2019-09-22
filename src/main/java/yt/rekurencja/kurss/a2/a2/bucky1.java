package yt.rekurencja.kurss.a2.a2;

public class bucky1 {
    public static void main(String[] args) {

        String s = "buckyrobertsbuckyrobers";

        // znajduje pierwsza litere k po indeksie , jesli damy drugi parametr 5 to szuka od 5 dalej
        System.out.println(s.indexOf('k', 5));

        // pokazuje od kad zaczyna sie rob, jesli damy drugi parametr np 10 to po 10 indeksie zaczyna szukac
        System.out.println(s.indexOf("rob"));


        String a = "Bacon ";
        String b = "monster";
        String c= "    monster   ";

// konkatenacja stringu czyli dodawanie , mozemy napisac a+b ale tez tak jak nizej
        System.out.println(a.concat(b));

    // replace , zmiana B na F
        System.out.println(a.replace('B','F'));

        // to uppercase
        System.out.println(b.toUpperCase());

        //trim
        System.out.println(c.trim());

    }
}
