package codingWars.LaczenieTablic.OX;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KolkoKrzyzykk {
    public static void main(String[] args) {

    }
    public String judge(List<Integer> history){

        Integer[][] winningCombinations = new Integer[][]
                {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
        Set setX = new HashSet<Integer>();
        Set setO = new HashSet<Integer>();
        for (int i = 0; i < history.size(); ++i) {
            if (i % 2 == 0) setX.add(history.get(i));
            else setO.add(history.get(i));
        }
        for (Integer[] comb : winningCombinations) {
            if (setX.containsAll(Arrays.asList(comb))) return "X_WIN";
            if (setO.containsAll(Arrays.asList(comb))) return "O_WIN";
        }
        return "NO_WINNER";
    }
}

