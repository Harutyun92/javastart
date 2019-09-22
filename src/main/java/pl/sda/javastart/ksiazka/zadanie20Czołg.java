package pl.sda.javastart.ksiazka;

public class zadanie20Czołg {
    public static void main(String[] args) {
        CzołgDane czołg = new CzołgDane("Tygrys", 5000, 200, 20);

        System.out.println(czołg);
        System.out.println("Spalanie: ");
        System.out.println(czołg.dystans(200,20));
    }
}
