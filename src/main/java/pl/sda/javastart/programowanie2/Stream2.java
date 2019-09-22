package pl.sda.javastart.programowanie2;
// przepuszczamy jakis int przez metodke i mamy zwrocic string

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream2 {

    public void test() {
        Stream2.mapToString(1);
    }

    public static void main(String[] args) {
        String str = IntStream.range(0, 20)
                .mapToObj(c -> mapToString(c))
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(str);
    }

    public static String mapToString(int i) {
        return String.format("'%d'", i);

    }
}
