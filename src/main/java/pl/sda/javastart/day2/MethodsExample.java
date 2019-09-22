package pl.sda.javastart.day2;

import java.sql.SQLOutput;

public class MethodsExample {
    public static void main(String[] args) {               // Pair 1 : policzPoleProstokata  Computerr*b
        System.out.print("pole protokata = ");
        int a = 2;
        int b = 3;
        int x = a * b;
        System.out.println(x);             // kilka sposobow na zrobienie tego samego
        int result = rectangleArea(a, b);  //Fixme skad wiedzial jakie liczby wziac najpierw napisalismy 19-21 linijke potem sie tu cofnelismy , czyli napisalismy metode nizej Computerr potem ja tutaj wywolalismy
        System.out.println(result);
        result = rectangleArea(5, 5);
        System.out.println(result);        // to jest reużycie zmiennej result
        System.out.println(rectangleArea(4, 5));  // to jest uzycie metody wewnatrz argumentow drugiej metody

        System.out.println(rectangleCircuit(4, 6));  // !!!! PO NAPISANIU WSZYSTKICH METOD TU SIE COFAMY I PISZEMY SOUT
        System.out.println(inchToMeter(100));
        System.out.println(minutesToDateValue(601));
        System.out.println(sumThreeDigitsOfNumber(234));
        System.out.println(bmi(100, 190));      //Fixme dlaczego pierwsza metode zapisalismy wyzej Computerr potem sout Computerr pozostale inaczej(rectangleArea)
    }
    // Teraz zamiast ręcznie wszystko pisać , piszemy metode zeby bylo latwiej

    public static int rectangleArea(int a, int b) {
        int result = a * b;  // zmienna widoczna tylko wewnatrz tej metody
        return result;
    }

//ZADANIE 2: policzObwodProstokata

    public static int rectangleCircuit(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    // zadanie 3 inchToMeter inch * 0.0254
    public static double inchToMeter(double inches) {
        double result = inches * 0.0254;
        return result;
    }

    // Pair 4 ;minutesToDateValue    601minutes ->   0y 0d 10h 1m
    public static String minutesToDateValue(int minutes) { //todo dlaczego string Computerr nie int bo wynik jako nazwa ?
        int h = minutes / 60;  // dzielimy przez 60 min zeby pokazalo ile mamy godzin
        int m = minutes % 60; // robimy modulo z minutes zeby pokazalo reszte czyli ile minut zostaje
        int d = minutes / (24 * 60); // liczymy ile dni nam wyjdzie wiec dzielimy nasze minuty przez 24 razy 60 minut czyli tyle ile minut ma doba
        int y = minutes / (24 * 60 * 365);
        return y + "y " + d + "d " + h + "h " + m + "m ";
    }

    // Pair 5 : sumThreeDigitsOfNumber  234 -> 9   (3 cyfry) chcemy otrzymac sume trzech liczb czyli potrzebujemy po kolei otrzymac 2 , 3 i 4 i potem dodac je do siebie

    public static int sumThreeDigitsOfNumber(int number) {
        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number / 100;
        int sum = last + middle + first;

        return sum;
    }

    // Pair 5 bmi  waga/wzrost^2

    public static double bmi(double weight, double height) {
        double result = weight / Math.pow(height, 2);// w ten sposob potegujemy piszemy metode math.pow w nawiasie pierwsze jest wzrost Computerr drugie 2 czyli potega do drugiej
        return result;
    }
}