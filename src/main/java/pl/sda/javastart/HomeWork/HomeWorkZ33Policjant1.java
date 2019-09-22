package pl.sda.javastart.HomeWork;

public class HomeWorkZ33Policjant1 {
    public static void main(String[] args) {
        policemanGoodHumor(62,true);

    }
    public static void policemanGoodHumor ( int predkosc, boolean policemangoodhumor){
        if (policemangoodhumor == true){
            predkosc = predkosc -5;
        }
        if (predkosc <= 50){
            System.out.println("brak mandatu");
        }else if (predkosc > 51 && predkosc <= 60){
            System.out.println("100 zł");
        }else if (predkosc > 61 && predkosc <= 70){
            System.out.println("200 zl");
        }else if (predkosc > 71){
            System.out.println("300 zł");
        }
    }
}

