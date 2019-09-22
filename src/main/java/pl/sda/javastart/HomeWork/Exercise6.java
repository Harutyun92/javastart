package pl.sda.javastart.HomeWork;

import java.math.BigDecimal;

public class Exercise6 {   // Zamiana km/h na mile/h i odwrotnie

    static double kmphTOmph(double kmph) {

        return 0.6214 * kmph;
    }

    static double mphTOkmph(double mph) {

        return mph * 1.60934;
    }

    // zmiana km/h na m/s
    static double kmphTOmps(double kmph) {
        return 0.2777 * kmph;
    }

    //static double cTOfa(double c) {
    //return c = (5 / 9) * (fa - 32);
    //}

    //static double fTOc(double fa) {

    // return fa = 32 + (9 / 5) * c;
    // }

    public static void main(String[] args) {
        double kmph = 130;
        double mph = 100;
        double c = 20;
        double fa = 90;
        //String currency = "135.59";


        System.out.println("speed in miles/hr is " + kmphTOmph(kmph));
        System.out.println("speed in km/hr is " + mphTOkmph(mph));
        System.out.println("speed in m/s is " + kmphTOmps(kmph));
        //System.out.println(BigDecimal(currency));
    }

}

