package yt.rekurencja.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;

// najpierw stworzylismy 4 male panele i przyczepilismy do naszego glownego panela ktore jest tlem i w koncu to tlo doklejamy do naszego okna

public class CzteryPanele extends JFrame {

    public CzteryPanele(){ // konstruktor
        this.setTitle("Kolorowe okna ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mozna napisac this. przed lub nie
        this.setLocation(200,200);

        //Ustaw staly rozmiar panelu
        final Dimension rozmiarPanelu=new Dimension(100,200);

        //Stworz cztery male panele
        JPanel panel1=new JPanel();
        panel1.setPreferredSize(rozmiarPanelu);
        panel1.setBackground(Color.blue);

        JPanel panel2=new JPanel();
        panel2.setPreferredSize(rozmiarPanelu);
        panel2.setBackground(Color.yellow);

        JPanel panel3=new JPanel();
        panel3.setPreferredSize(rozmiarPanelu);
        panel3.setBackground(Color.red);

        JPanel panel4=new JPanel();
        panel4.setPreferredSize(rozmiarPanelu);
        panel4.setBackground(Color.green);

        //Stworz panel tlo i dodaj do tla cztery male panele
        JPanel tlo= new JPanel();
        tlo.setPreferredSize(new Dimension(250,450)); // wymusza wzor 2x2
        tlo.setBackground(Color.white);
        tlo.add(panel1);
        tlo.add(panel2);
        tlo.add(panel3);
        tlo.add(panel4);

        //Dodaj panel tlo do okna i pokaz
        getContentPane().add(tlo); // dodajemy do naszej glownej klasie 4 panele i tlo
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CzteryPanele();
    }
}
