package pl.sda.javastart.HomeWork;

public class MarcinZadaniePetle {
    public static void main(String[] args) {
        //Wypisz 100 razy na przemian * i #. Kazdy znak w nowej linii
        gwiazdkaHash(5);
       abc(10);
        liczbypodzielnePrzez3(100);
    }

    private static void gwiazdkaHash(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++)
                System.out.println("Aa");
        }
    }

    private static void abc(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println("a");
            for (int j = 0; j <= 0; j++)
                System.out.println("b");
            for (int j = 0; j <= 0; j++)
                System.out.println("c");
        }
    }

    private static void liczbypodzielnePrzez3(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}


