package pl.sda.javastart.Programowanie;

// zadeklaruj i zainicjalizuj tablice longow o wielkosci podanej przez uzytkownika. wypelnij ja wartosciami ciagu fibonacciego

import java.util.Arrays;
import java.util.Random;

public class fibonacciTablica {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(fibonacci(9)));
        System.out.println(Arrays.toString(losowaTablica(6)));

        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] tab2 = new int[]{2, 3, 5, 4};

    }

    private static long[] fibonacci(int a) {
        long[] tab = new long[a];
        for (int i = 0; i < tab.length; i++) {
            if (i < 2) {
                tab[i] = 1;
            } else {
                tab[i] = tab[i - 2] + tab[i - 1];
            }
        }
        return tab;
    }
    // zadeklaruj i zainicjalizuj tablice intow o wielkosci podanej przez uzytkownika , wypelnij ja wartosciami losowymi z przedzialu


    private static int[] losowaTablica(int howlong) {
        int[] tab = new int[howlong];
        Random random = new Random();
        for (int i = 0; i < howlong; i++) {
            tab[i] = random.nextInt(20);
        }
        return tab;
    }

    // napisz metode pobierajaca dwie tablice jako argument. jako wynik zwraca ona jedna tablice ktorej elementy sa suma wartosci na
    // tych samych indeksach. tablice te nie musza byc rownej wielkosci.
    private static int[] sumTab(int[] a, int[] b) {
        int[] sum;
        boolean aGreater = a.length > b.length ? true : false;
        sum = new int[aGreater ? a.length : b.length];
        for (int i = 0; i < sum.length; i++) {
            if (aGreater) {
                if (i < b.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = a[i];
                }
            } else {
                if (i < a.length) {
                    sum[i] = a[i] + b[i];
                } else {
                    sum[i] = b[i];
                }
            }
        }
        return sum;
    }
}