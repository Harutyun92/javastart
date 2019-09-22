package yt.rekurencja.kurss.a2.a2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Set nie ma w sobie dublikatow
public class bucky12HashSet {
    public static void main(String[] args) {

      String[] things = {"apple","bob","ham","bob"};

       // zamieniamy tablice na liste
        List<String> list= Arrays.asList(things);
        //wyswietlamy liste
        System.out.printf("%s ", list);
        System.out.println();


//zamieniamy liste na seta zeby nie bylo dublikatow
        Set<String> set = new HashSet<String>(list);   // podajemy w nawiasie liste bo ja chcemy zamienic na seta
        System.out.printf("%s", set);
    }
}
