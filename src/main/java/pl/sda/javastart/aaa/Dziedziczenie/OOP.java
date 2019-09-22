package pl.sda.javastart.aaa.Dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {

        StudentoDzienny sd = new StudentoDzienny();
        sd.name = "Jan";
        sd.lastName = "Kowalski";
        System.out.println(sd.name + sd.lastName);
        sd.obecnoscNaWykladzie();
        sd.komunikat();

        StudentoZaoczny sz = new StudentoZaoczny();
        sz.name = "Adam";
        sz.lastName = "Nowak";
        System.out.println(sz.name + sz.lastName);
        sz.obecnoscNaWykladzie();

        StudentoOnline so = new StudentoOnline();
        so.name = "Kuba";
        so.lastName = "Kubacki";
        System.out.println(so.name + so.lastName);
        so.obecnoscNaWykladzie();

        // dziediczy po studencieDziennym
        StudentoDziennyInny sdi = new StudentoDziennyInny();
        sdi.komunikat();
        sdi.obecnoscNaWykladzie();

        Studento stud1 = new StudentoOnline();
        stud1.obecnoscNaWykladzie();
        Studento stud2 = new StudentoZaoczny();
        stud2.obecnoscNaWykladzie();
        Studento stud3 = new StudentoDzienny();
        stud3.obecnoscNaWykladzie();

        List<Studento> list= new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        System.out.println(list);


    }
}
