package pl.sda.javastart.day8zadanie;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerExample {

    private static Customer[] people = new Customer[]{         // to jest takie duze pole jak np private integer salary;
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    };

    public static void main(String[] args) {
      //  System.out.println("metodę, która zamieni tablicę people na listę people");
      //  System.out.println(customerList);
        System.out.println(" metodę, która zwróci mapę osób <id,osoba>");
        System.out.println(peopleMap());
        System.out.println("metodę, która zwróci mapę osób według zarobków");
        System.out.println(salariesMap());
        System.out.println("statystykę ile jest osób z danymi zarobkami");
        System.out.println(salaryStatsMap());
        System.out.println("metodę, która zwróci mapę map");
        System.out.println(mapOfMaps2());
        System.out.println("metodę, która zwróci mapę map");
        System.out.println(mapOfMapsStream());

    }
//Napisz metodę, która zamieni tablicę people na listę people - ta metoda może być potem wykorzystywana
// przez Was w następnych metodach
    public List<Customer> customerList() {         // robimy metody dwie  ktore beda zwracaly liste Customerow zamiast tablicy
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {               // za pomoca petli
            customers.add(customer);
        }
        return customers;
    }

    public List<Customer> customerWithStream() {
        return Arrays.stream(people)                    // za pomoca steama
                .collect(Collectors.toList());
    }

    public List<Customer> customerListWithArrays() {
        return Arrays.asList(people);
    }

//Napisz metodę, która przyjmie tablicę people i zwróci listę Stringów
// <imię nazwisko> (elementem listy będzie np "Anna Nowak")
         //PETLA
    public List<String> customerNamesList() {   // zbieramy imiona i nazwiska w liste za pomoca petli
        List<String> resultList = new ArrayList<>();
        for (Customer customer : people) {
            resultList.add(customer.getFirstname() + " " + customer.getSurname());  // pobieramy imie i nazwisko i zmieniamy w stringa
        }
        return resultList;
    }
//Napisz metodę, która przyjmie tablicę people i zwróci listę Stringów
// <imię nazwisko> (elementem listy będzie np "Anna Nowak")
         //STREAM
    public List<String> customerNameListWithStream() { // zbieramy imiona i nazwiska w liste za pomoca stream
        return customerList().stream()
                .map(e -> e.getFirstname() + " " + e.getSurname()) // zbieramy dane za pomoca map
                .collect(Collectors.toList());  // zbieramy za pomoca collect do listy
    }
    //Napisz metodę, która zwróci mapę osób <id,osoba>
    private static Map<Integer, Customer> peopleMap() {
        Map<Integer, Customer> resultMap = new HashMap<>();
        for (Customer customer : people) {
            resultMap.put(customer.getId(), customer);
        }
        return resultMap;
    }

    //Napisz metodę, która zwróci mapę osób według zarobków <zarobki,osoby_z_zarobkami> -> naszym key jest salary value bierzemy id i imie nazwisko

    public static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>(); // tworzymy nasza mape
        for (Customer customer : people) {
            if (resultMap.containsKey(customer.getSalary())) {       // tutaj sprawdzamy czy nasza mapa zawiera taki klucz, czyli nasze salary
                // tutaj nizej warunek gdy sprawdzilismy mape i nasza lista zawiera juz key
                List<String> innerList = resultMap.get(customer.getSalary()); // musimy pobrac salary z tego pola
                innerList.add(customer.getId() + ", " + customer.getFirstname() + ", " + customer.getSurname()); // i potem wstawiamy naszego goscia w to miejsce z tym samym key i dajemy inne value
            } else {
                // tutaj nizej warunek gdy sprawdzilismy mape i nasza lista nie waziera key
                List<String> innerList = new ArrayList<>();   // tworzymy wewnetrza liste ktora bedzie nasza sklejka id imie nazwisko ktore wstawi w pole value
                innerList.add(customer.getId() + ", " + customer.getFirstname() + ", " + customer.getSurname());
                resultMap.put(customer.getSalary(), innerList);             // jesli nie zawiera to wstawia nasze salary
            }
        }
        return resultMap;
    }

    //Napisz metodę, która zwróci statystykę ile jest osób z danymi zarobkami
    // <zarobki,liczba_osób> Map<Double,Integer>
    private static Map<Double, Integer> salaryStatsMap() {
        Map<Double, Integer> resultMap = new HashMap<>();
        for (Customer customer : people) {
            Double salary = customer.getSalary().doubleValue();
            Integer c = resultMap.get(salary) == null ? 0 : resultMap.get(salary);
            resultMap.put(salary, c + 1);
        }
        return resultMap;
    }

    //NApisz metodę, która zwróci mapę map <imię,<zarobki,liczba_osób_z_takimi_zarobkami>>
    private static Map<String, Map<Double, Integer>> mapOfMaps2() {
        Map<String, Map<Double, Integer>> outerMap = new HashMap<>();
        Map<Double, Integer> innerMap;// = new HashMap<>();
        for (Customer customer : people) {
            Double salary = customer.getSalary().doubleValue();
            if (outerMap.containsKey(customer.getFirstname().trim())) {
                innerMap = outerMap.get(customer.getFirstname().trim());
                Integer c = innerMap.get(salary) == null ? 0 : innerMap.get(salary);
                innerMap.put(salary, c + 1);
                outerMap.put(customer.getFirstname().trim(), innerMap);
            } else {
                innerMap = new HashMap<>();
                innerMap.put(salary, 1);
                outerMap.put(customer.getFirstname().trim(), innerMap);
            }
        }
        return outerMap;
    }

    //NApisz metodę, która zwróci mapę map
    private static Map<String, Map<Double, Long>> mapOfMapsStream() {
        return Arrays.stream(people)
                .collect(Collectors.groupingBy((Customer customer) -> customer.getFirstname().trim(), Collectors.groupingBy((Customer c) -> c.getSalary().doubleValue(),
                        Collectors.counting())));
    }
}