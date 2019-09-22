package pl.sda.javastart.HomeWork;

import java.util.Scanner;

public class HomeWorkZ19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz dwie liczby na ktorych beda wykonywane dzialania ");
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Wybierz + albo - lub koniec");
        String obliczenie = scanner1.next();


        switch (obliczenie) {
            case "+":
                System.out.println(firstValue + secondValue);
                break;
            case "-":
                System.out.println(firstValue - secondValue);
                break;
            case"koniec":
                System.out.println("koniec");
                break;
        }
    }
}
