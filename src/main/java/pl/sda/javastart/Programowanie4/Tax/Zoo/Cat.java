package pl.sda.javastart.Programowanie4.Tax.Zoo;

public class Cat extends Animal {

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduceYourself() {
        return "Cat: name: " + name + ", age: " + age;
    }
}
