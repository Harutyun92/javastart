package yt.rekurencja.gui;

import javax.swing.*;
import java.awt.*;

public class TloPanel extends JPanel {  // dziedzieczy po Jpanel
    public TloPanel() {

        // Konfigurujemy ten panel co bedzie naszym tlem
        final Dimension rozmiarPanelu = new Dimension(300, 300);
        setPreferredSize(rozmiarPanelu);
        setBackground(Color.white);

        //Stworz i skonfiguruj panel z palindromem
        JPanel palindromPanel = new JPanel();
        palindromPanel.setBackground(Color.yellow);
        palindromPanel.setPreferredSize(new Dimension(rozmiarPanelu.width, rozmiarPanelu.height / 2));
        add(palindromPanel); // dodajemy palindromPnael do naszego tla
        JLabel label1 = new JLabel("Polski Palindrom");//tworzymy label tekst , Jlabel pozwala tworzyc rozne komponenty i potem je dodawac
        JLabel label2 = new JLabel("A to kanapa pana Kota");
        palindromPanel.add(label1); // dodajemy label czyli etykiete do naszego palindromu
        palindromPanel.add(label2);

        //Stworz i skonfiguruj panel z pingwinem
        JPanel pingwinPanel = new JPanel();
        pingwinPanel.setBackground(Color.lightGray);
        pingwinPanel.setPreferredSize(new Dimension(rozmiarPanelu.width, rozmiarPanelu.height / 2));
        add(pingwinPanel);

        //Dodaj obraz pingiwna i tekst do panelu z pingwinem
    ImageIcon pingwinObraz= new ImageIcon("C:/Users/xxx/Desktop/collecta-88095-pingwin-cesarski.jpg");
    JLabel pingwinLabel=new JLabel("Oto pingwin",pingwinObraz,SwingConstants.CENTER);
    pingwinLabel.setHorizontalTextPosition(SwingConstants.CENTER);
    pingwinLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
    pingwinPanel.add(pingwinLabel);
    }
}
