package pl.sda.javastart.HomeWork;

import java.util.Random;

public class ZadanieMarcin {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        System.out.println("liczba x = " + x + " liczba y = " + y);
        System.out.println(zadanie(x, y));
        System.out.println(zadanie2(x,y));
        System.out.println(zadanie3(x,y));
        System.out.println(zadanie4(x,y));
    }

    public static boolean zadanie(int x, int y) {
        return x > y;
    }
    public static boolean zadanie2(int x, int y){
        return (x*2)>y;
    }
    public static boolean zadanie3(int x,int y){
        return (x+3)>y&&(x-2)<y;
    }
    public static boolean zadanie4(int x,int y){
        return (x*y)%2==0;
    }
}
