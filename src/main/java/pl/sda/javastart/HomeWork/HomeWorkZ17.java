package pl.sda.javastart.HomeWork;

public class HomeWorkZ17 {
    public static void main(String[] args) {
             numberNotDivitedByThree(3);
    }

       // int n = 0;
       // while (n <= 20) {
         //   n++;
          //  if (n % 3 != 0) {

              //  System.out.println("Liczby od 1-20 niepodzielne przez 3 = " + n);
           // }
       // }
        public static void numberNotDivitedByThree(int param){
            int m =0;
            while (m<=20){
                m++;
                if(m%param!=0){
                    System.out.println(m);
                }
            }
        }
    }

