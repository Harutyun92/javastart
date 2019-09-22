package pl.sda.javastart.Programowanie4.Tax.Totolotek;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        int[] numbers = new int[49];
        int[] winningNumbers = new int[6];
        int[] userNumber = new int[6];
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter = 0;
        int i;

        for (i = 0; i < winningNumbers.length; i++) {
            int randomNums = new Random().nextInt(49);
            winningNumbers[i] = randomNums;
        }
        System.out.println("Enter the 6 numbers");
        for (i = 0; i < userNumber.length; i++) {
            guesses = theNumbers.nextInt();
            userNumber[i] = guesses;
            if (winningNumbers[i] == userNumber[i]) {
                counter += 1;
            }
        }
        if (counter == 6) {
            System.out.println("you won!! Congratulations!");
        } else
            System.out.println(("you lose!"));
    }
}