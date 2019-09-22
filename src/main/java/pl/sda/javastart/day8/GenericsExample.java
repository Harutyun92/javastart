package pl.sda.javastart.day8;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        notGeneric();
        genericExample();

        // Metoda na sumowanie liczb znajdujace sie w liscie
        List<Number> numbers= Arrays.asList(4,10.9,1,4,3333,76,77.7);
        System.out.println(sumAnyNumbers(numbers));

        List<Long> longs = Arrays.asList(123L,23L);
        System.out.println(sumAnySpecifiedNumbersWithT(longs));

    }
    // METODA GDZIE PRZEKAZUJEMY KONKRETNY TYP CZYLI LONGI I CHCEMY UZSKAC WYNIK JAKO LONGA - cos zle wychodzi bo wynik daje w double nie long
    private static <T extends Number> T sumAnySpecifiedNumbersWithT(List<T> numbers){
        Double sum = 0d;
        for (T number : numbers) {
            sum = sum + number.doubleValue();
        }
        return (T)sum;
    }



    private static Double sumAnyNumbers(List<Number> numbers){ // metoda sumujaca liczby ktore na dany moment sa doublami , w <> dajemy Number bo to jest klasa glowna pod nia double integer long itp
       Double sum= 0d;
        for (Number number : numbers) {   // skrot iter zeby wyskoczyla petla for each
            sum=sum+number.doubleValue();
        }
        return sum;
    }



    private static void genericExample() {
        Apple apple = new Apple();           // tworzymy pudelkoGeneryczne ktore bedzie przechowywalo jablko , musimy najpierw stwrozyc obiekt jablko
        GenericFruitBox<Apple> genericFruitBox = new GenericFruitBox<>(apple);       // w nawiasie () jest konsturktor wiec wstawiamy nasze jablko,
        Apple appleFromBox = genericFruitBox.getFruit();  // nie musimy kastowac
        appleFromBox.introduceApple();
    }

    // PRZYKLAD ktory fruitbox nie jest generyczny , jesli np zmienimy (Apple) w 4 linijnce na orange juz nie zadziala taki minus
    private static void notGeneric() {
        Apple apple = new Apple();   // tworzymy apple bo chcemy nizej je umiescic
        FruitBox fruitBox = new FruitBox(apple);
        Apple appleFromBox = (Apple) fruitBox.getFruit();  // chcemy pobrac zmienna jablko z boxa w ktore wyzej wlozylismy i zeby faktycznie od razu bylo jablkiem i musimy skastowac czyli w nawiasie napisac (Apple)
        appleFromBox.introduceApple();
    }
}
