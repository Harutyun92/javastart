package pl.sda.javastart.aaJavaStart.aStatic.Static;

public class zadanieOPP {
    public static void main(String[] args) {
        System.out.println("Liczba studentow na poczatku " + zadanie.getStudentNumber());
        zadanie student= new zadanie("adam","kowalski",123);
        zadanie student2=new zadanie("tomek","nowak",222);
        System.out.println("Liczba studentow po dodaniu "+ zadanie.getStudentNumber());
    }
}
