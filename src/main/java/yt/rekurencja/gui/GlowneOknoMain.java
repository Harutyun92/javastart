package yt.rekurencja.gui;

import javax.swing.*;
// ta klasa tworzy nowe okno i doczepia do tego okna ten nasz panel czyli klase tloPanel
public class GlowneOknoMain extends JFrame {
    public GlowneOknoMain(){

        //Konfigurujemy okno
        setTitle("Palindrom i Pingiwn");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(450,100);

        //Dodajemy tlo panel
        JPanel panel= new TloPanel();
        getContentPane().add(panel);

        // Pokaz okno razem z zawartoscia
        pack();  // dostosuj okno do zawartosci
        setVisible(true); // pokaz okno
    }

    public static void main(String[] args) {
        new GlowneOknoMain();
    }
}
