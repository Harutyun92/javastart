package pl.sda.javastart.aaJavaStart.aStatic.Abstract;

public class Car extends Vehicle { // jesli wezmiemy ze Car dziedzicy bo abstrakcyjen klasie vehicle to mamy dwa wyjscia
    // albo Car tez musi byc abstrakcyjna ale wtedy nie bedziemy mogli utworzyc new Car , albo zaimplementowac metode z
    // klasy vehicle i ja nadpisac tak jak nizej


    @Override
    public void speedUp() {
        setSpeed(getSpeed()+5);
    }
}
