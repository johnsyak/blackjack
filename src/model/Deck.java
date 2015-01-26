package model;

import java.util.ArrayList;
import java.util.Collections;
	
public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	private static final int RANKSIZE = Card.Rank.values().length;
	private static final int SUITSIZE = Card.Suit.values().length;
	
	public void buildDeck(){
		System.out.println(""+SUITSIZE);
		System.out.println(""+Card.Rank.values().length);
		for(int i = 0; i < SUITSIZE; i++){
			for(int n = 0; n < RANKSIZE; n++){
				System.out.println(""+i + " " +n);
				cards.add(new Card(Card.Suit.values()[i], Card.Rank.values()[n]));
			}
		}
		
	}
	
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	
	public Card drawCard(){
		Card card = cards.get(0);
		cards.remove(0);
		return card;
	}
	
	public ArrayList<Card> getDeck(){
		return cards;
		
	}
}
