package pl.sda.javastart.day4;

public class ForsExample2 {                            // zadanie robimy choinke z liczb
    public static void main(String[] args) {

        printNumbersInThree(21);
    }

    public static void printNumbersInThree(int height) {
        for (int i = 0; i < height; i++) {                   // pierwsza petla odpowiada za ilosc wierszy
            for (int j = 0; j <= i; j++) {               // druga petla steruje iloscia kolumn , druga petla jest sterowana przez pierwsza dlatego j<=i
                System.out.print(1);                  // to odpowiada nam za to co jest w kolejnych wierszach w tym co sie wyswietla, na poczatku i=0 potem 0+1 , 1+1, jak wstawimy samo 1 to wtedy choinka bedzie z samych 1
            }
            System.out.println();                   //dajemy zeby bylo 11 22 pod soba, bez tego by bylo 1122 obok siebie
        }
    }
}
