package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Pensioner extends Person {
    private BigDecimal pension;

    public Pensioner(String firstName, String lastName, Integer identity, Integer age, BigDecimal pension) {
        super(firstName, lastName, identity, age);
        this.pension = pension;
    }

    public void introductionInner() {
        super.introduction();
        System.out.println("Ale tez emerytem");
    }

    @Override
    public BigDecimal showIncome() {    // piszemy to zeby showIncome zwracalo nam tyle ile ustawimy zarobek
        return pension;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }
}
