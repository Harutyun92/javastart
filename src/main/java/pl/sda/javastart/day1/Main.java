package pl.sda.javastart.day1;

import java.util.Date;

public class Main {
    public static void main(String[] args){ // tej metody szuka java uruchamiajac program
        System.out.println("Hello World!");
        Date date = new Date();
        System.out.println(date.toString());
        int number = 100;
        System.out.println("Number " + number); // tu wystepuje konkatenacja

        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println('A' + 2);
        System.out.println(9%4);
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);
        System.out.println((55+9)%9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 -8 % 3);

        System.out.println("Adam");
        System.out.println("Marek");
        System.out.println("Anna");


        System.out.println("Adam\nMarek\nAnna");
        System.out.println("\\Adam\nMarek\nAnna");
        System.out.println("Adam" + 4 + false);

        System.out.println(false==false);
        System.out.println(false !=true);
        System.out.println(!true);
        System.out.println(2 > 4);
        System.out.println(3 < 5);
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3!= 5 || 3 == 5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos" == "cos");
        System.out.println("cos" == "cos");
        System.out.println("cos" == new String("cos"));


    }
}
