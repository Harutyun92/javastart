package pl.sda.javastart.XkolkoiKrzyzyk;

import pl.sda.javastart.aaJavaStart.aStatic.Scanner.scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class aa {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> tablica = new ArrayList<>();

        tablica.add("7");
        tablica.add("|");
        tablica.add("8");
        tablica.add("|");
        tablica.add("9");
        tablica.add("---");
        tablica.add(" ");
        tablica.add("---");
        tablica.add(" ");
        tablica.add("---");
        tablica.add("4");
        tablica.add("|");
        tablica.add("5");
        tablica.add("|");
        tablica.add("6");
        tablica.add("---");
        tablica.add(" ");
        tablica.add("---");
        tablica.add(" ");
        tablica.add("---");
        tablica.add("1");
        tablica.add("|");
        tablica.add("2");
        tablica.add("|");
        tablica.add("3");


        wypisz(tablica);

    }

    private static void wypisz(ArrayList<String> tablica) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    System.out.print("\t" + tablica.get(j));
                } else if (i == 1) {
                    System.out.print("\t" + tablica.get(j + 5));
                } else if (i == 2) {
                    System.out.print("\t" + tablica.get(j + 10));
                } else if (i == 3) {
                    System.out.print("\t" + tablica.get(j + 15));
                } else if (i == 4) {
                    System.out.print("\t" + tablica.get(j + 20));
                }
            }
            System.out.println();
        }
    }

    private static void ruchKolko(Scanner scanner) {
        System.out.println("ruch kolka");
        int kolko;
        int O = 0;

        do {
            kolko = scanner.nextInt();
            if (kolko == 7) {
                O = 0;
            } else if (kolko == 8) {
                O = 2;
            } else if (kolko == 9) {

            }
        }while(kolko>0);
        return;

        }
    }

