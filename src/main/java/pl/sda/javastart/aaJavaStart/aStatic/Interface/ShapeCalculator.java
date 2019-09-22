package pl.sda.javastart.aaJavaStart.aStatic.Interface;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(5, 10);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód prostokąta: " + rect.calculatePerimeter());
        System.out.println("Pole prostokąta: " + rect.calculateArea());

        //Pamiętaj jednak, że nadal masz dostęp wyłącznie do metod dostępnych w typie referencji, więc jeśli chcesz odwoływać się
        // do metod getA(), czy getR() z klas Rectangle lub Circle, to niezbędne będzie wcześniejsze rzutowanie na konkretny typ.
        ((Circle)circle).getR();
        ((Rectangle)rect).getA();
        //Jeśli pojawia się u ciebie jednak potrzeba rzutowania, to rozważ zrezygnowanie z deklarowania zmiennej jako typu
        // ogólniejszego (Shape) i użyj po prostu od razu typów Circle lub Rectangle.
        // !!CZYLI NIE UWYWAMY POLIMORFIZMU I SHAPE CIRCLE= NEW TYLKO CIRCLE CIRCLE=NEW , WTEDY NIE MUSIMY RZUTOWAC
    }
}
