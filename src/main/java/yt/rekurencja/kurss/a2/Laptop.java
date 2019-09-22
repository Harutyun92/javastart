package yt.rekurencja.kurss.a2;

public class Laptop {

    private int ram, gfx;
    private float cpu;
    private boolean hasFan;
    private String brand;

    static int COUNT=0;

    public Laptop(int ram, int gfx, float cpu, boolean hasFan, String brand) {
        this.ram = ram;
        this.gfx = gfx;
        this.cpu = cpu;
        this.hasFan = hasFan;
        this.brand = brand;

        COUNT++;
    }

    public void getInfo() {
        System.out.println("" +
                "This is a " + brand + " laptop \n" +
                "CPU: " + cpu + " GHz" +
                "RAM; " + ram + " GB" +
                "GFX: " + gfx + " MB" +
                "Hasfan: " + hasFan);
    }
}

