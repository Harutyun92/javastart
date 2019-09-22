package yt.rekurencja.kurss.a2.a2;

public class bucky14GenericReturnTypes {
    public static void main(String[] args) {


        System.out.println(max(23, 51, 1));
        System.out.println(max("apples", "tots", "chiceken"));
    }

    // metoda compareTo do porownywani mozemy uzywac do stringow liczb i innych danych

    public static <T extends Comparable<T>> T max(T a, T b, T c) { // zamisat void dajemy T zwraca generyczna rzecz , mozemy uzywac tylko obiektow ktore dziedzicza comparable

        // szukamy maksymum z a b c

        T m = a; // ustawiamy a przypuszczalnie jako max i potem to sprawdzimy

        if (b.compareTo(a) > 0) // sprawdzamy czy b jest wieksze od a
            m = b;        //  jesli b jest wieksze od a to na max ustawiamy b

        if (c.compareTo(m) > 0) ; // musimy jeszce sprawdzic czy c jest wieszke od maximum
        m = c;

        return m;
    }
}
