package pl.sda.javastart.Programowanie;

//Zadeklaruj i zainicjalizuj tablice intow o wielkosci podanej przez uzytkownika.Wypelnij ja wartosciami losowymi. Sprawdz czy wczytany
//ciag jest posortowany(nierosnacy lub niemalejacy)

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class zadanie6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(losowaTablica(6)));
        Arrays.sort(losowaTablica(6));

    }
    private static int[] losowaTablica(int howlong) {
        int[] tab = new int[howlong];
        Random random = new Random();
        for (int i = 0; i < howlong; i++) {
            tab[i] = random.nextInt(20);
        }
        return tab;
    }
}