package pl.sda.javastart.ksiazka;

public class Zadanie6petle {
    public static void main(String[] args) {
        int y = 0;
        System.out.println("Obliczenie rownania y=3x dla wartosci od 0-10");
        for (int x = 0; x <= 10; x++) {
            y = 3 * x;
            System.out.println(" x = " + x + " y = " + y);
        }
        System.out.println("obliczenie rownania y=3x dla wartosci od 0-10 z petla while");
        int x = 0;
        while (x <= 10) {
            y = 3 * x;
            System.out.println(" x = " + x + " y = " + y);
            x++;
        }

        System.out.println("obliczenie rownania y=3x dla wartosci od 0-10 z petla  do while");
        int z = 0, xx=1;
        do {
            z = 3 * xx;
            System.out.println(" xx = " + xx + " z = " + z);
            xx++;
        }
        while (xx <= 10);
    }
}


