package pl.sda.javastart.HomeWork;

public class Wagon {
    private double weight;
    private int wagonsClass;
    private int passengersNumber;
    private boolean food;

    public Wagon(double weight, int wagonsClass, int passengersNumber, boolean food) {
        this.weight = weight;
        this.wagonsClass = wagonsClass;
        this.passengersNumber = passengersNumber;
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWagonsClass() {
        return wagonsClass;
    }

    public void setWagonsClass(int wagonsClass) {
        this.wagonsClass = wagonsClass;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "masa" + weight + "klasa wagonu " + wagonsClass + "liczba pasazerow " + passengersNumber + "dostepnosc jedzenia" + food;
    }
}
