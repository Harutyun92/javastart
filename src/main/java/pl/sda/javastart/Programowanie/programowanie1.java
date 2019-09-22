package pl.sda.javastart.Programowanie;

public class programowanie1 {
    public static void main(String[] args) {
        System.out.println(czyLiczbaJestPierwsza(7));
        System.out.println(czyLiczbaJestPierwsza(6));
        System.out.println(czyLiczbaJestPierwsza(3));
    }

    private static boolean czyLiczbaJestPierwsza(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a/2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
