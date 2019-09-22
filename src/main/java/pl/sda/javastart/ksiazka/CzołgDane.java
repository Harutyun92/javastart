package pl.sda.javastart.ksiazka;

public class CzołgDane {
    private String nazwa;
    private double masa;
    private double pojemnoscZbiornika;
    private double spalanie;

    public CzołgDane(String nazwa, double masa, double pojemnoscZbiornika, double spalanie) {
        this.nazwa = nazwa;
        this.masa = masa;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.spalanie = spalanie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }

    public double getPojemnoscZbiornika() {
        return pojemnoscZbiornika;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public int dystans(int pojemnoscZbiornika, int spalanie) {
        return (pojemnoscZbiornika / spalanie) * 100;
    }

    public String toString() {
        return "Jestem czołgiem o nazwie " + nazwa + " " + "o masie " + masa + " kg " + " " + "oraz spalam " + spalanie + " litrow";
    }
}
