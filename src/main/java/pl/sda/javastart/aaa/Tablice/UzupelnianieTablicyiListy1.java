package pl.sda.javastart.aaa.Tablice;

import java.util.ArrayList;

public class UzupelnianieTablicyiListy1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int sum=0;
        for (int i = 0; i <=10 ; i++) {
            list.add(i);
            System.out.println(i);
            int result = 0;
            for (Integer integer : list) {
                int intValue;
                intValue = integer;
                result += intValue;
            }
            sum = result;
        }
            System.out.println(sum);
        }
    }

