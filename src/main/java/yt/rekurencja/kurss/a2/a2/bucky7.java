package yt.rekurencja.kurss.a2.a2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//lista , metody z collection
public class bucky7 {
    public static void main(String[] args) {

        String[] crap = {"apples", "lemons", "greese", "bacon", "youtube"};

        //konwertujemy tablice na liste
        List<String> l1 = Arrays.asList(crap);

        // sortujemy liste wedlug alfabetu
        Collections.sort(l1);
        System.out.printf("%s\n", l1);

        //sortuje odwrotnie , podajemy co chcemy sortowac wiec l1 i w jakiej kolejnosci
        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);

    }
}
