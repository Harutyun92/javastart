package pl.sda.javastart.Programowanie;

public class gwiazdki {
    public static void main(String[] args) {
        gwiazdki(2);
        prostokat(5, 10);
        trojkat(6);
        piramida(7);
        X(7);
    }

    private static void gwiazdki(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void prostokat(int lenght, int height) {
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void trojkat(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    private static void piramida(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void X(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j == i; j++)
                System.out.print(" ");
            for (int k = 0; k < height - i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}


