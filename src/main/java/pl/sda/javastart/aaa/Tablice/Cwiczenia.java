package pl.sda.javastart.aaa.Tablice;

import java.util.Arrays;

public class Cwiczenia {
    public static void main(String[] args) {
        int[] a = {6, 1, 7};
        int[] b = {5, 3, 8};
        int[] c = new int[b.length];
        for (int i = 0; i < c.length; i++) {

            c[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(c));

        int[] tab1 = {2, 3, 4, 5};

        tab1 = Arrays.copyOf(tab1, tab1.length + 1);

        System.out.println(Arrays.toString(tab1));

    }
}
