package yt.rekurencja;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(9));
    }

    public int fib(int N) {
        if (N == 0)
            return 0;
        else if (N == 1)
            return 1;
        else
            return fib(N - 1) + fib(N - 2);
    }
}