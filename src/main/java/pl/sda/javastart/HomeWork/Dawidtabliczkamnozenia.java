package pl.sda.javastart.HomeWork;

public class Dawidtabliczkamnozenia {
    public static void main(String[] args) {

       tabliczka(6);
    }
    public static void tabliczka(int n) {
        System.out.print("   ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= n; j++) {

                System.out.print(" "+i*j+ " ");
            }
            System.out.println();
        }
    }
}
