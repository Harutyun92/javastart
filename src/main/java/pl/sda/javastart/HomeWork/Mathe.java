package pl.sda.javastart.HomeWork;

public class Mathe {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int x = 8;
        System.out.println(Math.pow(a, x) + (Math.pow(b, (x + 1)) + Math.pow(c, (x + 2))));

        int a1 = 10;
        int b1 = 11;
        int c1 = 12;
        int x1 = 1;
        System.out.println(Math.pow(a1, x1) + Math.pow(b1, (x1 + 1)) + Math.pow(c1, (x1 + 2)));

        int a2 = 8;
        int b2 = 8;
        int c2 = 8;
        int x2 = 3;
        System.out.println(Math.pow(a2,x2)+Math.pow(b2,(x2+1))+Math.pow(c2,(x2+2)));
    }
}
