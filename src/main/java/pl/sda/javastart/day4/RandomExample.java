package pl.sda.javastart.day4;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {                           // piszemy program ktory uzupelniamy losowymi liczbami i potem nam zwrata losowa liczbe
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prepareRandomArray(10)));  // uzywamy Arrays.toString bo to tablica , odpalamy metode z system out print zeby wszystko sie wyswietlilo
    }

    public static int[] prepareRandomArray(int howLong){
        int[] tabForRandNum=new int[howLong];
        Random random = new Random();
        for (int i =0; i<howLong; i++){
            tabForRandNum [i]= random.nextInt();     // jesli chcemy np zeby wylosowalo do 50 to wstawiamy w nawiasie 50

        }
        return tabForRandNum;
    }
}
