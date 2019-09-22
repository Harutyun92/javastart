package pl.sda.javastart.ksiazka;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program ma obliczyc pierwiastki równania ax^2+bx+c=0.");
        System.out.println("Podaj liczbe Computerr");
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Niedozwolona wartosc dla Computerr");
        } else {
            System.out.println("Podaj liczbe b");
            int b = scanner.nextInt();
            System.out.println("Podaj liczbe c");
            int c=scanner.nextInt();

            int delta=b*b-4*a*c;
            if(delta>0){
                System.out.println("Brak pierwiastkow rzeczywistych");
            }else{
                if(delta==0) {
                    int x1 = -b / (2 * a);
                    System.out.println("Jest jeden pierwiastek x1= ");
                    System.out.println(x1);
                }else{
                    int x1= (int) ((-b-Math.sqrt(delta))/(2*a));
                    int x2= (int) ((-b+Math.sqrt(delta))/(2*a));
                    System.out.println(x1);
                    System.out.println(x2);
                }
            }

        }

    }
}
