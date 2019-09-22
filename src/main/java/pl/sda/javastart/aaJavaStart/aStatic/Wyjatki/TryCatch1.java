package pl.sda.javastart.aaJavaStart.aStatic.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;
//Program można jeszcze usprawnić i prosić użytkownika o podanie wartości, dopóki nie będzie ona poprawna.
// W tym celu dodajemy pętlę z prostą flagą typu boolean, która pozwoli określić, czy już poprawnie wczytano liczbę
public class TryCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;
        boolean error = true; // Ponieważ korzystamy z pętli do while to pętla wykona się przynajmniej raz.
        // Jeżeli ktoś poda prawidłową wartość, to ustawiamy zmienną error na false i pętla nie wykona się ponownie.
        do {
            try {
                number = sc.nextInt();
                error = false; // Jeśli ktoś poda np. napis zamiast liczby, to wiersz error = false; się nie wykona, bo sterowanie zostanie przeniesione do bloku catch. Tym samym w przypadku podania błędnej wartości zmienna error cały czas będzie miała wartość true i pętla będzie się powtarzać.
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
                sc.nextLine(); // metodę nextLine(). Jest to konieczne, ponieważ chcemy pozbyć się z bufora konsoli błędnej wartości, którą wprowadził użytkownik.
            }
        } while (error);
        System.out.println("Podałeś: " + number);
        sc.close();
    }
}
