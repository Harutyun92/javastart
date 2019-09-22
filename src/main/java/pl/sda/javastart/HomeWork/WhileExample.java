package pl.sda.javastart.HomeWork;    //countdown - odliczanie w dół po podaniu liczby startowej

public class WhileExample {
    public static void main(String[] args) {
        countDownFor(10);                    // napisalismy to co nizej Computerr potem wywolalismy z countDownFor
        countDownFor(-1);                    // napisalismy to co nizej Computerr potem wywolalismy z countDownFor
        countDownWhile(10);
        countDownWhile(-1);
        countDownDoWhile(-1);
        countDownDoWhile(7);

    }


    public static void countDownFor(int start) {
        System.out.println("Parametr = " + start);
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void countDownWhile(int start) {
        System.out.println("Parametr = " + start);
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
    }

    public static void countDownDoWhile(int start) {
        System.out.println("Parametr = " + start);
        if (start <= 0) {
            System.out.println("nieprawidlowy parametr " + start);
            return;
        }
        do {
            System.out.println(start);
            start--;
        } while (start >= 0);
    }

}

