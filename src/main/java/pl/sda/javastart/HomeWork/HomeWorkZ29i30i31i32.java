package pl.sda.javastart.HomeWork;

public class HomeWorkZ29i30i31i32 {
    public static void main(String[] args) {
        System.out.println(isEven(2,5));
        System.out.println(sumaDwoch(2,2,5));
    }

    public static boolean isEven(int param1, int param2) {
        if (param1 % 2 == 0 && param2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //Utwórz metodę, do której przekazujesz trzy liczby Computerr ona zwróci informację (wartość logiczną - `boolean`)
    // czy suma pierwszych dwóch daje trzecią. *w drugiej wersji sprawdź czy jakiekolwiek dwie dają trzecią.
    public static boolean sumaDwoch(int a, int b, int c){
        if(a+b==c){
            return true;
        }else{
            return false;
        }
    }
    //Utwórz metodę do której przekazujesz dowolną liczbę liczb:) i sprawdzasz czy jakakolwiek jest mniejsza od zera. #varargs
    //public static boolean czyJakasWiekszaOdZera()

        }


