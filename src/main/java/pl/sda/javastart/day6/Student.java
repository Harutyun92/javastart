package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder {
    private Integer indexNo;
    private BigDecimal scholarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.indexNo = indexNo;
        this.scholarship = scholarship;
    }

    public void introductionInner() {
            super.introduction();
            System.out.println("Ale tez studencik");
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + super.getLastName();       //chcemy z klasy persona wziac do workera imie i nazwisko bo tam sie znajduje, nie trzeba pisac super bo ta metoda znajduje sie w jednym miejscu i wiadomo skad musi byc brana
    }

    @Override
    public BigDecimal showIncome() {    // piszemy to zeby showIncome zwracalo nam tyle ile ustawimy zarobek
        return scholarship;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;

    }

    @Override
    public String toString() {                 // TO JEST POTRRZEBNE DO DNIA 7
        return "Studento{" +
                "indexNo=" + indexNo +
                ", scholarship=" + scholarship +
                "} " + super.toString();
    }
}
