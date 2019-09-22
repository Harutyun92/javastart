package pl.sda.javastart.ksiazka;

public class Plane {

    private String name;
    private String color;
    private double weight;
    private double fuelUsage;
    private double capasity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getCapasity() {
        return capasity;
    }

    public void setCapasity(double capasity) {
        this.capasity = capasity;
    }

    public int distance(int fuelUsage, int capasity) {
        return capasity / fuelUsage * 100;
    }

    @Override
    public String toString() {
        return "Jestem samolotem o nazwie "+name+"o kolorze "+color+"i spalam "+fuelUsage+(capasity/fuelUsage*100);
    }
}

