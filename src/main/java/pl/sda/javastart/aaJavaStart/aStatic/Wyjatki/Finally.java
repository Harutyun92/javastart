package pl.sda.javastart.aaJavaStart.aStatic.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

// W naszym kodzie w różnych blokach catch na końcu dodawaliśmy wywołanie metody nextLine na obiekcie Scanner,
// w celu pozbycia się znaku nowej linii z bufora. Zamiast zapisywać go kilka razy, dla różnych typów wyjątków,
// lepiej jest przenieść to wywołanie do bloku finally:
public class Finally {
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
                sc.nextLine();

                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println("Liczba:" + numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
            } finally {
                sc.nextLine(); //wykona się zawsze, niezależnie, czy wyjątki wystąpią, czy nie
            }
        } while (error);
        sc.close();
    }
}
