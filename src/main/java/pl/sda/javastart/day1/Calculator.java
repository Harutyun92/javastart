package pl.sda.javastart.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double secondValue = scanner.nextDouble();
        System.out.println("WartoscAbsolutna+b=" + (firstValue + secondValue));
        System.out.println("WartoscAbsolutna-b=" + (firstValue - secondValue));
        System.out.println("WartoscAbsolutna*b=" + (firstValue * secondValue));
        System.out.println("WartoscAbsolutna/b=" + (firstValue / secondValue));
        System.out.println("wartosc bezwzgledna z odejmowania WartoscAbsolutna i b = "+ Math.abs(firstValue - secondValue));
        System.out.println("wartosc maksymalna wynosi " + Math.max(firstValue, secondValue));
        System.out.println("wartosc minimalna wynosi " + Math.min(firstValue, secondValue));
        System.out.println("WartoscAbsolutna^b = " + Math.pow(firstValue, secondValue));
    }
}