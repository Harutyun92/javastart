package pl.sda.javastart.XkolkoiKrzyzyk;

import java.util.Scanner;

public class Cwiczenie {
    private static String[] tablica = new String[9];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        uzupelnianiePola();
        wygrana();
        gra();


    }

    private static void wygrana() {

        if (tablica[0].equals(tablica[1]) && (tablica[0].equals(tablica[2])) && (tablica[0].equals("O")) || (tablica[0].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[0].equals(tablica[4]) && (tablica[0].equals(tablica[8])) && (tablica[0].equals("O")) || (tablica[0].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[1].equals(tablica[4]) && (tablica[1].equals(tablica[7])) && (tablica[1].equals("O")) || (tablica[1].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[2].equals(tablica[5]) && (tablica[2].equals(tablica[6])) && (tablica[2].equals("O")) || (tablica[2].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[2].equals(tablica[4]) && (tablica[2].equals(tablica[6])) && (tablica[2].equals("O")) || (tablica[2].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[3].equals(tablica[4]) && (tablica[3].equals(tablica[5])) && (tablica[3].equals("O")) || (tablica[3].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[2].equals(tablica[5]) && (tablica[2].equals(tablica[8])) && (tablica[2].equals("O")) || (tablica[2].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
        if (tablica[6].equals(tablica[7]) && (tablica[6].equals(tablica[8])) && (tablica[6].equals("O")) || (tablica[6].equals("X"))) {
            System.out.println(tablica[0] + "won");
            System.exit(0);
        }
    }

    private static void ruchKrzyzyk() {
        System.out.println("wybierz gdzie postawic X");
        Integer pozycja = scanner.nextInt();
        if (tablica[pozycja - 1].equals("-")) {
            tablica[pozycja - 1] = "X";
            poleDoGry();
            //metoda jesli gra sie skonczyla
        } else {
            System.out.println("to pole jest juz zajete");
            ruchKrzyzyk();
        }
    }

    private static void ruchKolko() {
        System.out.println("wybierz gdzie postawic O");
        Integer pozycja = scanner.nextInt();
        if (tablica[pozycja - 1].equals("-")) {
            tablica[pozycja - 1] = "O";
            poleDoGry();
            //metoda jesli gra sie skonczyla
        } else {
            System.out.println("to pole jest juz zajete");
            ruchKolko();
        }
    }

    private static void gra() {
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                ruchKolko();
            } else {
                ruchKrzyzyk();
            }
        }
    }


    private static void uzupelnianiePola() {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = "-";
        }
        poleDoGry();
    }


    private static void poleDoGry() {
        System.out.println(tablica[0] + " " + tablica[1] + " " + tablica[2]);
        System.out.println(tablica[3] + " " + tablica[4] + " " + tablica[5]);
        System.out.println(tablica[6] + " " + tablica[7] + " " + tablica[8]);

    }
}
