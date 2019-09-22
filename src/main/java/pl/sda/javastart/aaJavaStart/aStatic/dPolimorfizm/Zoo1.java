package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm;

public class Zoo1 {  // zaleta polimorfizmu ze mozemy wszystko zwierzeta zapisac jako animal bo dziedzicza po niej i wtedy mozemy latwiej wywolac za pomoca petli albo zmieniac nazwy
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Kotopies");

        changeAnimalName(animals[0], "Pieseł");

        for (Animal animal : animals) {
            animal.giveSound();
        }
    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }
}
