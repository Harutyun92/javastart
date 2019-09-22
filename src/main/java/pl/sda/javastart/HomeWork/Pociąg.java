package pl.sda.javastart.HomeWork;

import java.util.Arrays;

public class Pociąg {
    private double weight;
    private String name;
    private int passengers;
    private int wagons;
    private Wagon[] doczepioneWagony;

    public Pociąg(double weight, String name, int passengers, int wagons) {
        this.weight = weight;
        this.name = name;
        this.passengers = passengers;
        this.wagons = wagons;
        this.doczepioneWagony = doczepioneWagony;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public Wagon[] getDoczepioneWagony() {
        return doczepioneWagony;
    }

    public void setDoczepioneWagony(Wagon[] doczepioneWagony) {
        this.doczepioneWagony = doczepioneWagony;
    }

    public void doczepieniePojedynczegoWagonu(Wagon pojedynczyWagon) {

        if (getDoczepioneWagony() == null) {
            setDoczepioneWagony(new Wagon[]{});
        }
        doczepioneWagony = Arrays.copyOf(doczepioneWagony, doczepioneWagony.length + 1);
        doczepioneWagony[doczepioneWagony.length - 1] = pojedynczyWagon;
    }

    @Override
    public String toString() {
        return "parametry pociagu: " + " masaa " + weight + " nazwa " + name + " liczba pasazerow " + passengers + " liczba wagonow " + wagons + doczepioneWagony;//+Arrays.toString(doczepioneWagony);
    }
}