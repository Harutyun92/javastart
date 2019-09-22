package codingWars.LaczenieTablic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class vv {
    public static void main(String[] args) {
        //     System.out.println(Arrays.toString(2,4));
      //  System.out.println(sum1(int[5,4]));
    }

    public static int summ(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }

        return 0;
    }

    public static int sum1(int[] arr) {
        return IntStream.of(arr)
                .filter(x -> x > 0).sum();
    }
}
