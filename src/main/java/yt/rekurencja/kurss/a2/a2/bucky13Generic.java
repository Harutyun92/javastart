package yt.rekurencja.kurss.a2.a2;

// generyki uzywamy jak nie wiemy co jest na wejsciu i co mamy uzyskac , zamiast pisac 10 metod mozna napisac jedna ogolna generyczna ktora robi to samo

public class bucky13Generic {
    public static void main(String[] args) {


        Integer[] iray = {1, 2, 3, 4};
        Character[] cray = {'b', 'u', 'c', 'y'};

        printMe(iray);
        printMe(cray);
        //generyczne
        printMeG(iray);
        printMeG(cray);

    }

    public static void printMe(Integer[] i) {
        for (Integer x : i) {
            System.out.printf("%s ", x);
        }
        System.out.println();

    }

    public static void printMe(Character[] i) {
        for (Character x : i) {
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    // zamiast pisac przeciazone metody jak wyzej mozna zrobic metode generyczna

    //metoda generyczna wyswietli jedna metoda to samo co dwie metody wyzej
    public static <T> void printMeG(T[] x) {
        for (T b : x)
            System.out.printf("%s ", b);
        System.out.println();
    }
}
