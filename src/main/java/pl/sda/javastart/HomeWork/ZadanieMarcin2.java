package pl.sda.javastart.HomeWork;

import java.util.Scanner;

public class ZadanieMarcin2 {
    public static void main(String[] args) {

        System.out.println("Program oblicza pole kwadratu jesli wcisniemy 1 lub pole prostokata jesli wcisniemy 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz liczbe 1 lub 2");
        int liczba = scanner.nextInt();
        if (liczba == 1) {
            System.out.println("Wybierz bok Computerr");
            int a = scanner.nextInt();
            System.out.println("Pole kwadratu = " + a * a);
        } else {
            System.out.println("Wybierz bok Computerr");
            int a = scanner.nextInt();
            System.out.println("Wybierz bok b");
            int b = scanner.nextInt();
            System.out.println("Pole prostokąta = " + ((2 * a) + (2 * b)));
        }
    }
}

