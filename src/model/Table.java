package model;

import java.util.ArrayList;

public class Table {
	Deck deck;
	ArrayList<Hand> hands;
	
	public Table(Deck deck, ArrayList<Hand> hands){
		this.deck = deck;
		this.hands = hands;
	}
	
	
	public Deck getDeck(){
		return deck;
	}	
	
	public ArrayList<Hand> getHands(){
		return hands;
	}
	
}
