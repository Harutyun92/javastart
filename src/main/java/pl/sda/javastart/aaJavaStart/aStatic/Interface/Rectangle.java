package pl.sda.javastart.aaJavaStart.aStatic.Interface;
//W przypadku interfejsów mówimy o ich implementacji przez klasy, WartoscAbsolutna nie o dziedziczeniu. Fakt ten wskazujemy korzystając ze słowa kluczowego implements.
// Jeżeli zdefiniowalibyśmy klasę Rectangle i nie zaimplementowali metod calculateArea() oraz calculatePerimeter(), to środowisko będzie podkreślało dokładnie taki sam błąd jak przy klasach abstrakcyjnych, informując nas o tym, że albo musimy oznaczyć klasę jako abstract, albo powinniśmy dodać wszystkie metody abstrakcyjne z interfejsu.
public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }
}
