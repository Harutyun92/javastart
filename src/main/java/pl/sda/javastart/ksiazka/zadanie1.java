package pl.sda.javastart.ksiazka;

import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("program ma obliczyc sume roznice iloczyn i iloraz dla dwoch liczb x i y ");
        System.out.println("Podaj liczbe x");
        float x = scanner.nextFloat();
        System.out.println("Podaj liczbe y");
        float y = scanner.nextFloat();

        float suma = x + y;
        float różnica = x - y;
        float iloraz = x / y;
        float iloczyn = x * y;
        System.out.println("suma = " + suma + "\n" + "roznica = " + różnica + "\n" + "iloczy n= " + iloczyn + "\n" + "iloraz = " + iloraz + "\n");
    }
}
