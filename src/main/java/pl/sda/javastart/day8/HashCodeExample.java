package pl.sda.javastart.day8;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {

        ConstantHashCode const1 = new ConstantHashCode("1");
        ConstantHashCode const2 = new ConstantHashCode("1");
        ConstantHashCode const3 = new ConstantHashCode("1");
        ConstantHashCode const4 = new ConstantHashCode("1");
        ConstantHashCode const5 = new ConstantHashCode("1");

        RandomHashCode random1= new RandomHashCode("2");
        RandomHashCode random2= new RandomHashCode("2");
        RandomHashCode random3= new RandomHashCode("2");
        RandomHashCode random4= new RandomHashCode("2");
        RandomHashCode random5= new RandomHashCode("2");

        System.out.println("constant");
        Set<ConstantHashCode>constantHashCodes=new HashSet<>(); // tworzymy HashSet w constant mamy 5 takich samych wartosci i set sie nie dublikuje wiec dodaje sie tylko jeden, losuje hashcode idzie do backetu 5 w tablicy w mapie i wstawia value 1 i tak po kolei do tego samego backetu dlatego tylko 1 pokazuje
        constantHashCodes.add(const1);
        constantHashCodes.add(const2);
        constantHashCodes.add(const3);
        constantHashCodes.add(const4);
        constantHashCodes.add(const5);
        System.out.println(constantHashCodes.size()); // wypisujemy ile bedzie elementow

        System.out.println("random");
        Set<RandomHashCode> randomHashCodes =new HashSet<>(); // tworzymy HashSet , na tablicy w mapie bedzie losowane miejsce w backecie w przedziale jaki ustawilismy np 5, 10 , 444 i bedzie wstawiwane w kazde miejsce value 2 , moze sie powtorzyc ktores miejsce
        randomHashCodes.add(random1);
        randomHashCodes.add(random2);
        randomHashCodes.add(random3);
        randomHashCodes.add(random4);
        randomHashCodes.add(random5);
        System.out.println(randomHashCodes.size());

        System.out.println(randomHashCodes.contains(random1)); // sprawdzamy czy w naszym przedziale jaki ustawilismy 0-10 znajduje sie nasz wylosowany random1(nr backet w tablicy)
    }
}
