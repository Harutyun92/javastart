package yt.rekurencja.eenum.blackjack;

public class Card {

    private Suit cardSuit;
    private Value cardValue;

    public Card(Suit cardSuit, Value cardValue) {
        this.cardSuit = cardSuit;
        this.cardValue = cardValue;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public Value getCardValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardSuit=" + cardSuit +
                ", cardValue=" + cardValue +
                '}';
    }
}
