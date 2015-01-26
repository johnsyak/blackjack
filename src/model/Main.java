package model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.buildDeck();
		Card card = deck.drawCard();
		deck.shuffleDeck();
		ArrayList<Card> numCards = deck.getDeck();
		for(int i = 0; i < numCards.size(); i++){
		System.out.println(""+numCards.get(i).rank+ " "+numCards.get(i).suit);
		}
		System.out.println(""+card.suit + " " +card.rank);
		
		System.out.println(""+numCards.size());
	}

}
