package pl.sda.javastart.HomeWork;

public class HomeWorkZ14i15 {
    public static void main(String[] args) {
        numberThree(4);
        reversenumberThree(5);
    }

    public static void numberThree(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);

            System.out.println();
        }
    }

    public static void reversenumberThree(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height - i; j++)
                System.out.print(" ");
                for (int k = 1; k <= i; k++)
                    System.out.print(k);

                    System.out.println();
                }
            }
        }

