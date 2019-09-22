package pl.sda.javastart.ksiazka;

public class zadanie7 {
    public static void main(String[] args) {
        System.out.println("Program ktory wyswietla liczby calkowite do 1 do 20");
        for (int i = 1; i <= 20; i++) {
            if (i < 20)
                System.out.print(i + ", ");
            else
                System.out.println(i + ".");
        }
        System.out.println("Program ktory wyswietla liczby calkowite do 1 do 20 z while");
        int z = 0;
        while (z < 20) {    //todo dlaczego do 20 pokazuje Computerr nie do 19
            z++;
            if (z < 20)
                System.out.print(z + ", ");
            else
                System.out.println(z + ".");

        }
        System.out.println("Program ktory wyswietla liczby calkowite do 1 do 20 z do while");
        int a = 1;
        do {
            if (a <= 20)
                System.out.print(a + ", ");
            else
                System.out.println(a + ". ");
            a++;
        }
        while (a <= 20);
    }
}


