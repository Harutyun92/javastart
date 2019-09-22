package yt.rekurencja.kurss.a2;

import yt.rekurencja.kurss.a2.Laptop;

public class OOP {
    public static void main(String[] args) {
        Laptop Macintiosh = new Laptop(4, 512, 2.32f, true, "Apple");
        Macintiosh.getInfo();
        Laptop Acer = new Laptop(2, 256, 1.8f, false, "Acer");
        Acer.getInfo();
  //      Acer.COUNT = 60;
        System.out.println(Laptop.COUNT + " laptops created");
    }
}
