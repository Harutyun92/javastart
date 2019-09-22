package pl.sda.javastart.HomeWork;
//Pair wypelnij tablice elementami przy uzyciu petli

import java.util.Arrays;

public class CwiczeniaTablica {
    public static void main(String[] args) {
        int[] table = new int[9];
        for (int i = 0; i <= 8; i++) {       // napisalismy petle dla naszej tabeli zeby pojawialy sie po kolei liczby od 0 do 9
            table[i] = i + 1;                // ta linijka tyczy sie indeksow do tabeli napisalismy table [i] bo indeks zaczyna sie od 0, dalismy i+1 zeby dla indeksu 0 pojawila sie wartosc 1
        }
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3,4})));
        System.out.println(Arrays.toString(reversedArray(table)));
    }

    public static int[] reversedArray(int[] table) {
        int[] tabResult = new int[table.length];
        for (int i = table.length; i > 0; i--) {
            tabResult[table.length - i] = table[i - 1];
        }
        return tabResult;
    }
}
