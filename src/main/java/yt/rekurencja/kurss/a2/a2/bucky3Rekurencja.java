package yt.rekurencja.kurss.a2.a2;
 //rekurencja SILNIA

public class bucky3Rekurencja {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    //fact silinia
    public static long fact(long n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
}
 // 5! == 120
 // 5*4! == 120
 // 4*3! == 24
 // 3*2!== 6
 // 2*1! == 2
// 1!== 1