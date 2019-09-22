package codingWars.LaczenieTablic;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Zadanie1 {
      public static void main(String[] args) {

          int[]first=new int[]{1,2,3};
          int[]second=new int[]{4,5,6,3,2};

          System.out.println(Arrays.toString(mergeArrays(first,second)));
      }

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream.concat(IntStream.of(first),IntStream.of(second))
                .distinct()
                .sorted()
                .toArray();

    }
}

