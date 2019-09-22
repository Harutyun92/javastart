package pl.sda.javastart.HomeWork;

public class HomeWorkFibbiSilnia {
    public static void main(String[] args) {
        fibonacci(7);
        silnia(5);
    }
    private static void fibonacci(int numberOfElements) { //chcemy wyswietlic 6 elementow
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println(0);                    //wypisujemy juz 0 w sout, wiec zostaje do wypisania 5 elementow dlatego counter 1 bo do 6 jest piec elementow
        System.out.println(1);                    // wpisujemy 1 zeby byly dwie jedynki
        while (counter < numberOfElements) {
            int sum = first + second;               // potrzebujemy kolejna zmienna zeby liczyc dalsze liczby
            System.out.println(sum);
            first = second;                          // idziemy dalej w prawa strone dlatego liczba first juz jest dla nas liczba second
            second = sum;                            // Computerr liczba second czyli druga bedzie suma first i second
            counter++;
        }
    }
    private static void silnia(int param) {
        int temp = 1;
        for (int i = 1; i <= param; i++) {
            temp = temp * i;
            System.out.println(temp);
        }
    }
}



