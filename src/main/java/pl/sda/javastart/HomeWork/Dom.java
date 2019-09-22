package pl.sda.javastart.HomeWork;

import java.util.Arrays;

public class Dom {
    public static void main(String[] args) {

        int[] table = new int[5];
        table[0] = 1;
        table[1] = 2;
        int[] anotherTable = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(anotherTable));

        int[] table1 = new int[7];
        for (int i = 0; i < table1.length; i++) {
            table1[i] = i + 1;

        }
        System.out.println(Arrays.toString(table1));
    }
}

