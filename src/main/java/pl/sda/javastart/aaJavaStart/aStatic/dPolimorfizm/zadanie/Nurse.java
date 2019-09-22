package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm.zadanie;

public class Nurse extends Person {
    private double overTime;

    public Nurse(String firstName, String lastName, double salary, double overTime) {
        super(firstName, lastName, salary);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        return super.toString() + " nadgodziny " + overTime;
    }
}
