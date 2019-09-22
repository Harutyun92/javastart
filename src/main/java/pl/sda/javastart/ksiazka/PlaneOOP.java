package pl.sda.javastart.ksiazka;

public class PlaneOOP {
    public static void main(String[] args) {
        Plane boeing = new Plane();
        boeing.setName("737");
        boeing.setColor("white");
        boeing.setWeight(100);
        boeing.setFuelUsage(200);
        boeing.setCapasity(1000);
        System.out.println(boeing.distance(200, 1000));
        System.out.println(boeing);
    }
}



