package a2;
import java.util.Arrays;

public class aaaaa {
    public static void main(String[] args) {


        Integer[] revTab={6,2,3,8,5,5,1};

        Arrays.stream(revTab)
                .filter(a->a>3)
                .distinct()
                .forEach(a-> System.out.println(a));
    }
}
