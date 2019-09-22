package yt.rekurencja.gui;

import javax.swing.*;
import java.awt.*;

public class PanelDwa extends JFrame {

    public PanelDwa(){

        //Konfigurujemy okno
        this.setTitle("Niebieskie okno");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mozna uzyc this lub nie
        this.setLocation(450,100); // lokalizacja okna

        //Dodajemy panel ktory bedzie tlem
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,400)); // okreslamu wielkosc panelu
        panel.setBackground(Color.blue);
        this.getContentPane().add(panel); // do naszego nowego okna dodajemy panel

        //Pokaz okno zaraz z zawartoscia
        this.pack();    //Dostosuje okno do zawartosci, czyli okno dostsuje do wielkosci panelu 200 , 400
        this.setVisible(true);  // pokaz okno
    }

    public static void main(String[] args) {
    //    PanelDwa abc=new PanelDwa();
        new PanelDwa();  // w ten sposob tez tworzymy nowy obiekt ale nie podajemy jej nazwy , wiec jak bysmy sie chceili do niej odwolac nie bedzie mozliwe bo nie ma nazwy ten obiekt
    }
}
