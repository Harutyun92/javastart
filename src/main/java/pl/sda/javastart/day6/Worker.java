package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder {
    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        // super();- Jesli nie napiszemy super(....) z parametrami w tym miejscu znajdzie sie (niewidoczny) super() bez parametrow
        super(firstName, lastName, identity, age);
        this.salary = salary;
    }

    public void introductionInner() {
        super.introduction();
        System.out.println("Ale tez pracownik");
    }

    @Override
    public String showYourName() {       // implementujemy inforjamcje NameHolder do Workera
        return getFirstName() + " " + super.getLastName();       //chcemy z klasy persona wziac do workera imie i nazwisko bo tam sie znajduje, nie trzeba pisac super bo ta metoda znajduje sie w jednym miejscu i wiadomo skad musi byc brana
    }

    @Override
    public BigDecimal showIncome() {    // piszemy to zeby showIncome zwracalo nam tyle ile ustawimy zarobek
        return salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
