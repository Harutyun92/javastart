package codingWars.LaczenieTablic;

import java.util.Arrays;
import java.util.TreeSet;

public class Zadanie3 {
    public static void main(String[] args) {

        int[] tab1 = new int[]{3, 2, 9, 4, 5};
        int[] tab2 = new int[]{1, 2, 6, 7, 8};
        int[] tab3 = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab3.length; i++) {
            if (i < tab1.length) {
                tab3[i] = tab1[i];
            } else {
                tab3[i] = tab2[i - tab1.length];
            }
        }
        System.out.println(Arrays.toString(tab3));

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < tab3.length; i++) {
            treeSet.add(tab3[i]);
        }
        System.out.println(treeSet);
    }
}