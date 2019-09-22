package pl.sda.javastart.HomeWork;

import java.util.Scanner;

public class HomeWorkZ20JezykiPowitanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj język w jakim chcesz otrzymac powitanie: ");
        String powitanie = scanner.next();

        switch (powitanie) {
            case "PL":
                System.out.println("Dzień dobry. Witam serdecznie");
                break;
            case "ENG":
                System.out.println("Good morning. Welcome!");
                break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue!");
                break;
            default:
                System.out.println("Nie ma takiego powitania "+ "\n"+"Good morning. Welcome!");
                break;

        }
    }
}
