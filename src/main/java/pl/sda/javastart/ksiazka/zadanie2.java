package pl.sda.javastart.ksiazka;

import java.util.Scanner;

public class zadanie2 {
    public static class ZadaniaKsiazka {
        public static void main(String[] args) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Czy trojkat jest prostokatny?");
            System.out.println("podaj bok Computerr trójkąta ");
            int a = scanner1.nextInt();
            System.out.println("podaj bok b trójkąta");
            int b = scanner1.nextInt();
            System.out.println("podaj bok c trojkata");
            int c = scanner1.nextInt();

            if ((a * a + b * b) == c * c) {
                System.out.println("tak trojkat jest prostokatny!!!");
            } else {
                System.out.println("Nie trojkat nie jest prostokatny!!!");
            }
        }
    }
}

