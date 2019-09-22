package pl.sda.javastart.playlists;

public class OurRunnable implements Runnable {


    // trzeci sposob na napisanie tego co w klasie ThreadsExample
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " lambda runnable");
    }
}
