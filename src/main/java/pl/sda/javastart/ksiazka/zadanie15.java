package pl.sda.javastart.ksiazka;

public class zadanie15 {
    public static void main(String[] args) {
        System.out.println("Macierz 10x10 uzupelnic pierwsza kolumne liczbami od 0-9,druga kolumne kwadratami tych liczb Computerr pozostale pola 0,obliczyc osobno sume dla pierwszej kolumny i osobno dla drugiej");
        int n = 10, i, j, suma;
        int[][] macierz = new int[n][n];
        //uzupelnianie tablicy
        for (i = 0; i <macierz.length ; i++) {
            for (j = 0; j <macierz.length ; j++) {
                if(j==0) macierz[i][j]=i;
                if(j==1) macierz[i][j]=i*i;
                if(j>1) macierz[i][j]=0;
            }
        }
        for (i = 0; i <macierz.length ; i++) {
            for (j = 0; j <macierz.length ; j++) {
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }
        //Obliczenie sumu
        suma=0;
        for (i = 0; i <macierz.length ; i++) {
            suma = suma + macierz[i][0];
        }
            System.out.println("suma pierwszej kolumny wynosi "+suma);
        suma=0;
        for (i = 0; i <macierz.length ; i++) {
            suma=suma+macierz[i][1];
        }
        System.out.println("suma drugiej kolumny wynosi "+suma);
        }
    }

