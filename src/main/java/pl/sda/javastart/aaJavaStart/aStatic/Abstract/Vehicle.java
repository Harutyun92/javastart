package pl.sda.javastart.aaJavaStart.aStatic.Abstract;
// klasa abstrakcyjna vehicle bo jak bysmy utworzyli new Vehicle nie wiemy czym jest vehicle czy jest samochodem statkiem
// samolotem czy czym
abstract class Vehicle { // klasa jest abstrakcyjna nie mozna utworzyc obiektu new Vehicle , jesli klasa posiada conajmniej
    // jedna metode abstrakcyjna to sama musi tez juz byc nazwana jako abstract
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // metoda abstrakcyjna
    public abstract void speedUp();
    //Oprócz tego istnieje metoda speedUp(), którą oznaczyliśmy jako abstrakcyjną,
    // ponieważ chcemy, aby każdy kto będzie dziedziczył po klasie Vehicle zaimplementował ją na swój sposób.
    // Metoda jest abstrakcyjna, ponieważ nie jesteśmy w stanie powiedzieć "ogólnie każdy pojazd na świecie przyspiesza
    // o XYZ km/h". Zupełnie inaczej przyspiesza rower, samochód, czy samolot.
}
