package pl.sda.javastart.aaJavaStart.aStatic.cSuper;

public class Notebook extends Computerr {
    private int batteryCapacity;


    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);  //wywołanie konstruktora z klasy Computer
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void coolDown() {
        super.coolDown();  // metoda odziedziczona z klasy computer ktora obniza o -1 stopien , super oznacza ze metoda jest z klasy wyzej , bez super znaczy ze z tej klasy bysmy brali metode
        turboCool();   // dodatkowa metoda dla kllasy notebook ktora obniza jeszcze od 2 stopnie
    }
    public void turboCool(){
        setCpuTemperature(getCpuTemperature()-2); // sety i gety bo to sa pola prywatne , przed set i get tak naprawde jest slowo super ale nie zapisujemy go
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}

