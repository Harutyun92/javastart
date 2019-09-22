package pl.sda.javastart.day7;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("wystapil wyjatek: " + e.getMessage());
        }
        System.out.println(divide(2, 2));

        try {                                               // tutaj lapiemy jeden z dwoch exceptionow
            divideWithException(2, 0);
        } catch (MyRuntimeException | ArithmeticException e) { // lapiemy nasze dwa wyjatki zeby nie wyskoczyl exception przy wyswietlaniu
            System.out.println("wystapil wyjatek  : " + e.getMessage()); // dodaje nie dziel cholero przez zero dodaje do naszego tekstu
        }finally{
            System.out.println("Blok Finally");  // pojawi sie pomimo tego ze wystapilby wyzej exception
        }

    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int divideWithException(int a, int b) {
        if (b == 0) {
            throw new MyRuntimeException("Nie dziel cholero przez zero");
        }
        return a / b;
    }
    public static int divideWithCheckedException(int a, int b) throws MyCheckedException { // ta metoda ma rzucic exception
        if (b == 0) {
            throw new MyCheckedException("Nie dziel cholero przez zero");
        }
        return a / b;
    }
}
