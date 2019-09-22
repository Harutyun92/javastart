package pl.sda.javastart.aaJavaStart.aStatic.Petle;
//Zadaniem użytkownika będzie zgadnięcie liczby, którą zainicjujemy w programie. W przypadku, gdy liczba będzie za duża lub za mała,
// użytkownik otrzyma odpowiednią podpowiedź. Wykorzystajmy od razu pętlę while.

import java.util.Scanner;

public class whilee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = 50;
        int userInput;
        System.out.println("Zgadnij liczbe");
        while ((userInput = scanner.nextInt()) != number) {
            if (userInput > number) {
                System.out.println("Podales wieksza liczbe niz napisana");
            } else {
                System.out.println("Podana liczba jest za mala zgaduj dalej");
            }
        }
        System.out.println("Brawo zgadles liczbe");
    }
}
