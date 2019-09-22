package a1;

public class Rekurencja {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int n){
        if(n<2) return 1;
        return n * factorial(n-1);
    }
}
