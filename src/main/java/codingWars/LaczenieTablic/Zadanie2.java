package codingWars.LaczenieTablic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        int[]first={1,2,3};
        int[]second={2,3,4,5};
        System.out.println(Arrays.toString(mergeArrays(first, second)));
    }

    public static int[]mergeArrays(int[]first,int[]second) {

        Integer[] firstInteger = new Integer[first.length];
        for (int i = 0; i < firstInteger.length; i++) {
            firstInteger[i] = first[i];
        }
        Integer[] secondInteger = new Integer[second.length];
        for (int i = 0; i < secondInteger.length; i++) {
            secondInteger[i] = second[i];
        }
        List<Integer> firstList = Arrays.asList(firstInteger);
        List<Integer> secondList = Arrays.asList(secondInteger);
        List<Integer> result = new ArrayList<>();
        List<Integer> all = new ArrayList<>();
        all.addAll(firstList);
        all.addAll(secondList);
        for (int i = 0; i < all.size(); i++) {
            if (!result.contains(all.get(i))) ;
            result.add(all.get(i));
        }

    int[]res=new int[result.size()];
        for (int i = 0; i <result.size() ; i++) {
            res[i]=result.get(i).intValue();
        }
        Arrays.sort(res);
        return res;
    }
}
