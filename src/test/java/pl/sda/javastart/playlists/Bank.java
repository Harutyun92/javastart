package pl.sda.javastart.playlists;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
 // robimy static zeby w klasie clientActionrunnable mozna bylo sie odwolac do tych metod bez tworzenia obiektu , ze statycznego nie mozna sie odwolac do nie statycznych elementow
    private static Integer balance = 10000;
    public static Integer counter = 0;
 //   public static AtomicInteger counter=new AtomicInteger(0);  // mozemy zrobic atomicinteger zamiast countera i on jest juz sam w sobie synchronizowany

    public static void withdraw(Integer howmuch) {    // metoda na wyplacanie
        balance = balance - howmuch;  //!! int i integer jest inmutable czyli nie mozemy w nim grzebac i cos od niego odjac albo dodac i tak zostawic bo to sie nie zapisze , tylko musimy to przypisac do nowej zmiennej
        System.out.println(Thread.currentThread().getName()+" stan konta po wyplacie " + balance);
    }

    public static void deposit(Integer howMuch) {  // metoda na wplate
        balance = balance + howMuch;
        synchronized (Bank.class) {  // robimy zeby kazdy watek po kolei szedl do countera zeby nam counter dobrze liczyl a nie sie dublikowal
            counter = ++counter;  // jak zaczynamy od 0 to ++ z przodu albo counter+1 , jak od 1 to ++ z tylu
        }
            System.out.println(Thread.currentThread().getName()+" stan konta po wplacie " + balance);
    }
}
