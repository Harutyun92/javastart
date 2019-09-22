package pl.sda.javastart.programowanie2.Zadanie;

public class b {

    public static void main(String[] args) {


        int liczbyPodzielnePrzez4 = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ", ");

                liczbyPodzielnePrzez4++;

                sum = i + sum;
            }
        }
        System.out.println();
        System.out.println("ilosc wytypowanych liczb podzielnych przez cztery " + liczbyPodzielnePrzez4);
        System.out.println("suma wynosi " + sum);
    }
}