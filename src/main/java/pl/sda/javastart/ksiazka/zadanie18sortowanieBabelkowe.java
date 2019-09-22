package pl.sda.javastart.ksiazka;

public class zadanie18sortowanieBabelkowe {
    public static void main(String[] args) {
        int x, i, j;
        int[] liczby = new int[6];
        liczby[0] = 574;
        liczby[1] = 323;
        liczby[2] = 110;
        liczby[3] = 145;
        liczby[4] = 55;
        liczby[5] = 88;
        System.out.println("Dla liczb: ");
        for (i = 0; i <= 5; i++)
            if (i <= 4)
                System.out.print(liczby[i] + ", ");
            else
                System.out.println(liczby[i] + ".");
            //ALGORYTM SORTOWANIA BABELKOWEGO
            for (i = 1; i <= 5; i++) {
                for (j = 5; j >= i; j--)
                    if (liczby[j - 1] > liczby[j]) {
                        x = liczby[j - 1];
                        liczby[j - 1] = liczby[j];
                        liczby[j] = x;
                    }//j
                }//i
                System.out.println("");
                System.out.println("Liczby uporzadkowane to: ");
                for (i = 0; i <= 5; i++)
                    if (i <= 4)
                        System.out.print(liczby[i] + ", ");
                    else
                        System.out.print(liczby[i] + ". ");
                    System.out.println();
                }
            }




