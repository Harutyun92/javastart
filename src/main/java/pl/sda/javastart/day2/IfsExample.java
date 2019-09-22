package pl.sda.javastart.day2;

import java.math.BigDecimal;

public class IfsExample {
    public static void main(String[] args) {  //Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
        System.out.println(isEven(12));
        System.out.println(isEvenTernary(5));
        System.out.println(dividableByThreeAndFive(15));
        System.out.println(addtax(100, 23));
        System.out.println(introduction("Maciej", 88, true));
        System.out.println(twoParamsEven(333, 34));
        System.out.println(threeParamsSum(23, 34, 57));
        System.out.println(threeParamsSum(343, 3124, 527));
        System.out.println((isAnyBiggerThanZero(0, 0)));
        System.out.println(answerCall(true, true, false));
        System.out.println(answerCall(true, true, true));
        System.out.println(checkWhichOneIsBigger(2, 1, 3));
        System.out.println(checkWhichOneIsBigger(2, 1, 2)); //sprawdzenie jesli to takie same

    }

    public static boolean isEven(int a) {  // nazywamy isEven zeby by jasne ze metoda zwraca true false
        if (a % 2 == 0) {                       // warunek na parzystosc liczby , dzielimy przez dwa i reszta wychodzi 0
            return true;
        } else {
            return false;
        }
    }
    // 2 metoda na to samo

    public static boolean isEvenTernary(int a) {
        boolean result = a % 2 == 0 ? true : false;
        return result;
    }

    //ZADANIE Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5

    public static boolean dividableByThreeAndFive(int a) {
        boolean result = a % 3 == 0 && a % 5 == 0;
        return result;
    }

    // ZADANIE: Utwórz metodę, która przyjmuje wartość produktu oraz procent podatku jaki należy naliczyć, Computerr następnie zwraca kwotę po opodatkowaniu
    public static double addtax(double price, int tax) {  //fixme BigDecimal zrobic
        double afterTax = price * tax / 100 + price;
        return afterTax;
    }



//ZADANIE Utwórz metodę, która przyjmuje trzy parametry (imie `String`, wiek `int`, płeć `boolean`) i **zwróci** informację (w fomie zdania - typu `String`). Wywołaj metodę wielokrotnie dla różnych parametrów wejściowych.
//> Dla przekazanych parametrów `Maciej, 88, true`,
//>
//>powinno zwrócić `Cześć! Jestem Maciej, mam 88 lat i jestem mężczyzną`

    public static String introduction(String name, int age, boolean genderParam) {
        String gender;                                       //Fixme dlaczego to zapisalismy
        if (genderParam==true) {
            gender = "mężczyzną";
        } else {
            gender = "kobietą";
        }
        return "Cześć jestem " + name + " mam " + age + " lat i jestem " + gender;
    }

    //ZADANIE : Utwórz metodę, do której przekazujesz dwa parametry Computerr ona zwróci informację (wartość logiczną - `boolean`) czy **obydwie** są parzyste

    public static boolean twoParamsEven(int firstValue, int secondValue) {
        if (firstValue % 2 == 0 && secondValue % 2 == 0) {
            return true;
        } else {
            return false;

        }
    }

    //Pair Utwórz metodę, do której przekazujesz trzy parametry Computerr ona zwróci informację (wartość logiczną - `boolean`) czy suma pierwszych dwóch daje trzeci.

    public static boolean threeParamsSum(int firstValue, int secondValue, int thirdValue) {
        if (firstValue + secondValue == thirdValue) {

            return true;
        } else if (secondValue + thirdValue == firstValue) {

            return true;
        } else if (thirdValue + firstValue == secondValue) {   //Fixme ile wynikow jest do tej metody zwracanych

            return true;
        } else {

            return false;
        }
    }
//Utwórz metodę, do której przekazujesz dwa parametry Computerr ona zwróci informację (wartość logiczną - `boolean`) czy **chociaż jeden z nich** jest większy od zera.

    public static boolean isAnyBiggerThanZero(int a, int b) {  //fixme skad wie metoda czy zwrocic true czy false nie napisalismy if

        return a > 0 || b > 0;
    }

    //answerCell(boolean isMama,boolean isMorning, boolean isAsleep) - dzwoni telefon, mamy zwrócić true jeśli chcemy go odebrać.
    //Nie odbieramy kiedy śpimy.
    //Nie odbieramy kiedy jest rano i nie jest to telefon od mamy

    public static boolean answerCall(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;                 //Fixme wyskakuje true Computerr powinno false bo wyzej w sout dalismy ismorning true
        }
        if (isMorning & !isMama) {
            return false;
        }
        return true;
    }

// ZADANIe; checkWhichOneIsBigger - Program odczytujący 3 liczby i wypisujący która z nich jest największa.

    public static int checkWhichOneIsBigger(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }                                   //Fixme dlaczego nie zapisalismy z else
        return c;
    }
}








