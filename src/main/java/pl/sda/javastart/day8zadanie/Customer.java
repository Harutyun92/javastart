package pl.sda.javastart.day8zadanie;

import java.math.BigDecimal;

public class Customer {

    private Integer id;
    private final String firstname;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;

    private static  Integer counter=1;   // piszemy wspolne pole ktore nalezy do klasy , dla id to robimy ze dodawalo do id+1 wtedy kiedy uzyjemy konstuktora lub druga metoda bloku inicjalizujacego, to nada sie +1

    {
        id= counter++;    // blok inicjalizujacy zostanie zrobiony przy kazdym stworzonym nowym obiekcie(new) , dajemy ++ Computerr nie +1 bo Integer jest inmutable i ++ podbije wartosc Computerr +1 nie
        System.out.println("BLOK INICJALIZUJACY");
    }

    // dajemy pierwszy konstruktor w ktorym salary jest STRINGIEM bo tak mamy w danych
    public Customer(String firstname, String surname, Integer age, String salary) {
      //  this.firstname = firstname;
       // this.surname = surname;
       // this.age = age;
       // this.salary = BigDecimal.valueOf(Integer.valueOf(salary));  // zmieniamy string do BigDecimal , musimy zamienic na integer bo on moze byc zamieniany na string Computerr , metoda valueOf nie
    this(firstname, surname,age,Integer.valueOf(salary)); // wczesniej byl ten konstruktor z gory ten jest ten sam tylko krotszy, zasstepuje String Integerem
    }
 // dajemy drugi konstruktor w ktorym salary jest INTEGEREM bo tak w zadaniu ze polowa salary tak jest
    public Customer(String firstname, String surname, Integer age, Integer salary) {  // dajemy drugi konstruktor bo dane w salary sa w stringu Computerr raz nie
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
        System.out.println("KONSTRUKTOR");
    }
  // DODAJEMY TYLKO GETTERY A SETTERY NIE BO NIE CHCEMY ZMIENIAC NASZYCH DANYCH , Computerr pozatym i tak sa fainal wiec bysmy nie mogli zmienic , getty dajemy bo potem bedziemy chcieli wyciagac dane do kolekcji
    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static Integer getCounter() {
        return counter;
    }
}

