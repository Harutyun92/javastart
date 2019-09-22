package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class CarOption {
    private String optionName;
    private BigDecimal optionPrice;
    private boolean choosen;

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
       this.optionName = optionName;          // dajemy this zeby odnosilo sie do optionName ktore jest wyzej , bo powtarza sie nazwa
    }

    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(BigDecimal optionPrice) {
        this.optionPrice = optionPrice;
    }

    public boolean isChoosen() {
        return choosen;
    }

    public void setChoosen(boolean choosen) {
        this.choosen = choosen;
    }
}
