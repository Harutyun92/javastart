package pl.sda.javastart.aaJavaStart.aStatic.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = sc.nextInt();
                sc.nextLine(); //w celu pozbycia się znaku nowej linii z bufora

                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]); //dzięki temu ktoś może podać liczbę w ludzkiej formie, WartoscAbsolutna nie liczonej od 0.
                error = false;
            } catch (InputMismatchException ex) { //jeśli użytkownik wprowadzi zamiast liczby np. tekst, rzucony będzie wyjątek InputMismatchException,
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
                sc.nextLine();//w celu pozbycia się znaku nowej linii z bufora
            } catch (ArrayIndexOutOfBoundsException ex) { //jeśli użytkownik poda jako indeks liczbę inną niż 1 lub 2, to przy odwoływaniu się do tablicy otrzymamy wyjątek ArrayIndexOutOfBoundsException.
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
                sc.nextLine();//w celu pozbycia się znaku nowej linii z bufora
            }
        } while (error);
        sc.close();
    }
}
