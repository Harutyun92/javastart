package pl.sda.javastart.day4;

public class DawidPotegaPierwszejDoDrugiej {
    public static void main(String[] args) {

    zadAruta(2,100);
}
    static void zadAruta(int firstNum, int secondNum) {

        int result = 0;
        for (int i = 0;; i++) {
            result = (int) Math.pow(firstNum, i);
            if (result > secondNum) {
                System.out.println("Your result exeeds the second number!!!");
                break;
            }
            System.out.println(result);
        }
    }
}
