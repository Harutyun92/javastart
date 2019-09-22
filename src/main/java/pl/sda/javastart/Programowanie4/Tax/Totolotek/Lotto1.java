package pl.sda.javastart.Programowanie4.Tax.Totolotek;
import org.apache.commons.lang3.RandomUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lotto1 {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> chosenList = new ArrayList<>();


    public static void main(String[] args) {
        start();
    }

    private static void comparingToChosen() {
        List<Integer> randomList = IntStream.range(0,6)   // wylosuje nam 6 liczb
                .mapToObj(e -> RandomUtils.nextInt(1,12))
                .collect(Collectors.toList());

        long commonNumbers = chosenList.stream()
                .filter(i -> randomList.contains(i))
                .count();
        System.out.println("Today's numbers are " + randomList.toString());
        System.out.println("You hit " + commonNumbers + " numbers!");
    }

    public static void start(){
        enteringNumbers();
        comparingToChosen();
    }

    private static void enteringNumbers() {
        int chosenNumber;
        System.out.println("Enter 6 numbers from 1 to 12");
        System.out.println("Enter 1st number");
        chosenNumber=scanner.nextInt();
        while (!validateNumber(chosenNumber)) {
            chosenNumber = scanner.nextInt();
        }
        System.out.println("Enter 2nd number");
        chosenList.add(scanner.nextInt());
        System.out.println("Enter 3rd number");
        chosenList.add(scanner.nextInt());
        System.out.println("Enter 4th number");
        chosenList.add(scanner.nextInt());
        System.out.println("Enter 5th number");
        chosenList.add(scanner.nextInt());
        System.out.println("Enter 6th number");
        chosenList.add(scanner.nextInt());
        System.out.println("Your numbers are: " + chosenList.toString());
    }

    private static boolean validateNumber(int chosenNumber){
        return chosenNumber <13 && chosenNumber > 0;
    }
}
