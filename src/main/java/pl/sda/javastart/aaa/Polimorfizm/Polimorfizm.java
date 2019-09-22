package pl.sda.javastart.aaa.Polimorfizm;

import pl.sda.javastart.aaa.Dziedziczenie.*;

public class Polimorfizm {
    public static void main(String[] args) {
// dzieki polimorfizmowi mozemy stworzyc tabelo studento i wrzuc wszystkich studentow do nich bo dziedzicza one po studento
        // jesli napiszemy polimorfizm i studneto s = new studentDzienny i bedziemy chceili odwoalc sie do metody ktora znajduje sie tylko w studencieOnline bedziemy musieli zrobic zrzutowanie ((StudentDzienny)s).komunikat();
        Studento[] studentTable=new Studento[4];

        studentTable[0]=new StudentoDzienny();
        studentTable[1]=new StudentoZaoczny();
        studentTable[2]=new StudentoOnline();
        studentTable[3]=new StudentoDziennyInny();

        for (int i = 0; i <studentTable.length ; i++) {
            studentTable[i].obecnoscNaWykladzie();
        }

        Studento s= new StudentoOnline();

        wezStudenta(s);
    }
    // mozemy stworzyc metode i przekazac jako agrument glowna klase Studento i potem swotrzyc obiekt ktory po nim dziedziczy i przekazac do niego metode
    public static void wezStudenta(Studento s){
        s.obecnoscNaWykladzie();
    }
}
