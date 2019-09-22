package pl.sda.javastart.aaJavaStart.aStatic.cSuper;

public class Computerr {
    private double cpuTemperature;
    private int ramMemory;


    public Computerr(double cpuTemperature, int ramMemory) {
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }
    public void coolDown(){
        cpuTemperature=cpuTemperature-1;
    }


    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }


}
