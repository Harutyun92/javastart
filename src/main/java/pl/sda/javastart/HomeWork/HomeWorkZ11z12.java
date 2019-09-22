package pl.sda.javastart.HomeWork;

public class HomeWorkZ11z12 {
    public static void main(String[] args) {
        // napisz program ktory wyswietla liczby od 1-20 i pisze obok czy sa parzyste czy nie , i od 20 w dol
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println("liczba " + i + " jest parzysta ");
            } else {
                System.out.println("liczba " + i + " jest nieparzysta ");
            }
            // System.out.println(i);
        }
        int a = 20;
        while (a > 0) {
            System.out.print("liczba " + a);
            if (a % 2 == 0) {
                System.out.println(" jest nieparzysta ");
            } else {
                System.out.println(" jest parzysta ");
            }
            a--;
        }
    }
}
