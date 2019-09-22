package pl.sda.javastart.Programowanie4.Tax.Zoo;

public class Hamster extends Animal {

    public Hamster(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Hamster: name: " + name + ", age: " + age;
    }
}
