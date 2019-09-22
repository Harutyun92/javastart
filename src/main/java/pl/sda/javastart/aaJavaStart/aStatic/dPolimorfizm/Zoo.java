package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog("Burek");;
        Animal cat = new Cat("Mruczek");


        //rzutowanie do zmiennej
        Dog specificDog = (Dog)dog;
        specificDog.bark();

        //rzutowanie "w locie"
        ((Cat)cat).meow();




    }
}
