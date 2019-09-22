package pl.sda.javastart.ksiazka;

import java.util.Random;

public class zadanie11 {
    public static void main(String[] args) {
        //double w ksiazce czemu
        double min, max,wylosowanaLiczba, suma=0;
        System.out.println("program losuje 5 liczb ze zbioru 1-99 i z uzyciem for znajduje najwieksza i najmniejsza liczbe i liczy srednia wszystkich wylosowanych liczb");
        Random random = new Random();
        min = random.nextInt(100);
       // min = Math.round(100 * (random.nextDouble()));

        System.out.print("wylosowano liczby: " + min + ", "); //todo nie wyswietla w jednej lini
        max = min;
        for (int i = 1; i <= 5 - 1; i++) {
            wylosowanaLiczba = random.nextInt(100);
            //wylosowanaLiczba = Math.round(100 * (random.nextDouble()));
            System.out.print (wylosowanaLiczba + ", ");
            if (max < wylosowanaLiczba)
                max = wylosowanaLiczba;
            if (wylosowanaLiczba < min)
                min = wylosowanaLiczba;
            suma = suma + wylosowanaLiczba;
        }
        System.out.println();
        System.out.println("Najwieksza wylosowana liczba to " + max);
        System.out.println("Najmniejsza wylosowana liczba to " + min);
        System.out.println("Srednia wynosi " + suma / 5);
    }
}
