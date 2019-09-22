package plural.ConstructorVisibility;

import org.attoparser.select.ParseSelection;

public class Passenger {
    int freeBags;
    int checkedBags;
    double perBagFee;

    public Passenger() {
    }

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFree) {
        this.perBagFee = perBagFree;
    }

    Passenger fred = new Passenger(2);
    Passenger jane = new Passenger(2,3);
}
