package pl.sda.javastart.ksiazka;

public class zadanie12 {
    public static void main(String[] args) {
        System.out.println("Program wyswietla alfabet od A do Z i od Z do A");
        char znak;
        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z')
                System.out.print(znak + ", ");
            else
                System.out.println(znak + ".");
        }
        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.println(znak + ".");
        }
    }
}
