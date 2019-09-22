package pl.sda.javastart.programowanie3;

import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe");
        double firstValue=scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double secondValue=scanner.nextDouble();
        System.out.println("WartoscAbsolutna+b = " + (firstValue+secondValue));
        System.out.println("WartoscAbsolutna-b = " + (firstValue-secondValue));
        System.out.println("WartoscAbsolutna*b = " + (firstValue*secondValue));
        System.out.println("WartoscAbsolutna/b = " + (firstValue/secondValue));
    }
}
