package pl.sda.javastart.Programowanie4.Tax.Totolotek;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoBartek {
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("Wybierz w co chcesz zagrać:");
        System.out.println("1. Twój szczęśliwy numerek.");
        System.out.println("2. Totolotek.");
        System.out.println("3. Koniec.");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        if (choose == 1) {
            twojSzczesliwyNumerek();
        }
        if (choose == 2) {
            totolotek();
        }
        if (choose == 3) {
            System.out.println("Koniec gry ");
        }
    }

    public static void twojSzczesliwyNumerek() {
        int twojSzczesliwyNumerek;
        do {
            System.out.println("Podaj swoją liczbę od 0 do 12:");
            Scanner scanner = new Scanner(System.in);
            twojSzczesliwyNumerek = scanner.nextInt();
        } while (twojSzczesliwyNumerek < 0 || twojSzczesliwyNumerek > 12);

        System.out.println("Twój szczęśliwy numerek to " + twojSzczesliwyNumerek);
        Random random = new Random();
        int szczesliwyNumerek = random.nextInt(12);
        System.out.println("Wylosowany Szczęśliwy Numerek to " + szczesliwyNumerek);

        if (twojSzczesliwyNumerek == szczesliwyNumerek) {
            System.out.println("Gratulacje, wygrałeś!");
        } else {
            System.out.println("Nie trafiłeś.");
        }
        menu();
    }

    public static void totolotek() {

        Scanner scanner = new Scanner(System.in);
        int myNumber;
        System.out.println("Podaj 6 liczb z przedziału od 0 do 12.");
        ArrayList<Integer> myNumbers = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {

            myNumber = scanner.nextInt();

            if (myNumber < 0 || myNumber > 12) {
                do {
                    System.out.println("Podaj liczbę w przedziale 0 - 12.");
                    myNumber = scanner.nextInt();

                } while (myNumber < 0 || myNumber > 12);

            }
            myNumbers.add(myNumber);
        }

        System.out.println("Twoje liczby to:" + myNumbers);

        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            lottoNumbers.add(random.nextInt(12));
        }
        System.out.println("2. Wylosowane liczby to: " + lottoNumbers);

        menu();

    }
}
