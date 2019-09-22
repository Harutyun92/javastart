package pl.sda.javastart.aaJavaStart.aStatic.Tablice;
//Napiszmy program, który robi dwie powyższe rzeczy - stwórzmy 10 elementową tablicę liczb całkowitych, uzupełnijmy ją
// wartościami od 1 do 10, WartoscAbsolutna następnie wyświetlmy.

public class a {
    public static void main(String[] args) {
        int[] tab = new int[10];
        //uzupelniamy tablice
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
       // }
            //wyswietlamy tablice
         //   for (int i = 0; i < tab.length; i++) {
                System.out.println("Liczba "+ tab[i]);
            }
        }
    }
