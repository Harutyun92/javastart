package pl.sda.javastart.aaa;

import java.util.Arrays;
import java.util.Collections;

public class UzupelnianieTablicyiListy {
    public static void main(String[] args) {
        Integer[] tab=new Integer[]{1,2,3,4,5};
        reverse(tab);



        int[] tablica = new int[11];
        for (int i = 1; i < tablica.length; i++) {
            tablica[0]=1;
            tablica[i] = i;

            //     System.out.println(i);
        }

        System.out.println(Arrays.toString(tablica));
        int sum = 0;
        for (int i = 0; i < tablica.length; i++) {
            sum = sum + tablica[i];
        }
        System.out.println(sum);
    }
    static void reverse(Integer []a) {

        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}
