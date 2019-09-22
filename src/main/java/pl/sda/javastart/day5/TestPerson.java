package pl.sda.javastart.day5;

import java.util.Objects;

public class TestPerson {
    private String surname;
    private String firstName;
    private int identity;
    static int counter;

    static {
        counter = 1;                 // BLOK STATYCZNY
    }

    {
        System.out.println("Blok inicjalizujacy");  // tworzy sie w oop wtedy kiedy tworzymy nowy obiekt
        this.identity = counter++;     //TO JEST BLOK INICJALIZUJACY , jak ktos np zapomni dodac PESEL
    }

    public TestPerson() {             // konstruktor bezparametrowy zeby dzialaly sety , odwoluja sie do tego nie do tego nizej public TestPerson
        //  this.identity = counter++;   // najpierw nada wartosc 1  dopiero potem podbije
    }

    public TestPerson(String surname, String firstName, int identity) {
        this(surname,firstName);    // nizej sie powtarza konstruktor surname i firstName dlatego mozemy tak zapisac i odnosi sie do tego co nizej
        this.identity = identity;
    }

    public TestPerson(String surname, String firstName) {
        this.surname = surname;
        this.firstName = firstName;
    }

    // naciskamy alt insert i wybieramy set i get
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }



    // alt insert i wybieramy equarl i hashcode , sprawdzamy czy to sa dwa takie same miejsce w pamieci
    @Override              // this to jest p1 Computerr o to jest p2
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPerson person = (TestPerson) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
}
