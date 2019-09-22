package pl.sda.javastart.HomeWork;

public class HomeWorkZ35 {
    public static void main(String args[]) {
        int i, j;
        float tab[][] = new float[9][9];
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                tab[i][j] = i * j;
                System.out.printf("%4.0f", tab[i][j]);
            }
            System.out.println(" ");
        }
    }
}





