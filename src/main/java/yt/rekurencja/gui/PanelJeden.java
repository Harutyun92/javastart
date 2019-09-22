package yt.rekurencja.gui;

import javax.swing.*;

public class PanelJeden {
    public static void main(String[] args) {

        JFrame frame1 = new JFrame("Puste okno"); // tworzymy okno
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //zamkniecie ekranu
        frame1.setBounds(100, 100, 200, 200); // x,y,szerokosc,wysokosc
        frame1.setVisible(true); //pokaz okno
    }
}
