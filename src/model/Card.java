package model;

public class Card {
	
	public static enum Suit{
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	
	public static enum Rank{
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	public Suit suit;
	public Rank rank;
	
	public Card(Suit suit, Rank rank){
		this.suit = suit;
		this.rank = rank;
	}
}
