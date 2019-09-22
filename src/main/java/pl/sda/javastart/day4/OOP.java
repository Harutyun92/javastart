package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Fabia");
        System.out.println(car.getModel());    // wyswiretla nam tylko model
        System.out.println(car);               // wyswietla nam to co jest w toString w klasie car
        CarOption leatherSeats = new CarOption();                     // chcemy dodac do naszego modelu skore
        leatherSeats.setOptionName("Skóra");
        leatherSeats.setChoosen(true);
        leatherSeats.setOptionPrice(BigDecimal.valueOf(1.99));
        System.out.println(leatherSeats.getOptionName()+" "+leatherSeats.getOptionPrice());
        CarOption radio = new CarOption();
        radio.setOptionName("Radyjko");
        radio.setChoosen(true);
        radio.setOptionPrice(BigDecimal.valueOf(2.99));
        CarOption[] options = new CarOption[]{radio, leatherSeats};
        car.setOptions(options);
        car.setBasePrice(BigDecimal.valueOf(1.10));
        System.out.println(summaryPrice(car));   // to samo co nizej od metody ktora jest nizej
        System.out.println(car.summaryPrice());  // od metody ktora jest w klasie car

        System.out.println(car.toString());                   // to samo co nizej tylko inny zapis w nawiasie , ale znaczy to samo
        System.out.println(car);

    }

    private static BigDecimal summaryPrice(Car car) {   // piszemy metode ktora podsumuje nam ogolna cene auta z calym wyposazeniem
        BigDecimal result = car.getBasePrice();            // najpierw dajemy cene poczatkowa auta to co mamy i znamy
        CarOption[] carOptions = car.getOptions();       // wyciagamy za pomoca getOptions z Obiektu CAR(Car) , tablice z wyposazeniem czyli skora i radiem bo potrzebujemy ich ceny znac zeby potem dodac do ceny basePrice
        for (int i = 0; i < carOptions.length; i++) {            // musimy kazdy indeks po kolei sumowac za pomoca petli
            result = result.add(carOptions[i].getOptionPrice());
        }
        return result;
    }
}

