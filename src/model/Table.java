package model;

import java.util.ArrayList;

public class Table {
	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Card> hands = new ArrayList<Card>();
	
	public ArrayList<Card> getDeck(){
		return deck;
	}	
	
	public ArrayList<Card> getHands(){
		return hands;
	}
	
}
