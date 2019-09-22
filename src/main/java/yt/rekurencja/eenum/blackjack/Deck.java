package yt.rekurencja.eenum.blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {  // talia

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        for (int suit = 0; suit < 4; suit++) {
            for (int value = 0; value < 13; value++) {

                cards.add(new Card(Suit.values()[suit], Value.values()[value]));
                // przy pierwszym obrocie petli do naszej listy cards dodamy jaki obiekt , tworzymy anonimowy obiekt Card i wysylamy do niego wartosci , odwolujemy sie do Suit i uzywamy metode values zeby wydobyc wszystkie jej wartosci czyli tablice trefl karo kier pik i potem otwieramy kwadratowy nawias i wypisujemy jakas wartosc moze byc 0,1,2,3 bo ideksy takie maja  suit wiec z   petli jest od 0 do 4 dlatego suit, i to samo z value
                // w pierwszej petli bedzie 0 wiec trefl wezmie i 13 value dla nich wiec stworza sie 13 kart
                // jak sie skonczy pierwszy obrot suit zamieni sie w 1 i poleci dla koloru karo
            }
        }
    }

    // metoda na tasowanie kart
    public void shuffle() {
        Collections.shuffle(cards); // arraylist posiada metode w sobie do mieszania
    }

    // metoda ktora bedzie zwracac pierwsza karte z talii
    public Card handOutCard() { // zwraca obiket typu Card
    return cards.remove(0); // musimy usunac pierwsza karte ktora wylosujemy zeby zwrocil i ja juz usunal z talii
    }
}