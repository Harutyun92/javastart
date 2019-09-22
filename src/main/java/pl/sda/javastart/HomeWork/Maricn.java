package pl.sda.javastart.HomeWork;
import java.util.Random;

public class Maricn {

        public static void main(String[] args) {
            Random rand = new Random();
            int x = rand.nextInt(100);
            int y = rand.nextInt(120);
            System.out.println("x= " + x + " y= " + y);

            // czy x jest wieksze od y
            boolean result = x > y;
            System.out.println(result);

            // czy x pomnożone przez 2 jest wieksze niz y
            boolean result1 = x * 2 > y;
            System.out.println(result1);
            // czy y jest mniejsze od sumy x + 3 i równoczesnie wieksze od x pomniejszonego o 2
            boolean result3 = x + 3 > y && x - 2 < y;
            System.out.println(result3);
            //czy iloczyn x i y jest parzysty
            boolean result4 = x * y % 2 == 0;
            System.out.println(result4);
        }
    }

