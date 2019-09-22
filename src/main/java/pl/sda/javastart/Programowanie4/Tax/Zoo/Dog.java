package pl.sda.javastart.Programowanie4.Tax.Zoo;

public class Dog extends Animal {

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Dog: name: " + name + ", age: " + age;
    }
}
