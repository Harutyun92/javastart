package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm.zadanie;
//Załóż, że w szpitalu pracują 3 osoby - 1 lekarz i 2 pielęgniarki,
//Hospital - przechowuje informacje o pracownikach szpitala w tablicy typu Person[]. Powinna istnieć metoda
// add() pozwalająca dodać nowego pracownika do tablicy pracowników
public class Hospital {
    private static final int MAX_EMPLOYEES=3; // przyda się także tymczasowa zmienna z informacją o aktualnej liczbie pracowników. Dzięki temu będziemy wiedzieli na które miejsce w tablicy wstawić kolejnego pracownika oraz będziemy mogli pominąć wartości null przy wyświetlaniu
    private Person[] employees = new Person[MAX_EMPLOYEES];
    private int employeesNumber;

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public void add(Person person){   // metoda na dodawanie osoby do szpitala
        if(getEmployeesNumber()<MAX_EMPLOYEES){  // sprawdzamy czy liczba osob nie jest wieksza od naszego zdeklarowanego max osob
            getEmployees()[getEmployeesNumber()]=person; // jestli nie to dodajemy pracownika do listy naszych pracownikow person
            setEmployeesNumber(getEmployeesNumber()+1); // zwiekszamy liczbe pracownikow o 1
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {   // wykorzystujemy petle to wyswietlania pracownikow , dzieki polimorfizmowi moglismy uzyc tablicy employees
            result = result + employees[i] + "\n";
        }
        return result;
    }
}
