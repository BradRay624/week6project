package projectweek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	 private List<Card> hand;
	    private int score;
	    private String name;

	    // Constructor
	    public Player(String name) {
	        this.name = name;
	        this.score = 0;
	        this.hand = new ArrayList<>();
	    }

	    // Describe method
	    public void describe() {
	        System.out.println(name + "'s hand:");
	        for (Card card : hand) {
	            card.describe();
	        }
	    }

	    // Flip method
	    public Card flip() {
	        return hand.remove(0);
	    }

	    // Draw a card and add it to the hand
	    public void draw(Deck deck) {
	        hand.add(deck.draw());
	    }

	    // Increment score
	    public void incrementScore() {
	        score++;
	    }

	    // Getters
	    public int getScore() {
	        return score;
	    }

	    public String getName() {
	        return name;
	    }
}
