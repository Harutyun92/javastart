package a1;

import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class abc {
    public static void main(String[] args) {

        Integer[] revTab={1,2,3,4,5,5,6};
        reverse(revTab);

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i+1;
        }
        System.out.println(Arrays.toString(tablica));


        int sum = 0;
        for (int i = 0; i < tablica.length; i++) {
            sum = sum + tablica[i];
        }
        System.out.println(sum);


    }
        public static void reverse(Integer []revTab){
            Collections.reverse(Arrays.asList(revTab));
            System.out.println(Arrays.asList(revTab));
        }
}


