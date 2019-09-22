package plural;

public class pl1 {
    public static void main(String[] args) {

        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {
            factorial = factorial * kVal;
            kVal--;
        }
        System.out.println(factorial);
    }
}
