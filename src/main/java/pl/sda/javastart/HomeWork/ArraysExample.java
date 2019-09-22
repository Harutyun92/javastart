package pl.sda.javastart.HomeWork;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int[] table = new int[5];                          // pierwszy sposob na wypisanie tablicy mamy tablice i 5 wartosci pustych 0
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        table[3] = 4;
        table[4] = 5;
        int[] anotherTable = new int[]{1, 2, 3, 6, 5, 8};  // drugi sposob na wypisanie tablicy, metoda na to zeby nie wypisywac jak wyzej po sobie

        int[] emptyTable = new int[8];
        for (int i = 0; i < emptyTable.length; i++) {
            emptyTable[i] = i+1;
        }
        System.out.println(Arrays.toString(emptyTable));

        printPrettyArray(table);

        System.out.println(Arrays.toString(emptyTable));  // Tablice zamienia na stringa dlatego arrays.toString i dajemy w SOUT zeby wyswietlilo
        System.out.println(Arrays.toString(createArray(5)));
        System.out.println(calculateDifferenceBetweenMinAndMax(anotherTable));   // anotherTable wzielismy dla przykladu bo wyzej byl podany int anotherTable
        System.out.println(checkIfArraysAreTheSame(anotherTable, emptyTable));    // wstawilismy nasze dwie tablice rozne ktore wczesniej utworzylismy, wynik false
        System.out.println(checkIfArraysAreTheSame(new int[]{1, 2, 3, 6}, new int[]{1, 2, 3, 6})); // wstawilismy dwie takie same tablice i jest true

    }

    public static void printPrettyArray(int[] newTable) {      // piszemy zeby bylo stringiem czyli np "[2,8,7]"
        String result = "[";                                    // jest to string z nawiazem na poczatku "[
        for (int i = 0; i < newTable.length; i++) {
            if (i < newTable.length - 1) {
                result = result + newTable[i] + ", ";
            } else {
                result = result + newTable[i];
            }
        }
        result = result + "]";// dodajemy string z nawiasem na koncu
        System.out.println(result);
    }

    //Utwórz metodę, która zwraca tablicę o podanym rozmiarze wypełnioną kolejnymi wartościami.

    public static int[] createArray(int size) {           // zwraca tablice metoda wiec jest int[] , o podanym rozmiarze wiec (int size)
        int[] table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = i + 1;                               // beda to wartosci od 1 do podanego
        }
        return table;
    }
//Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca różnicę pomiędzy największym najmniejszym elementem

    public static int calculateDifferenceBetweenMinAndMax(int[] table) {
        int[] tabOfMinAndMax = calculateMinMax(table);
        return Math.abs(tabOfMinAndMax[1] - tabOfMinAndMax[0]);            // uwaga gdzie return robimy zeby byl po dobrych nawiasach czyli w public
    }

    public static int[] calculateMinMax(int[] table) {
        int max = table[0];
        int min = table[0];
        for (int element : table) {   // element dajemy sobie dowolona nazwe , wzor z prezentacji
            if (element > max) {                   // piszemy ifa zeby znalezc najwiekszy element
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        int[] tabForMinMax = new int[]{min, max};
        return tabForMinMax;
    }
    //Utwórz metodę, która przyjmuje dwie tablice. Metoda ma zwrócić informację czy przekazane tablice są takie same

    public static boolean checkIfArraysAreTheSame(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {        // piszemy ifa zeby sprawdzic czy dwie tablice maja ta sama dlugosc , napisalismy ze jesli sa roznej dlugosci zwrocic false
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {     // piszemy tu pentle
            if (firstArray[i] != secondArray[i]) {           //[i] jest naszymi wartosciami w tabeli, sprawdzamy czy wartosci w obu tabelach beda takie same , sprawdzamy czy jedna wartosc jest inna niz w drugiej
                return false;
            }
        }
        return true;
    }
}

