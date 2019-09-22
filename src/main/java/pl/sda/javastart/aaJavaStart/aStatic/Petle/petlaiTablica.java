package pl.sda.javastart.aaJavaStart.aStatic.Petle;

public class petlaiTablica {
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
