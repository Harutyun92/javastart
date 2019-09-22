package codingWars.LaczenieTablic;

import static java.lang.Math.abs;

public class WartoscAbsolutna {
    public static void main(String[] args) {
        System.out.println(makeNegative(5));
    }

    public static int makeNegative(int x) {
        return -abs(x);


        //return Math.abs(x)*-1;

        //return (x < 0) ? x : -x;

        //  if (x <= 0){
        //      return x;
        //    } else {
        //      return -1*x;
        //    }
        //
        //  }
    }
}
