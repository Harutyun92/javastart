package pl.sda.javastart.day8zadanie;

import java.math.BigDecimal;

public class CustomerTest {
    private Integer id;
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;

    private static Integer counter = 1;

    {
        id = counter++;
        System.out.println("Blok inicjalizujacy");
    }

    public CustomerTest(String firstName, String surname, Integer age, String salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));

    }

    public CustomerTest(String firstName, String surname, Integer age, Integer salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
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
