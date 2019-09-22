package pl.sda.javastart.aaJavaStart.aStatic.TypyGeneryczne;
//Zdefiniuj typ generyczny zgodny z konwencją JavaBeans o nazwie Pair (para), który przyjmuje dwa parametry typów T, V i jest w
// stanie przechowywać po jednej instancji każdego z nich.
//W klasie testowej utwórz trzy obiekty typu Pair z różnymi argumentami, zdefiniuj metodę generyczną wyświetlającą
// informację o dowolnej parze.
public class Pair<T, V> {
    private T t;
    private V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
