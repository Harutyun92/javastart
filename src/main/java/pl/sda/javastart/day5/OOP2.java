package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        staticFinal();

        TestPerson person1=new TestPerson("Kowalski","Janusz");
        System.out.println(person1.getIdentity());
    }

    private static void staticFinal() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();
        System.out.println(person1.getIdentity());  // wyswietli nam 4 i 5 bo wyzej sa juz dwie metody i najpierw im zostaje przypisane 1 i 2 3
        System.out.println(person2.getIdentity());
        System.out.println("Ludzi na świecie jest: " + (TestPerson.counter - 1)); // jest to mozliwe bo counter jest static,dajemy -1 bo counter zaczyna sie od 1 Computerr nie od 0


        CalculatorUtils utils = new CalculatorUtils();          // tak piszemy bo w 1 metodzie w klasie CalculatorUtilis nie ma static
        System.out.println(utils.add(3, 7));
        System.out.println(CalculatorUtils.adding(4, 5)); // tutaj nie potrzeba tworzyc obiektu przez new , bo w klasie CalculatorUtils jest statyczna
        person1.setFirstName("Ola");
        ExperimentalObject eo = new ExperimentalObject(1, 2, person1);
        eo.setNotFinalImutable(6); // operacja zmiany referencji z 1 na 6
        System.out.println(eo.getFinalMutable().getFirstName());
        TestPerson personFromEo = eo.getFinalMutable(); // dostajemy sie do eo  potem poprzez get do persona
        personFromEo.setFirstName("Anna");
        System.out.println(eo.getFinalMutable().getFirstName());
    }

    private static void referenceExample() {
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);  // tu bedzie false bo s3 jest nowym obiektem
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // true bo nie porownuje miejsce w pamieci tylko napisy, equals porownuje napis
        Long fistNhmber = 127L;
        Long secondNhmber = 127L;
        System.out.println(fistNhmber == secondNhmber);
        System.out.println(fistNhmber.equals(secondNhmber));
        Long thirdNumber = 128L;
        Long fourthNumber = 128L;
        System.out.println(fourthNumber == thirdNumber); //false bo Longi porownuje do 127 Computerr == porownuje miejsce w pamieci , Computerr dla equals daje true bo porownuje wartosci
        System.out.println(fourthNumber.equals(thirdNumber));
    }

    private static void equalsExample() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();
        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setIdentity(123);
        person2.setIdentity(123);
        person1.setSurname("Nowak");
        person2.setSurname("Nowak");
        System.out.println(person1 == person2);        // false bo sa dwa rozne obiekty
        System.out.println(person1.equals(person2));  // nawet jak teraz damy inne nazwiska to bedzei true bo pesel jest taki sam i tylko to sprawdza, bo w klasie TestPerson zrobilismy has i equal na rownosc tylko dla peselu


        TestPerson person3 = new TestPerson("Anna", "Nowak", 123);
    }
}
