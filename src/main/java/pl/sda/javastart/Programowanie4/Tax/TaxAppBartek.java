package pl.sda.javastart.Programowanie4.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxAppBartek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę:");

        double kwota = scanner.nextInt();

        System.out.println("Wybierz swoją narodowość:");

        List<String> nacionality = new ArrayList<>();

        nacionality.add("Polak");
        nacionality.add("Rosjanin");
        nacionality.add("Hiszpan");
        nacionality.add("Szwed");

        for (String e : nacionality) {
            System.out.println(e);
        }

        String blind = scanner.nextLine();

        String YourNationality = scanner.nextLine();

        if (YourNationality.equals("Polak") || YourNationality.equals("polak")) {
            kwota = kwota + (kwota * 0.23);
            System.out.println("Wybrałeś polsą narodowość, Twój podatek wynosi " + kwota * 0.23 + ".");

        }

        if (YourNationality.equals("Rosjanin") || YourNationality.equals("rosjanin")) {
            kwota = kwota + (kwota * 0.23);
            System.out.println("Wybrałeś narodowość rosyjską. Twój podatek wynosi " + kwota * 0.10 + ".");
        }
        if (YourNationality.equals("Hiszpan") || YourNationality.equals("rosjanin")) {
            kwota = kwota + (kwota * 0.23);
            System.out.println("Wybrałeś narodowość Hiszpańską, Twój podatek wynosi " + kwota * 0.29 + ".");
        }
    }
}
