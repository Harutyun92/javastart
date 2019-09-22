package pl.sda.javastart.aaa.ObiektowoscPodstawy;

public class Oop {
    public static void main(String[] args) {

// pierwsza metoda ustawianie danych za pomoca seta i uzylismy konstruktora domyslnego wiec nie trzeba wpisywac danych przy utworzonym nowym obiekcie new
        Telewizor t1 = new Telewizor();

        t1.setName("Sony");
        t1.setSize(42);

        //druga metoda z uzyciem wywolanego naszego konstrukora ze zmiennych

        Telewizor t2 = new Telewizor("Panasonic", 50);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.getName());
        System.out.println(t1.getSize());
        System.out.println(t2.getName());
        System.out.println(t2.getSize());
    }
}