package pl.sda.javastart.aaJavaStart.aStatic.Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;
        try {                        //w bloku try umieszczamy kod ktory moze sprawic klopot czyli np jak zamiast liczby podamy napis
            number = sc.nextInt();
            System.out.println("Wczytano poprawną liczbę");
        } catch (InputMismatchException ex) {   // jesli uzytkownik wprowadzi bledna dana to trafiamy do bloku catch zeby wylapac wyjatek, w nawiasie wstawiamy nasza blad i dajemy nazwe ex
            System.err.println("Podana wartość nie jest liczbą całkowitą"); // err dziala tak samo jak out tylko ze kod jest wyrozniony na czerwono
            ex.printStackTrace();
        }
        System.out.println("Podałeś: " + number);
        sc.close();
    }

}
