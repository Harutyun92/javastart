package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Person implements Comparable<Person> {  // implements robimy to dnia 7 do collections example

    private String firstName;
    private String lastName;
    private Integer identity;  //int ma domyslnie wartosc 0, Integer ma null--> null jest fajniejszy
    private Integer age;       //int ma domyslnie wartosc 0, Integer ma null--> null jest fajniejszy

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }

    protected void introduction(){
        System.out.println("Jestem człowiekiem");
    }

    public abstract BigDecimal showIncome();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +                                     // TO JEST DO DNIA 7 do collectionsExample
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identity=" + identity +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {                // WSTAWIAMY alt + inters i equals hashcode , zeby sprawdzil dwoch pensionerow ktorych stworzylismy w day7 w collectionExample , czy to sa ci sami goscie
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(identity, person.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    @Override
    public int compareTo(Person o) {
        return this.identity.compareTo(o.getIdentity());  // Prorownujemy PESELE
    }
}
