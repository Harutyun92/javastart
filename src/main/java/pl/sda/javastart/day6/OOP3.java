package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
        // Person person1 = new Person();
        // Worker worker1 = new Worker();
        Worker worker = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia", "Kowalska", 321, 20, 333, BigDecimal.valueOf(1000));
        Pensioner pensioner = new Pensioner("Janusz", "Kwiatkowski", 912, 34, BigDecimal.valueOf(2000));

        Person[] people = new Person[]{worker, student, pensioner};   // tworzymy tablice w ktorej umieszamy worker,student,pensioner, tablica jest typu Person bo wszyscy sa w Personie
        Object[] objects = new Object[]{worker, student, pensioner};   // tworzymy tablice w ktorej umieszamy worker,student,pensioner, tablica jest typu Object bo wszyscy sa w klasie matka Object

        List<Person> peopleList = new ArrayList<>();                      // tworzymy liste, moze byc new ArrayList Computerr po lewo List bo to polimorfizm i List jest wyzej w hierarchi niz Arraylist
        peopleList.add(worker);
        peopleList.add(student);                         //Dodawanie obiektow ktore mamy stworzone do listy
        peopleList.add(pensioner);

        printDataLegacyMode(worker, student, pensioner);
        prinatDataProperWay(peopleList);

        List<NameHolder>nameHolders=new ArrayList<>();
        nameHolders.add(worker);
        nameHolders.add(student);
       // nameHolders.add(pensioner);           // nie da sie zrobic bo nie implementuje tego interfejsu , bo w klasie pensioner nie zrobilismy implementacji tak jak w student i worker

        printNames(nameHolders);
    }

    private static void printNames(List<NameHolder> nameHolders) {
        for(NameHolder nameHolder:nameHolders){
            System.out.println(nameHolder.showYourName());
        }
    }

    private static void printDataLegacyMode(Worker worker, Student student, Pensioner pensioner) {
        System.out.println(worker.showIncome());
        System.out.println(student.showIncome());
        System.out.println(pensioner.showIncome());
        worker.introductionInner();
        student.introductionInner();
        pensioner.introductionInner();

    }

    private static void prinatDataProperWay(List<Person> peopleInfo) {
        for (Person person : peopleInfo) {                   //petla for each
            System.out.println(person.showIncome());
            if (person instanceof Worker) {                 // sprawdzamy czy dany obiekt na ktorym obecnie pracujemy czy jest workerem, instanceof cos jest podtypem tej klasy
                ((Worker) person).introductionInner();  // piszemy tak zeby kompilator wiedzial ze to jest obiekt typu Worker, zebysmy mieli dostep do metody introductionInner ktory jest w Worker Computerr w personie jest samo intodruce
            } else if (person instanceof Student) {
                ((Student) person).introductionInner();
            } else {
                ((Pensioner) person).introductionInner();
            }
        }
    }
}
