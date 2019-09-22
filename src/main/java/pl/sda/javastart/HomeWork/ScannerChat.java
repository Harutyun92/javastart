package pl.sda.javastart.HomeWork;

import java.util.Scanner;

public class ScannerChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czesc jak sie czujesz ?");
        String care = scanner.nextLine();
        System.out.println("Ciesze sie ze sie czujesz, dobrze");
        System.out.println("Jak masz na imie? ");
        String name = scanner.nextLine();
        System.out.println("Ile masz lat? ");
        String age = scanner.nextLine();
        System.out.println(name + " masz " + age + " lat");
        System.out.println("Ile masz wzrostu? ");
        String hight = scanner.nextLine();
        System.out.println(name + " masz " + hight + " cm");
        System.out.println("A jak sie czujesz teraz");
        String care2 = scanner.nextLine();
        System.out.println("Ciesze sie ze sie czujesz" + care2);

    }
}
