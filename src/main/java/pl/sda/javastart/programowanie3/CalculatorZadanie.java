package pl.sda.javastart.programowanie3;

public class CalculatorZadanie {
    public static void main(String[] args) {
        System.out.println(addition(5,5));
        System.out.println(substraction(10,5));
        System.out.println(multiplication(10,10));
        System.out.println(division(100,10));
    }
    public static int addition(int a,int b){
        return a+b;
    }
    public static int substraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
}
