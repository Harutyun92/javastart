package pl.sda.javastart.aaa.PrzeciazanieMetod;
// metody moga miec te same nazwy ale musza roznic sie przyjetymi argumentami

public class PrzeciazanieMetod {

    public static void main(String[] args) {
        PrzeciazanieMetod p = new PrzeciazanieMetod();
        p.metoda();
        p.metoda("z dodatkowym stringiem");
        p.metoda("z dodatkowym stringiem", 5);


    }

    public void metoda() {
        System.out.println("metoda");
    }

    public void metoda(String string) {
        System.out.println("metoda " + string);
    }

    public void metoda(String string, int x) {
        System.out.println("metoda " + string + " i parametrem int " + x);
    }
}
