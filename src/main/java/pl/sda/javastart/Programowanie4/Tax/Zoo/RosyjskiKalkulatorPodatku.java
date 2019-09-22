package pl.sda.javastart.Programowanie4.Tax.Zoo;

public class RosyjskiKalkulatorPodatku implements KalkulatorPodatku {

    @Override
    public int policzPodatek(int kwotaDoPoliczenia) {
        return (int) (kwotaDoPoliczenia*0.20);
    }
}
