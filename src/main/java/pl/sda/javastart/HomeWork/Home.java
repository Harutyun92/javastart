package pl.sda.javastart.HomeWork;

public class Home {
    public static void main(String[] args) {


        int x = 100;
        System.out.println("Printing simple integer: x= " + x);

        double pi = Math.PI;
        System.out.printf("Formatted with precision: PI= " + "%.3f%n", pi);

        float n = 5.2f;
        System.out.printf("Formatted to specific width: n= " + "%.5f%n", n);

        n = 2324435.25f;
        System.out.println("Formatted to right margin: n= " + n);


    }
}
