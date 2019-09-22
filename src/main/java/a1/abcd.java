package a1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class abcd {
    public static void main(String[] args) {

        int[]tablica={1,2,6,2,4,1,7,9};


        Arrays.stream(tablica)
                .distinct()
                .forEach(a-> System.out.println(a));
    }
}
