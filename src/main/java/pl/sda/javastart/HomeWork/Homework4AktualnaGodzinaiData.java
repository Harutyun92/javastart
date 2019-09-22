package pl.sda.javastart.HomeWork;

import java.time.LocalDateTime;                 //Zadeklaruj pięć zmiennych typu int: minuta, godzina, rok, miesiac, dzien. Przypisz im odpowiednie wartości odczytując z zegara systemowego (klasa LocalDateTime). Wydrukuj bieżący czas zgodnie ze schematem: ”12:23 23.11.2017”

//Zmodyfikuj zadanie, aby można było oprócz daty i godziny wyświetlić ile minut minęło od północy. Dla wcześniejszego przykładu z zadaniaDodawanieNotnaPoczatkuString będzie to 743.
// Zmodyfikuj program, tak aby pokazywał ile procent doby już minęło.
// Dodaj wyświetlanie ile sekund zostało do końca doby.
public class Homework4AktualnaGodzinaiData {
    public static void main(String[] args) {
        task4();  // Na koncu uruchamiamy metode
    }

    public static void task4() {
        LocalDateTime actualTime = LocalDateTime.now();
        int day = actualTime.getDayOfMonth();
        int month = actualTime.getMonthValue();
        int year = actualTime.getYear();
        int hour = actualTime.getHour();
        int minute = actualTime.getMinute();
        String hourValue;      //piszemy warunek jezeli liczba jest mniejsza od 10 to chcemy przed nia dodac 0 , zeby bylo np 09 Computerr nie 9 samo
        if (hour < 10) {
            hourValue = "0" + hour;
        } else {
            hourValue = Integer.toString(hour);
//            hourValue = "" + hour;       druga metoda na to co wyzej
        }
        String minuteValue = minute < 10 ? "0" + minute : "" + minute; // piszemy metode dla minut zeby wyswietlalo 0 przed liczba minut jesli jest mniejsza od 10 czyli np 09 minut Computerr nie samo 9
        System.out.println(hourValue + ":" + minuteValue + " " + day + "." + month + "." + year);
        // piszemy kod ile minut minelo od polnocy
        System.out.println("Od polnocy minelo " + (hour * 60 + minute) + " minut");
    }


}
