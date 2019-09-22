package pl.sda.javastart.HomeWork;

public class HomeWorkZ33Policjant {
    public static void main(String[] args) {
        System.out.println(policemanGoodHumor(55,true));

    }
    public static String policemanGoodHumor ( int predkosc, boolean policemangoodhumor){
        if (policemangoodhumor == true){
            predkosc = predkosc -5;
        }else {
            predkosc = predkosc;
        }
        String mandat ="";
        if (predkosc <= 50){
            mandat = "brak mandatu";
        }else if (predkosc > 51 && predkosc <= 60){
            mandat = "100 zł";
        }else if (predkosc > 61 && predkosc <= 70){
            mandat = "200 zł";
        }else if (predkosc > 71){
            mandat = "300 zł";
        }
        return mandat;
    }
}