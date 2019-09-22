package pl.sda.javastart.day2;

import java.util.Scanner;

public class ForsExampleBreakeContinue {
    public static void main(String[] args) {  //Pair piszemy 4 razy imie Adam
        for (int i = 0; i < 4; i++) {            // od 0 do 4 sa cztery przeskoki 0 1 2 3 , moze byc i=5 ; i < 9
            System.out.println("Adam");
        }

        printFewNatura1Numbers(4);   // to piszemy na samym koncu
        prinNumbersWithoutDividableByParam(3);  // to piszemy na samym koncu
        sumNaturalNumbersToLimit(1000);          // to piszemy na samym koncu
    }

    // Pair printFewNaturalNumbers - wyswietlenie kolejnych liczb naturalnych z wybranego zakresu

    public static void printFewNatura1Numbers(int endNumber) {  // jest void bo nic nie chcemy zwracac
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);
        }
        //printCubesOfNumbers - wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów
        int number;
        int square;
        int cube;

        System.out.println("Number\tSquare\tCube");

        for (number = 1; number < 11; number++) {
            square = number * number;//
            cube = number * square;
            System.out.println(number + "\t"+"\t" + square + "\t\t" + cube);
        }
        //countdown - odliczanie w dół po podaniu liczby startowej
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
        //printMultiplications - wypisanie wyników mnożenia podanej liczby przez kolejne liczby całkowite do tej liczby włącznie
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = scanner.nextInt();
        for (int i = 1; i <= 7; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void prinNumbersWithoutDividableByParam(int param) {  // param - parametr , zadanie wypisz liczby od 0-10 , poza tymi podzielnymi przez 3
        System.out.println("Parametr = " + param);
        for (int i = 0; i <= 10; i++) {
            if (i % param != 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 10; i++) {                  // to samo druga metoda
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void sumNaturalNumbersToLimit(int limit) { // wynik jaki uzyskamy z sumowania liczb ma byc mniejszy niz 1000
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i >= limit) {
                break;                           // instrucja break przerywa dana pentle nie cala metode
            }
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
