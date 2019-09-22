package pl.sda.javastart.day7;

import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {

    public static final Student student1 = new Student("student3", "Nowak", 3, 5, 43, BigDecimal.valueOf(100));
    public static final Student student2 = new Student("student5", "Nowak ", 5, 4, 33, BigDecimal.valueOf(200));
    public static final Worker worker1 = new Worker("worker6", "Kowalski", 6, 20, BigDecimal.valueOf(200));
    public static final Pensioner pensioner1 = new Pensioner("pensioner7", "Psikuta", 7, 66, BigDecimal.valueOf(200));
    public static final Pensioner pensioner2 = new Pensioner("pensioner7", "Psikuta", 7, 66, BigDecimal.valueOf(200));

    public static void main(String[] args) {

        treeSetExample();
        listExample();
        hashSetExample();
        hashMapExample();
        namesStatisticsMap();

        System.out.println("Stream przyklad z liczeniem Nazwisk");
        List<Person> personList = populatePeopleList(); // dodajemy do list personList nasza liste juz stworzona nizej populatePeopleList
        Map<String, Long> resultMap = personList.stream()
                .map(e -> e.getLastName().trim())   // z kazdej osoby wyciagmy nazwiska i jak maja spacje to trimujemy
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())); // z nazwisk grupujemy nazwiska i na koncu je wyliczamy
        System.out.println(resultMap);
    }

    private static void namesStatisticsMap() {
        List<Person> personList = populatePeopleList();   // stworzylismy liste personList ktora uzupelnilismy juz gotowa lista populatePeopleList ktora mamy juz nizej stworzona
        Map<String, Integer> resultMap = new HashMap<>(); //piszemy mape ktora bedzie zliczala ile osob jest o tym samym nazwisku , czyli klucz bedzie nazwisko np nowak i w value bedzie wartosc 2 bo jest dwoch z takim nazwiskiem
        for (Person x : personList) {

            String ourKey = x.getLastName().trim();   // dodajemy zmienna ourKey, bo powtarza sie w kilku miejscach getLastName nizej, i dodajemy metode trim zeby obcinalo spacje jesli sa przy nazwisku
            if (resultMap.containsKey(ourKey)) {      // sprawdzamy przez if czy mapa juz zawiera dane nazwisko ( klucz), ta wersja sie wydarzy gdy mapa zawiera juz nasze nazwisko na liscie
                int counter = resultMap.get(ourKey);         // pobieramy wartosc z tablicy value, zebysmy mogli ja dalej zwiekszac
                resultMap.replace(ourKey, counter + 1);
            } else {
                resultMap.put(ourKey, 1);   // gdy nasza mapa nie zawiera danego nazwiska przypisywana jest 1
            }
        }
        System.out.println(resultMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(student1.getIdentity(), student1);     // w Mapach nie ma add tylko put dodajemy, poiszemy klucz czyli getIdentity (pesel) i value ktorym jest sam student1
        personsMap.put(worker1.getIdentity(), worker1);
        personsMap.put(pensioner1.getIdentity(), pensioner1);
        personsMap.put(student2.getIdentity(), student2);
        personsMap.put(pensioner2.getIdentity(), pensioner2);
        System.out.println("HashMapExample");
        System.out.println(personsMap);
    }

    private static void hashSetExample() {  // w hashset jest losowa kolejnosc wyswietlania
        Set<Person> ofPersonSet = new HashSet<>();
        //Set<Person> ofPersonSet=new LinkedHashSet<>(); // w linkedHashSet jest zachowana kolejnosc dodawania elementow
        System.out.println(ofPersonSet.add(student1));
        System.out.println(ofPersonSet.add(pensioner1));
        System.out.println(ofPersonSet.add(worker1));
        System.out.println(ofPersonSet.add(pensioner2)); // tutaj false bo w klasie person dalismy equals do pensionerow i sprawdza czy to ci sami i dodal juz pens1 wiec pens2 nie doda zeby nie dublikowac
        System.out.println(ofPersonSet.add(student2));
        System.out.println(ofPersonSet.size());
        System.out.println(ofPersonSet);
    }

    private static void listExample() {
        List<Person> personList = populatePeopleList();

        System.out.println(personList.contains(pensioner1));    // sprawdzamy np czy pensioner znajduje sie na liscie i ze mimo to ze wyzej nie dalismy pens1 w liscie to wyskoczy true bo dodalismy equals hashcode w klasie person i sprawdza pens1 i pens2 w klasie person i sa te same
        personList.remove(pensioner1);
        personList.remove(pensioner2);
        System.out.println(personList.contains(pensioner1));  // da false bo usunelismy juz pern1 z listy przez remove
    }

    private static List<Person> populatePeopleList() {  // metoda ktora zawiera liste naszych osob , moze przydac sie w kilku metodach bo uzywamy tych samych ludzi
        List<Person> personList = new ArrayList<>(); // ArrayList to sa obiekty ktore maja umiejetnosci jakie znajduja sie w klasie wyzszej czyli w List
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner2);   // niby to sa te same osoby, czyli pens1 i pens2 maja same dane to wyskoczy false bo utworzylismy dwa obiekty
        personList.add(pensioner1);
        return personList;
    }

    private static void treeSetExample() {  // posortowana kolejnosc wyswietlania jest w treeSet
        Set<Person> tSet = new TreeSet<>();  //polimorfizm wiec dajemy po lewo set Computerr po prawo to co nizej,   treeset zadziala jak bedzie implementowala interfejs comparable
        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet.toString());

        System.out.println("Wyswietlanie imion z uzyciem petli");
        for (Person person : tSet) {
            System.out.println(person.getFirstName());
        }


        System.out.println("Wyswietlanie imion z uzyciem Streamu");
        tSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}
