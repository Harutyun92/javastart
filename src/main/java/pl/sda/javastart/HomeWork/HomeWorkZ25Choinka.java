package pl.sda.javastart.HomeWork;

public class HomeWorkZ25Choinka {
    public static void main(String[] args) {
        christmasTree(11);
    }

    public static void christmasTree(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height - i; j++)
                System.out.print("*");
            for (int k = 1; k <= i; k++)
                System.out.print(k);
            for (int k = 1; k < i; k++)
                System.out.print(i - k);
            for (int j = 1; j < height - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}


