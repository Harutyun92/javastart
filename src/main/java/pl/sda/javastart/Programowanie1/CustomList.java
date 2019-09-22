package pl.sda.javastart.Programowanie1;

public class CustomList<X> {

    private final int pool = 10;
    private Object[] handler = new Object[10];
    private int position = 0;

    // robimy seta dajemy nazwe add czyli tak jakby set
    //piszemy metode ktora bedzie dodawala jakis element do naszej listy i potem zwracala jego pozycje
    public int add(X element) {       // zwracamy int pozycja w ktorym siedzi nasz obiekt
        handler[position] = element;   // do tablicy handler wrzucamy position
        int p = position++;             // podnosimy o jeden
        if (handler.length - 1 < position) {  //jesli nasza tablica sie przepelni to nizej tworzymy nowa
            Object[] customHandler = new Object[handler.length + pool];
            for (int i = 0; i < handler.length; i++) {
                customHandler[i] = handler[i];
            }
            handler = customHandler;
        }
        return p;   // zwraca nam pozycje w ktorej sie znajduje dany obiekt ktory wywolamy
    }

    // piszemy geta
    public X get(int p) {
        if (p > position) {   // sprawdzamy czy ten element byl juz wrzucony miesci sie w naszym przedziale
            throw new RuntimeException();
        }
        return (X) handler[p];  // musimy rzutowac bo stworzylismy object ogolny Object
    }

    //piszemy size
    public int size() {
        return position;
    }

    // piszemy isEmpty
    public boolean isEmpty() {
        return size() == 0;
        //return position ==0;
    }

    // piszemy clear
    public void clear() {
        handler = new Object[pool]; // nadpisujemy czysta tablice , moze byc rozmiarem 10 czyli pool
        position = 0;
    }
    //piszemy remove
    public void remove(int element){ // usuwamy jakis element z listy po indeksie
        if(element>position){    // sprawdzamy czy taki element w ogole istnieje
        throw new RuntimeException();
        }
        handler[element]=null; // po usunieciu jakiegos elementu z tablicy zostanie puste miejsce null
        Object[]tabb=new Object[handler.length]; // tworzymy nowa tablice w ktorej wstawimy pozostale elementy bez nulla

        int j=0;
        for (int i = 0; i <handler.length ; i++) {
            if(handler[i]!=null){
                tabb[j]=handler[i];
                j++;
            }
        }
        position--;
        handler=tabb;
    }
}
