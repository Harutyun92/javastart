package pl.sda.javastart.programowanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private Object object=new Object();
    private Map<Object,Object> map=new HashMap<>();
    private List<Object> keys=new ArrayList<>();

    public static void main(String[] args) {
        new Main().start();
    }
    private void start(){
        put();
        check();
    }
    private void put(){  // metode piszemy na wrzucane do mapy 100 elementow
        for (int i = 0; i <100 ; i++) {
            HashCodeEqualsOne hashCodeEqualsOne=
                    new HashCodeEqualsOne("fm"+i,"fm"+i,"fm"+i); // dodajemy do kazdego stringa indeks zeby kazdy byl unikalny bo do kazdego dodamy inne i
            map.put(hashCodeEqualsOne,object); // wrzucamy do mapy kluczem jest hashcode , WartoscAbsolutna drugi parametr nie ma znaczenia wiec object
            keys.add(hashCodeEqualsOne); // gdzies musimy przytrzymac klucze zeby wiedziec gdzie szukac , do listy wrzucamy
        }
    }
    private void check(){
        int found =0;
        int notFound=0;
        for (int i = 0; i <keys.size() ; i++) {
            if(map.get(keys.get(i))==null){
                notFound++;
            }else{
                found++;
            }

        }
        System.out.println(String.format("Found:%d","Not found: %d", found,notFound));
    }
}

