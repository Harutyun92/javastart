package pl.sda.javastart.programowanie2.Zadanie;
// napisz aplikacje ktora ma za zadanie stworzyc liste osob ktora bedzie mogla posiadac swoje zwierzaki roznego rodzaju. kazdy zwierzak
// ma swoja ulubiona liste potraw. osoba ma liste dostepnych potraw. nakarm wszystkie zwierzaki ich ulubionymi potrawami

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private List<Food> foodList=new ArrayList<>();
    private List<Animal> animalList=new ArrayList<>();

    public Person(String name, List<Food> foodList, List<Animal> animalList) {
        this.name = name;
        this.foodList = foodList;
        this.animalList = animalList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void feed() {  // metoda na karmienie
        for (Animal animal : animalList) {
            foodList.stream()
                    .filter(food -> animal.isMyFavFood(food))  // te co maja true przechodza te co false nie, uzywamy referencji do metody , nie zapisujemy z uzyciem lambdy
                    .findAny()
                    .ifPresent(food1 -> animal.feedAnimal(food1)); // tu pracujemy juz na optionalu nie na streamie
        }
    }
    public List<Animal>listOFHungryAnimals(){
        return animalList.stream()
                .filter(animal -> animal.isHungry())
                .collect(Collectors.toList());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
