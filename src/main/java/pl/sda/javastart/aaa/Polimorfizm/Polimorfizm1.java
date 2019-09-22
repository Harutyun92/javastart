package pl.sda.javastart.aaa.Polimorfizm;

import pl.sda.javastart.aaa.Dziedziczenie.Studento;
import pl.sda.javastart.aaa.Dziedziczenie.StudentoDzienny;
import pl.sda.javastart.aaa.Dziedziczenie.StudentoOnline;

public class Polimorfizm1 {
    public static void main(String[] args) {

        ObsluzStudenta s= new ObsluzStudenta();
        StudentoOnline so=new StudentoOnline();
        StudentoDzienny sd= new StudentoDzienny();

        s.obsluz(so);
        s.obsluz(sd);

    }
}
class ObsluzStudenta{
    public void obsluz(Studento s){
        s.obecnoscNaWykladzie();
    }
}