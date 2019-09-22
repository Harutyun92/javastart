package pl.sda.javastart.Programowanie4.Tax.Totolotek;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LottoCwiczenie {
    public static void main(String[] args) {

        start();

    }

    private static void start() {
        System.out.println("Wybierz gre");
        System.out.println("1.Szczesliwy numerek");
        System.out.println("2.Duzy lotek");
        System.out.println("3.Koniec");

        Scanner scanner = new Scanner(System.in);
        int choosen = scanner.nextInt();

        if (choosen == 1) {
            twojSzczesliwyNumerek();
        }
        if (choosen == 2) {
            totolotek();
        }
        if (choosen == 3) {

        }
    }

    public static void twojSzczesliwyNumerek() {
        int twojSzczesliwyNumerek;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj jedna liczbe od 0-12");
        twojSzczesliwyNumerek = scanner.nextInt();
        if (twojSzczesliwyNumerek < 0 || twojSzczesliwyNumerek > 12) {
            System.out.println("Podales niepoprawna cyfre podaj inna");
        }
        Random random = new Random();
        int wylosowanySzczesliwyNumerek = random.nextInt(12);
        System.out.println("Wylosowany szczeliwy numerek to; " + wylosowanySzczesliwyNumerek);
        if (twojSzczesliwyNumerek == wylosowanySzczesliwyNumerek) {
            System.out.println("Gratulacje, wygrales!!");
        } else {
            System.out.println("Niestety nie zgadales, sprobuj jeszcze raz");
        }
        start();
    }

    public static void totolotek() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 liczb z przedziału od 0 do 12");
        ArrayList<Integer> myNumbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            number = scanner.nextInt();
            if (number > 0 || number <= 49) {
                myNumbers.add(number);
            }
            if (number > 49) {
                System.out.println("Podales zla liczbe , wybierz inna");
                number = scanner.nextInt();
            }
        }
        System.out.println("Twoje wybrane liczby to:" + myNumbers);

        Random random = new Random();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lottoNumbers.add(random.nextInt(12));
        }
        System.out.println("Wylosowane liczby to: " + lottoNumbers);
        start();
    }
}
