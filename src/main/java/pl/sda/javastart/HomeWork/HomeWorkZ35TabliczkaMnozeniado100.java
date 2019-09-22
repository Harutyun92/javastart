package pl.sda.javastart.HomeWork;

public class HomeWorkZ35TabliczkaMnozeniado100 {
    public static void main(String[] args) {
        System.out.println("Program wyswietla tabliczke mnozenia do 100");
        int n = 8;
        for (int wiersze = 1; wiersze <= n; wiersze++) {
            for (int kolumny = 1; kolumny <= n; kolumny++) { // dla wiersz=1 sprawdza warunek kolumn i mnozy 1*1,1*2,1*3 do 8 az warunek jest spelniony, nastepnie przechodzi do wiersz=2 i robi to samo
                System.out.print(wiersze * kolumny + "\t");
            }
                System.out.println();
            }
        }
    }

