package yt.rekurencja.gui;

import javafx.util.Builder;

public class Person1 {

    String name;
    String secondName;
    String lastName;
    Integer pesel;


    static class Builder {
        private String name;
        private String secondName;
        private String lastName;
        private Integer pesel;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public Builder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }


        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPesel(Integer pesel) {
            this.pesel = pesel;
            return this;
        }

        public Person1 build() {
            Person1 person1 = new Person1();
            person1.name = this.name;
            person1.lastName = this.lastName;
            person1.pesel = this.pesel;
            person1.secondName = this.secondName;
            return person1;
        }

    }

    public static void main(String[] args) {
        Person1 person1 = new Person1.Builder()
                .setLastName("LastName")
                //.setName("Name")
                //.setPesel(1234)
               //.setSecondName("second")
                .build();
    }

}
