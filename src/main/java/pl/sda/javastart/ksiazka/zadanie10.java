package pl.sda.javastart.ksiazka;

public class zadanie10 {
    public static void main(String[] args) {
        System.out.println("Program ktory sumuje liczby nieparzyste 1-100 z uzyciem while");
        int suma = 0, i = 0;
        while (i <= 100) {
            i++;
            if (i % 2 != 0)
                suma = suma + i;
        }
        System.out.println("Suma wynosi " + suma);
    }
}
