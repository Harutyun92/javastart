package pl.sda.javastart.day1;

public class HomeWork {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a * b;
        System.out.print("pole prostokąta = ");
        System.out.println(c);
        System.out.println(rectangleArea(4, 5));
        System.out.println(rectangleCircuit(2, 2));
        System.out.println(inchToMeter(100));
        System.out.println(minutesToDateValue(601));
        System.out.println(sumThreeNumbers(567));
        System.out.println(bmi(100, 180));
        System.out.println(isEven(12));
        System.out.println(isDevitedByThreeAndFive(12));
    }


    public static int rectangleArea(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int rectangleCircuit(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    public static double inchToMeter(double inches) {
        double result = inches * 0.0254;
        return result;
    }

    public static String minutesToDateValue(int minutes) {
        int m = minutes % 60;
        int h = minutes / 60;
        int d = minutes / (60 * 24);
        int y = minutes / (60 * 24 * 365);
        return "y" + y + "d" + d + "h" + h + "m" + m;

    }

    public static int sumThreeNumbers(int number) {
        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number / 100;
        int sum = last + middle + first;
        return sum;
    }

    public static double bmi(double weight, double height) {
        double result = weight / Math.pow(height, 2);
        return result;
    }


    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //ZADANIE Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5
    public static boolean isDevitedByThreeAndFive(int a) {

        if (a % 3 == 0 && a % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}