package pl.sda.javastart.Programowanie4.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cwiczenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote:");
        double kwota = scanner.nextDouble();

        System.out.println("Wybierz swoja narodowsc");
        List<String> nationality = new ArrayList<>();
        nationality.add("Poland");
        nationality.add("Spain");
        nationality.add("Russian");

  //      nationality.forEach(x-> System.out.println(x));  // to samo co nizej
        for (String s : nationality) {
            System.out.println(s);
        }
        String blink = scanner.nextLine();
        String yourNationality = scanner.nextLine();

        if (yourNationality.equals("Poland")) {
            System.out.println(kwota*0.23);
        }
        if (yourNationality.equals("Spain")) {
            System.out.println(kwota * 0.11);
        }
        if (yourNationality == "Russia") {
            System.out.println(kwota * 0.2);
        }
    }
}