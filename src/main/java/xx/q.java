package xx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp;

        int[] array1 = new int[5];
        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Podaj liczbe");
            temp = scanner.nextInt();
            array1[i] = temp;
            array2[(array1.length - 1) - i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}