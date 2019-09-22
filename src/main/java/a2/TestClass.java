package a2;

import java.util.Arrays;

public class TestClass {


    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", " pig", "dog", null, "parrot"};


    public static void main(String[] args) {
        stream1();
    }

    private static void stream1() {
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                System.out.println(animal);
            }
        }
        System.out.println("Teraz stream");
        Arrays.stream(animals)
                .filter(a->a!=null)
                .map(e->e.trim())
                .filter(a -> a.length() >= 4)
                .distinct()
                .sorted()
                .forEach(a -> System.out.println(a));
    }
}


