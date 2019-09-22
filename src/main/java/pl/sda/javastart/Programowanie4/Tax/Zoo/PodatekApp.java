package pl.sda.javastart.Programowanie4.Tax.Zoo;

import java.util.Scanner;

public class PodatekApp {
    public static void main(String[] args) {
        System.out.println("Podaj kwote do policzenia");
        Scanner scanner = new Scanner(System.in);
        int kwota = scanner.nextInt();

        narodowosc();
        int narodowosc=scanner.nextInt();
        liczeniePodatku(narodowosc,kwota);
    }

    public static void liczeniePodatku(int narodowosc, int kwota) {
        KalkulatorPodatku kalkulatorPodatku = null;
        if (narodowosc == 1) {
            kalkulatorPodatku = new PolskiKalkulatorPodatku();
        }
        if (narodowosc == 2) {
            kalkulatorPodatku = new RosyjskiKalkulatorPodatku();
        }
        if (kalkulatorPodatku == null) {
            System.out.println("Zly wybor");
            return;
        }
        int kwotaZpodatkiem=kalkulatorPodatku.policzPodatek(kwota);
        System.out.println("Kwota z podatkiem :"+kwotaZpodatkiem);
    }

    private static void narodowosc() {
        System.out.println("Wybierz narodowosc");
        System.out.println("1.Polska");
        System.out.println("2.Rosja");
    }

}
