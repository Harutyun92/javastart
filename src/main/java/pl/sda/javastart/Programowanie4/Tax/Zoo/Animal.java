package pl.sda.javastart.Programowanie4.Tax.Zoo;

public abstract class Animal implements Introduction {
    public String name;
    public Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduceYourself() {
        return "name: " + name + ", age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
