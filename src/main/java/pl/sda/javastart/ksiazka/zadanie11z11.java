package pl.sda.javastart.ksiazka;

import java.util.Random;

public class zadanie11z11 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100);
        int y = r.nextInt(100);
        int a = r.nextInt(100);
        int b = r.nextInt(100);
        System.out.println("x= " + x + " y= " + y + " Computerr= " + a + " b= " + b);
        int sum = x + y + a + b;
        System.out.println("sum = " + sum);

        System.out.println(Math.max(x,y)); //todo jak obliczyc max i min jak sa 4 dane
    }
}
