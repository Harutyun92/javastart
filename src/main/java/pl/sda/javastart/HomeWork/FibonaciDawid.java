package pl.sda.javastart.HomeWork;

public class FibonaciDawid {
    public static void main(String[] args) {
        System.out.println(fib(8));      // z returnem i w metodzie int wyswietla nam tylko jedna liczbe z ciagu ktora chcemy
    }                                        // z voidem wyswietla caly ciag fib i wtedy dajemy souty
    static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int fibResult = 1;
        int fibResultPrevious = 0;
        int temp= 0;
        for (int i=2; i<=n; i++) {
            temp = fibResult+fibResultPrevious;
            fibResultPrevious = fibResult;
            fibResult = temp;

        }
        return fibResult;
    }
}
