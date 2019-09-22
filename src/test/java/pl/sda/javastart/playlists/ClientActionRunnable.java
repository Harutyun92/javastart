package pl.sda.javastart.playlists;

import java.util.Random;

public class ClientActionRunnable implements Runnable{  // klasa na czynnosc czyli na ludzika ktory wyplaca i wplaca

    @Override
    public void run() {
        int howMuch=new Random().nextInt(101);  // bierzemy random zeby wyplacalo z przedzialu 100 zl dla kazdego klienta
        Bank.withdraw(howMuch);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bank.deposit(howMuch);
    }
}
