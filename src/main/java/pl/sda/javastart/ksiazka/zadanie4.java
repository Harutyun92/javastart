package pl.sda.javastart.ksiazka;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("zadanie polega na obliczeniu wartosci x z rownania ax+b=c");
        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj wartosc Computerr ");
        int a=scanner.nextInt();
        if(a==0){
            System.out.println("niedozwolona wartosc Computerr ");
        }else{
            System.out.println("podaj wartosc liczby b");
            int b=scanner.nextInt();
            System.out.println("podaj wartosc liczby c");
            int c=scanner.nextInt();
            int x=(c-b)/a;
            System.out.println(x);
        }
    }
}
