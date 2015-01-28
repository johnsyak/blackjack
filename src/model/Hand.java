package model;

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> hand;
	public boolean playerStop;
	
	public Hand(){
		this.hand = new ArrayList<Card>();
		this.playerStop = false;
	}
	public void hitCard(Card card){
		hand.add(card);
	}
	
	public ArrayList<Card> showCards(){
		ArrayList<Card> visibleHand = new ArrayList<Card>();
		for(int i = 1; i < hand.size(); i++){
			visibleHand.add(hand.get(i));
		}
		return visibleHand;
	}
	
	public ArrayList<Card> getCards(){
		return hand;
	}
	
}




