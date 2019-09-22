package pl.sda.javastart.playlists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExample {

    @Test
    void runableBasics() {

        // tworzymy zadania
        //przypisujemy do zmiennej  zeby nowo utworzony watek wykonal to zadanie czyli wyswietlanie , bez tego wykonalby to watek glowny main
        Runnable lambdaRunnable = () -> System.out.println(Thread.currentThread().getName() + " lambda runnable");// dostajemy sie do nazwy watku zeby zobaczyc w jakim watku pracujemy, sluzy do tego curretThreat

        // jak zrobimy alt enter to zamieni na lambde czyli to co wyzej
        Runnable anonymousRunnable = new Runnable() {  // to jest klasa anonimowa , runable jest interfacem nie mozemy ogolnie tworzyc obiektu new interface ale w tym przypadku mozna bo implrementujemy jego metode
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " lambda runnable");
            }
        };

        Runnable ourRunnable = new OurRunnable();  // tworzymy obiekt z klasy ourRunnable

        Thread thread1 = new Thread(lambdaRunnable);
        Thread thread2 = new Thread(anonymousRunnable);
        Thread thread3 = new Thread(ourRunnable);
        thread1.start();   /// run odpali watek z ktorego jest uruchaniany w tym wypadku main
        thread2.start();
        thread3.start();
        System.out.println();
    }

    @Test
    void bankSequential() {    // uruchamiamy 100 razy nasza operacje wyplaty i wplaty
        for (int i = 0; i < 100; i++) {
            Runnable car = new ClientActionRunnable();
            car.run();
        }
    }

    @Test
    void bankWithThreads() {
        List<Thread> threadList= new ArrayList<>(); // tworzymy liste watkow zeby wszystkie jednoczesnie wykonywaly przydzielone zadania wplat i wyplat
        for (int i = 0; i < 1000; i++) {
            Runnable car = new ClientActionRunnable();
            Thread thread = new Thread(car);
            thread.start();
            threadList.add(thread);
                                                             //TODO
        }
        for (Thread thread : threadList) {
            thread.start();
        }
        System.out.println(" liczba operacji: " + Bank.counter);
    }
}
