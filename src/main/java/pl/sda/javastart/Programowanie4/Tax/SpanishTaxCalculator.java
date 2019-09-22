package pl.sda.javastart.Programowanie4.Tax;

public class SpanishTaxCalculator implements TaxCalculator {


    @Override
    public int calculateTax(int amountToCalculate) {
        return (int) (amountToCalculate*1.29);
    }
}
