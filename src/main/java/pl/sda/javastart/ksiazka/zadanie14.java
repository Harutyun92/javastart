package pl.sda.javastart.ksiazka;

public class zadanie14 {
    public static void main(String[] args) {
        System.out.println("Program ma wyswietlic tablice 2 wymiarowa 10x10 i na przekatych umieszcza 1 Computerr poza 0 , dodatkowo liczy sume licz na przekotnej");
        int n = 10,i,j, suma;
        int[][] macierz = new int[n][n];
        //wpisywanie do tablicy albo 1 albo 0
        for (i = 0; i < macierz.length; i++) {
            for (j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = 1; // JESLI ZMIENIMY TU NA i zamiast 1 , to bedzie lecialo po kolei 0,1,2,3,4 na przekatnych
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
//            //wyswietlanie tablicy
//            for ( i = 0; i < macierz.length; i++) {
//                for ( j = 0; j < macierz.length; j++) {
//                    System.out.print(macierz[i][j] + " ");   // todo nie da sie tego sout napisac wyzej , bez pisania znow petli ?
//                }
//                System.out.println();
//            }
            //obliczenie sumy 1 na przekatnej
        suma=0;
        for (i = 0; i <macierz.length ; i++) {
            suma=suma+macierz[i][i];
        }
        System.out.println("suma elementow na przekatnej wynosi "+suma);
        }
    }


