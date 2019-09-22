package pl.sda.javastart.ksiazka;

public class zadanie9 {
    public static void main(String[] args) {
        System.out.println("Program ktory sumuje liczby parzyste od 1-100");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                suma = suma + i;
            }
            System.out.println("Suma wynosi " + suma);
        }
    }

