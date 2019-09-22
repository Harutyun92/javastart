package pl.sda.javastart.aaJavaStart.aStatic.Tablice;

public class DwuWymiarowa1 {
    public static void main(String[] args) {
        int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][]; // tablica dwuwymiarowa napisalismy ze sklada sie z 3 tablic , drugie puste bo kazda ma inna dlugosc
        hugeTab[0] = longTab;  // pierwszej przypisujemy dlugosc 1000 , dalej 100 i 10
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println("Długości tablic: ");
        System.out.println(hugeTab[0].length + " ; " + hugeTab[1].length + " ; " + hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);
    }
}
//W tablicach wielowymiarowych możemy wyświetlić rozmiar każdego wiersza odwołując się do własności length.
// Zapisując hugeTab.length otrzymamy wartość 3, czyli ilość wierszy/tablic, WartoscAbsolutna zapisując np. hugeTab[0].length otrzymamy wartość 1000,
// czyli ilość kolumn/elementów w pierwszej tablicy/wierszu.