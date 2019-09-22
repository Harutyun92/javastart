package pl.sda.javastart.ksiazka;

import java.util.Random;
import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Program losuje  liczbe z przedzialu 1-5, zgadnij ta liczbe!");
        int wybranaLiczba=scanner.nextInt();
        Random random=new Random();
        int losowaLiczba=random.nextInt(5);
        if(wybranaLiczba==losowaLiczba){
            System.out.println("Gratulacje zgadles");
        }else{
            System.out.println("Niestety nie zgadles");
            System.out.println(losowaLiczba);
        }
    }
}
