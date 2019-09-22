package a1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Class {
    public static void main(String[] args) {

        int[] tab1 = {1, 2, 3};
        int[] tab2 = {1, 2, 4};
        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab2.length; i++) {
            tab3[i] = tab1[i] + tab2[i];
        }
        System.out.println(Arrays.toString(tab3));
    }
}