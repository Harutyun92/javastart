package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm.zadanie;

public class Doctor extends Person {
    private double bonus;

    public Doctor(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+"premia "+bonus;
    }
}
