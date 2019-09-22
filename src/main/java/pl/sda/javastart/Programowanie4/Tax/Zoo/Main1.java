package pl.sda.javastart.Programowanie4.Tax.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static List<Animal> animalList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        welcomeMenu();
    }

    private static void welcomeMenu() {
        System.out.println("Welcome to the jungle!");
        System.out.println("1.Show animal");
        System.out.println("2.add animal");
        int choice = scanner.nextInt();
        if (choice == 1) {
            showAnimal();
            welcomeMenu();
        } else if (choice == 2) {
            populateAnimalList();
            welcomeMenu();
        }
    }

    public static void showAnimal() {
        if (animalList.isEmpty()) {
            System.out.println("Lista jest pusta, dodaj zwierze");
        } else {
            for (Animal animal : animalList) {
                System.out.println(animal.introduceYourself());
            }
        }
    }

    public static void populateAnimalList() {
        Animal animal = null;
        System.out.println("Witch species: \n1.hamset\n2.dog\n3.cat");
        int choice = scanner.nextInt();
        if (choice == 1) {
            createAnimal(choice);
        } else if (choice == 2) {
            createAnimal(choice);
        } else if (choice == 3) {
            createAnimal(choice);
        } else {
            System.out.println("wrong choice");
        }
    }

    public static void createAnimal(int input) {
        // Animal animal;
        System.out.println("give name");
        String name = scanner.next();
        System.out.println("give age");
        Integer age = scanner.nextInt();
        if (input == 1) {
            Animal animal = new Hamster(name, age);
            animalList.add(animal);
        } else if (input == 2) {
            Animal animal = new Dog(name, age);
            animalList.add(animal);
        } else if (input == 3) {
            Animal animal = new Cat(name, age);
            animalList.add(animal);
        }
    }

}
