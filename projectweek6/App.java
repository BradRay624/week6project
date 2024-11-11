package projectweek6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Instantiate a Deck and two Players
        Deck deck = new Deck();
        deck.shuffle();
        
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Deal cards to each player
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Simulate the game
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            System.out.println("Round " + (i + 1) + ":");
            card1.describe();
            card2.describe();
            
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round.");
            } else {
                System.out.println("It's a tie, no points awarded.");
            }
            System.out.println();
        }

        // Final scores
        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        // Declare winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
	}

}
