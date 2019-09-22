package pl.sda.javastart.XkolkoiKrzyzyk;

import pl.sda.javastart.aaJavaStart.aStatic.Scanner.scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("GRA KOLKO I KRZYZYK");

        wypisz(tablica);

        int O = ruchKolka(scanner);
        tablica.set(O, "O");
        wypisz(tablica);

        int X = ruchkrzyzyk(scanner);
        tablica.set(X, "X");
        wypisz(tablica);


        O = ruchKolka(scanner);
        tablica.set(O, "O");
        wypisz(tablica);

        X = ruchkrzyzyk(scanner);
        tablica.set(X, "X");
        wypisz(tablica);

        O = ruchKolka(scanner);
        tablica.set(O, "O");
        wypisz(tablica);

        X = ruchkrzyzyk(scanner);
        tablica.set(X, "X");
        wypisz(tablica);

        O = ruchKolka(scanner);
        tablica.set(O, "O");
        wypisz(tablica);

        X = ruchkrzyzyk(scanner);
        tablica.set(X, "X");
        wypisz(tablica);

        O = ruchKolka(scanner);
        tablica.set(O, "O");
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

    public static int ruchKolka(Scanner scanner) {

        System.out.println("ruch kolka");
        int O = 0;
        int kolko;

        do {
            kolko = scanner.nextInt();
            if (kolko == 7) {
                O = 0;
            } else if (kolko == 8) {
                O = 2;
            } else if (kolko == 9) {
                O = 4;
            } else if (kolko == 4) {
                O = 10;
            } else if (kolko == 5) {
                O = 12;
            } else if (kolko == 6) {
                O = 14;
            } else if (kolko == 1) {
                O = 20;
            } else if (kolko == 2) {
                O = 22;
            } else if (kolko == 3) {
                O = 24;
            } else {
                System.out.println("podales niepoprawne pole ");
            }
        } while (kolko != 1 &&
                kolko != 2 &&
                kolko != 3 &&
                kolko != 4 &&
                kolko != 5 &&
                kolko != 6 &&
                kolko != 7 &&
                kolko != 8 &&
                kolko != 9);
        return O;
    }

    public static int ruchkrzyzyk(Scanner scanner) {
        System.out.println("ruch krzyzyk");
        int X = 0;
        int krzyzyk;

        do {
            krzyzyk = scanner.nextInt();
            if (krzyzyk == 7) {
                X = 0;
            } else if (krzyzyk == 8) {
                X = 2;
            } else if (krzyzyk == 9) {
                X = 4;
            } else if (krzyzyk == 4) {
                X = 10;
            } else if (krzyzyk == 5) {
                X = 12;
            } else if (krzyzyk == 6) {
                X = 14;
            } else if (krzyzyk == 1) {
                X = 20;
            } else if (krzyzyk == 2) {
                X = 22;
            } else if (krzyzyk == 3) {
                X = 24;
            } else {
                System.out.println("podales niepoprawne pole ");
            }
        } while (krzyzyk != 1 &&
                krzyzyk != 2 &&
                krzyzyk != 3 &&
                krzyzyk != 4 &&
                krzyzyk != 5 &&
                krzyzyk != 6 &&
                krzyzyk != 7 &&
                krzyzyk != 8 &&
                krzyzyk != 9);
        return X;
    }
}



