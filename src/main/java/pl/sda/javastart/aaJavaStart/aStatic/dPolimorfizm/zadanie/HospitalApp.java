package pl.sda.javastart.aaJavaStart.aStatic.dPolimorfizm.zadanie;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital=new Hospital();
        hospital.add(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hospital.add(new Nurse("Ania", "Dobroszewska", 2200, 6));
        hospital.add(new Nurse("Marta", "Danielska", 2100, 3));

        //Dzięki zdefiniowaniu metody toString() w klasie Hospital,
        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital);
    }
}