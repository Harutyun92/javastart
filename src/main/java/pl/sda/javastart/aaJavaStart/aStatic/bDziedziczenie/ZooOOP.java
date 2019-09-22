package pl.sda.javastart.aaJavaStart.aStatic.bDziedziczenie;

public class ZooOOP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.setColor("black");
        dog.setWeight(20);
        cat.setColor("white");
        cat.setWeight(10);
        System.out.println("Kot daje odgłos: ");
        cat.makeSound();
        System.out.println("Pies daje głos: ");
        dog.makeSound();
        System.out.println("pies dane: " + "kolor " + dog.getColor() + " waga " + dog.getWeight());
        Animal animal = new Animal();
        animal.makeSound();
    }
}
