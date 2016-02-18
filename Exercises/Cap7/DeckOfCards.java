package Cap7;

//Fig. 7.10: DeckOfCards.java
// DeckOfCards class represents a deck of playing cards.

import java.security.SecureRandom;

public class DeckOfCards {

	private Card[] deck; // array of Card objects
	private int currentCard; // index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
	
	//random number generator
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	//constructor fills deck of Cards
	public DeckOfCards() {
		
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
	}
}
