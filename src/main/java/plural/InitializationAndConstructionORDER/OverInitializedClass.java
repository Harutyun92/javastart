package plural.InitializationAndConstructionORDER;

public class OverInitializedClass {

    private int theField=1;

    public int getTheField(){
        return theField;
    }

    {
        theField=2;
    }

    public OverInitializedClass(){
        theField=3;
    }
}

// kolejnosc najpierw jest pole , potem blok inizjalicujacy,potem konstruktor
// jak bedzie tak jak napisane wyswietli sie 3