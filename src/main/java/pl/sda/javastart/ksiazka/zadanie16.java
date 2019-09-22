package pl.sda.javastart.ksiazka;

public class zadanie16 {
    public static void main(String[] args) {
        System.out.println("Mamy dwie tablice 10x10 jeden zawiera liczby w kolumnach od 0 do 9a druga tablica same zera, zadanie polega na wymianie liczb z jedej tablicy do drugiej ze zmiana licz z kolumn do wierszy");
        int n=10,i,j;
        int[][]tablica1=new int[n][n];
        int[][]tablica2=new int[n][n];
        //wpisywanie liczb do tablicy 1
        for (i = 0; i <tablica1.length ; i++) {
            for (j = 0; j <tablica1.length ; j++) {
                tablica1[i][j]=j;
            }
        }
        //przepisywanie liczb z tablicy1 do tablicy2
        for (i = 0; i <tablica2.length ; i++) {
            for (j = 0; j <tablica2.length ; j++) {
                tablica2[i][j]=tablica1[j][i];
            }
        }
        //wyswietlanie zawartosci tablicy1
        System.out.println("Wyswietlenie zawartosci tablicy1");
        for (i = 0; i <tablica1.length ; i++) {
            for (j = 0; j <tablica2.length ; j++) {
                System.out.print(tablica1[i][j]+" ");
            }
            System.out.println();
        }
        //wyswietlanie zawartosci tablicy2
        System.out.println("Wyswietlenie zawartosci tablicy2");
        for (i = 0; i <tablica2.length ; i++) {
            for (j = 0; j <tablica2.length ; j++) {
                System.out.print(tablica2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
