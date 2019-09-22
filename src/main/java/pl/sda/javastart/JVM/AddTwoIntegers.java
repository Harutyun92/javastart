package pl.sda.javastart.JVM;

import java.util.Arrays;

public class AddTwoIntegers {
    public static void main(String[] args) {

        int []tablica = new int[11];
        for (int i = 1; i <tablica.length ; i++) {
            tablica[i]=i;

       //     System.out.println(i);
        }

        System.out.println(Arrays.toString(tablica));
        int sum=0;
        for (int i = 0; i <tablica.length ; i++) {
            sum = sum + tablica[i];
        }
            System.out.println(sum);
        }
    }

