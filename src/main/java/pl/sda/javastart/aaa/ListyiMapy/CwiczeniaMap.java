package pl.sda.javastart.aaa.ListyiMapy;
import java.util.HashMap;
import java.util.Map;
public class CwiczeniaMap {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "jeden");
        mapa.put(2, "dwa");

        System.out.println(mapa.containsValue("jeden"));
        System.out.println(mapa.containsValue("cztery"));
        System.out.println(mapa.get(2));

        System.out.println("klucze");
        for (Integer integer : mapa.keySet()) {
            System.out.println(integer);
        }
        System.out.println("wartosci!Q!");
        for (String value : mapa.values()) {
            System.out.println(value);
        }
        System.out.println("klucze i wartosci");
        for (Map.Entry<Integer, String> integerStringEntry : mapa.entrySet()) {
            System.out.println(integerStringEntry);
        }
        for (Map.Entry<Integer, String> m : mapa.entrySet()) {
            int klucz = m.getKey();
            String wartosc = m.getValue();
            System.out.println(klucz + ":" + wartosc);
        }
        //pokazywanie tylko wartosci
        System.out.println(mapa.values());

        //pokazywanie tylko kluczy
        System.out.println(mapa.keySet());
       //usuwanie wartosci
        mapa.clear();
        System.out.println(mapa.values());
    }
}
