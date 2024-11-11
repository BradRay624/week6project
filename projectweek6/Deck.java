package projectweek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

    // Constructor to initialize the deck with 52 cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
        for (int i = 0; i < suits.length; i++) {
            for (int j = 2; j <= 14; j++) {
                String cardName = values[j - 2] + " of " + suits[i];
                cards.add(new Card(j, cardName));
            }
        }
    }

    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw a card from the deck
    public Card draw() {
        return cards.remove(0);
    }

}
