package pl.sda.javastart.aaJavaStart.aStatic.Interface;
//Wcześniej napisałem, że interfejsy mogą posiadać tylko metody abstrakcyjne, ale cóż - trochę skłamałem. Od Javy w wersji 8
// wprowadzono tzw. metody domyślne (eng. default metods), które oznaczamy słowem kluczowym default. Są to metody, które nie są
// abstrakcyjne,  więc nie muszą być nadpisywane w klasach implementujących dany interfejs,
//  co najważniejsze mogą wykonywać pewne obliczenia.

//Przykładowo mając interfejs Vehicle nie wiemy o ile przyspiesza samochód, czy samolot, ale możemy zaimplementować domyślną
// metodę speedUp(), która zwiększy prędkość o jedną jednostkę.

public interface InterfaceMetodyDefaultandStatic {
    default public int speedUp(int speed) {
        return speed++;
    }
// metoda static
    static String revert(String original) {
        return new StringBuilder(original).reverse().toString();
    }
}
