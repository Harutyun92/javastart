package pl.sda.javastart.aaJavaStart.aStatic.Petle;

import java.util.Scanner;
//Napiszmy drugi program, który pozwoli wczytać 3 liczby całkowite od użytkownika i za każdym razem rozpozna, czy liczba
// ta jest parzysta (podzielna przez 2), czy też nieparzysta.

public class petlaScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            System.out.println("podaj liczbe do sprawdzenia");
            int number=scanner.nextInt();
            if (number%2==0){
                System.out.println("Liczba jest podzielna przez 2");
            }else{
                System.out.println("Liczba nie jest podzielna przez dwa");
            }
        }
        scanner.close();
    }
}
