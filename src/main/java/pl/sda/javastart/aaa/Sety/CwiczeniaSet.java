package pl.sda.javastart.aaa.Sety;
//kolekcja ktora nie powazala umieszczac dublikatow

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CwiczeniaSet {
    public static void main(String[] args) {
        Set<String>setStr=new HashSet<>();
        setStr.add("jeden");
        setStr.add("dwa");
        setStr.add("trzy");
        setStr.add("jeden");
        setStr.add("cztery");
        setStr.add("piec");
        for (String s : setStr) {
            System.out.println(s);
        }


    }
}
