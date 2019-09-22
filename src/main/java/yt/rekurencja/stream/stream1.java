package yt.rekurencja.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Intermediate operations
//anyMatach(),distinct, filter,findFirst,flatmap,map,skip,sorted
// terminal operation - forEach
//collect saves the element into a collection
public class stream1 {
    public static void main(String[] args) throws IOException {

        System.out.println("1.Stream liczby od 1-10");
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("2.Stream liczby ze skip od 5 w gore");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("3.Stream z sumą");

        int sum = IntStream
                .range(1, 5)
                .sum();
        System.out.println(sum);
        System.out.println();

        System.out.println("4.Stream.of sorted and findFirst");
// sortuje albabetycznie i wyswietla pierwszy element
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("5.Stream from Array,sort filter and print");
        String[] names = {"Sara", "Adam", "Sylwia", "Szymon", "Ewa"};
        Arrays.stream(names)   // to samo moglismy zrobic Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("6.Average of squares of an int array");
        // int[]number={2,4,6,8,10};
        // Arrays.stream(number)
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        System.out.println("7.Stream from List,filter and print");
        List<String> people = Arrays.asList("Al", "Adam", "Damian", "arut");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("8.Stream rows from text file,sort,filter,adn print");
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\xxx\\Desktop\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 10)
                .forEach(System.out::println);
        bands.close();

        System.out.println("9.Stream rows from text file and save to List");
        List<String> bands2 = Files.lines(Paths.get("C:\\Users\\xxx\\Desktop\\bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList()); //collect zapisuje do listy i bedzeimy mogli z niej korzystac pozniej
       bands2.forEach(x -> System.out.println(x));  // koolejny stream bo sa 2 operacje konczace
        System.out.println(bands2);


        System.out.println("9.Stream rows from CSV file and count");
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\xxx\\Desktop\\numbers.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();






    }
}
