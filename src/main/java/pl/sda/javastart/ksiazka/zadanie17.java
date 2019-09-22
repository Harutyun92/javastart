package pl.sda.javastart.ksiazka;

public class zadanie17 {
    public static void main(String[] args) {
        System.out.println("Pierwsza tablica 10x10 wypelniona jest samymi 1 , druga tablica samymi 2, dodac jedna do drugiej , ma wyjsc tablica 10x10 wypelniona 3");
        int n = 10, i, j, suma;
        int[][] tablica1 = new int[n][n];
        int[][] tablica2 = new int[n][n];
        int[][] tablica3 = new int[n][n];
        for (i = 0; i < tablica1.length; i++) {
            for (j = 0; j < tablica1.length; j++) {
                tablica1[i][j] = 1;
            }
        }
        for (i = 0; i < tablica2.length; i++) {
            for (j = 0; j < tablica2.length; j++) {
                tablica2[i][j] = 2;
            }
        }
        //wyswietlanie macierza
        for (i = 0; i < tablica1.length; i++) {
            for (j = 0; j < tablica1.length; j++) {
                System.out.print(tablica1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Wyswietlenie tablica2");
        for (i = 0; i < tablica2.length; i++) {
            for (j = 0; j < tablica2.length; j++) {
                System.out.print(tablica2[i][j] + " ");
            }
            System.out.println();
        }
        //dodawanie macierzy tablica1 i tablica2
        for (i = 0; i < tablica3.length; i++) {
            for (j = 0; j < tablica3.length; j++) {
                tablica3[i][j] = tablica1[i][j] + tablica2[i][j];
            }
        }
        //wyswietlanie tablicy3
        System.out.println("Wyswietlenie tablica3");
        for (i = 0; i < tablica3.length; i++) {
            for (j = 0; j < tablica3.length; j++) {
                System.out.print(tablica3[i][j] + " ");
            }
            System.out.println();
        }
    }
}