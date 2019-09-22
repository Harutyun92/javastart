package pl.sda.javastart.day4;

import pl.sda.javastart.day7.ColourEnum;

import java.math.BigDecimal;

public class Car {                         // schemat do tworzenia obiektow, obiekty tworzymy poprzez uzycie slowka new
    private ColourEnum colour;             // uzywamy z dnia 7
    private String model;
    private String manufacture;
    private String vin;
    private int hp;
    private BigDecimal basePrice;
    private int doorNumber;
    private CarOption[] options;             // chcemy miec tablice wyposazenia , dlatego tablica wstawiona , CarOption zeby z klasy tej bralo

    public BigDecimal summaryPrice() {
        BigDecimal result = basePrice;
        if (options == null) {
            return result == null ? BigDecimal.ZERO : result;
        } else {

            for (int i = 0; i < options.length; i++) {                 // to jest opcja napisania metody w klasie Car zeby od razu tam sie znajdywala i dawala nam jaka jest cena , zeby cena byla od razu elementem klasy CAR
                result = result.add(options[i].getOptionPrice());
            }
            return result;
        }
    }
    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;               // dajemy this.colour bo sie powiela nazwa ,
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {       // potrzebujemy set zeby nadac model dla Car
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public CarOption[] getOptions() {
        return options;
    }

    public void setOptions(CarOption[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return model + " " + summaryPrice();
    }
}
