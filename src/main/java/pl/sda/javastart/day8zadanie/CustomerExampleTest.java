package pl.sda.javastart.day8zadanie;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerExampleTest {
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
        System.out.println("Lista osob");


    }

    public List<Customer> customerList() {
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer);
        }
        return customers;
    }

    public List<Customer> customerWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.toList());
    }

    public List<String> customerStringList() {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : people) {
            stringList.add(customer.getFirstname() + customer.getSurname());
        }
        return stringList;
    }
    public List<String>customerStringListStream(){
        List<String>stringListStream=new ArrayList<>();
        return customerList().stream()
                .map(e->e.getFirstname()+e.getSurname())
                .collect(Collectors.toList());

    }
    private static Map<Integer,Customer> peopleMap(){
        Map<Integer,Customer>resultMap=new HashMap<>();
        for (Customer customer :people ) {
            resultMap.put(customer.getId(),customer);
        }
        return resultMap;
    }


}

