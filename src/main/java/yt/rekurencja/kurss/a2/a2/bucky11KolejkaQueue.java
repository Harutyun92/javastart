package yt.rekurencja.kurss.a2.a2;

import java.util.PriorityQueue;

public class bucky11KolejkaQueue {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ",q);
        System.out.println();

        // zwroca pierwszy element w kolejce
        System.out.printf("%s ",q.peek());
        System.out.println();

        //usuwa pierwszy element w kolejce
        q.poll();
        System.out.printf("%s ", q);
    }
}
