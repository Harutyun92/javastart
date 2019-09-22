package pl.sda.javastart.aaJavaStart.aStatic.bDziedziczenie;

public class Animal {
    private String color;
    private double weight;



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
    public void makeSound(){
        System.out.println("Auu auu");
    }
}
