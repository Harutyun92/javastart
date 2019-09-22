package pl.sda.javastart.programowanie2;
// robimy HacCode=1, equals->OK

import java.util.Objects;
import java.util.Random;

public class HashCodeEqualsOne {
    private String firstName;
    private String secondName;
    private String lastName;

    public HashCodeEqualsOne(String firstName, String secondName, String lastName) {
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
        HashCodeEqualsOne hashCode = (HashCodeEqualsOne) o;
        return Objects.equals(firstName, hashCode.firstName) &&
                Objects.equals(secondName, hashCode.secondName) &&
                Objects.equals(lastName, hashCode.lastName);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
