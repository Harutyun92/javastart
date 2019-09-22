package pl.sda.javastart.day7;

public enum ColourEnum {

    Black(1,"czarny"),WHITE(2,"biały"); //utworzylismy dwa publiczne obiekty cos takiego jak z new tylko bez niego

    private Integer colourNumber;
    private String plName;

    ColourEnum(int colourNumber, String plName) {
        this.colourNumber = colourNumber;
        this.plName = plName;
    }

    public Integer getColourNumber() {         //setow nie mamy bo nie sa potrzebne , wszystko juz jest ustwaione tak jak ma byc i nic nie mamy dodawac
        return colourNumber;
    }

    public String getPlName() {
        return plName;
    }
}
