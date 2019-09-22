package pl.sda.javastart.programowanie2;
// HashCodeEqualsOne-> OK , equals -> Random boolean

import org.apache.commons.lang3.RandomUtils;

import java.util.Objects;
import java.util.Random;

public class HashCode2 {
    private String firstName;
    private String secondName;
    private String lastName;

    public HashCode2(String firstName, String secondName, String lastName) {
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
    private Random random=new Random();

    @Override
    public boolean equals(Object o) {
        return random.nextBoolean();
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, lastName, random);
    }
}
