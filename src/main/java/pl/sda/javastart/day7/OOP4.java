package pl.sda.javastart.day7;

import pl.sda.javastart.day4.Car;

import java.util.Arrays;

public class OOP4 {
    public static void main(String[] args) {

        whiteCar();       // ctrl alt m , zaznaczamy co chcemy wstawic w metode
        System.out.println(ColourEnum.WHITE);    //(3)
        System.out.println(Arrays.toString(ColourEnum.values())); // (4) jest tablica wiec musimy wywolac w metodzie Arrays.toString
        ColourEnum[] colours = ColourEnum.values(); // mamy tablice colourenum i mamy zamienic na tablice z polami bialy i czarny

        System.out.println(" Zapis czarno bialy przy uzyciu petli");
        for (ColourEnum x : colours) {   //petla for each
            System.out.println(x.getPlName()); // teraz musimy wyciagnac wartosc z elementu x i ja wyswietlic
        }

        System.out.println(" Teraz jako STREAM");
        Arrays.stream(ColourEnum.values())  //  metoda ze streamami na to co wyzej, tutaj otwieramy stream tablicy
                .map(e -> e.getPlName())      // zamiana elementu w streamie , uzywamy do tego metode map , na poczatku mamy strumien CE CE - colour enum , i chcemy zamienic na strumien bialy i czarny
                .forEach(e -> System.out.println(e));
    }

    private static void whiteCar() {
        Car car = new Car();
        car.setColour(ColourEnum.WHITE);
        System.out.println(car.getColour().getColourNumber()); //(1) na kolorze WHITE pobieramy metode colourNumber
        System.out.println(car.getColour().getPlName());  // (2)za pomoca tego ze mamy setWHITE mozemy uzyskac pola z konstruktowa klasy ColourEnum czyli liczbe i nazwe po polsku
    }
}
