package pl.sda.javastart.ksiazka;
//Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego, które będą przechowywały po 3 dowolne liczby typu int.
// Program powinien wyświetlić sumę wszystkich liczb z obu tablic.
public class zadanie13tabliceee {
    public static void main(String[] args) {
        int[] tab1 = {6, 9, 12};
        int[] tab2 = {5, 10, 15};

        System.out.println("Suma liczb wynosi: ");
        int sum = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
        System.out.println(sum);

        System.out.println("Suma liczb za pomoca petli");
        int sum1 = 0;
        for (int i = 0; i < tab1.length; i++) {
            sum1 = tab1[i] +tab2[i]+ sum1;
        }

        System.out.println(sum1);
    }
    }
