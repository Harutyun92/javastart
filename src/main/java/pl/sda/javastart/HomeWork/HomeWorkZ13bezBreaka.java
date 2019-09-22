package pl.sda.javastart.HomeWork;

public class HomeWorkZ13bezBreaka {
    public static void main(String[] args) {
        potegaLiczby(2, 100);
    }

    public static void potegaLiczby(int a, int b) {
        int potega = 0;
        for (int i = 0; ; i++) {
                potega = (int) Math.pow(a, i);
                if (potega <= b) {
                System.out.println(potega);
            }
        }
    }
}
