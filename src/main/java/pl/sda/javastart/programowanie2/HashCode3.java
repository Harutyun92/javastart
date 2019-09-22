package pl.sda.javastart.programowanie2;
//hashcode random , equals ok

import java.util.Objects;
import java.util.Random;

public class HashCode3 {
    private String firstName;
    private String secondName;
    private String lastName;

    public HashCode3(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    Random random = new Random();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode3 hashCode3 = (HashCode3) o;
        return Objects.equals(firstName, hashCode3.firstName) &&
                Objects.equals(secondName, hashCode3.secondName) &&
                Objects.equals(lastName, hashCode3.lastName) &&
                Objects.equals(random, hashCode3.random);
    }

    @Override
    public int hashCode() {
        return random.nextInt();
    }
}
