package model;

import java.util.ArrayList;

public class Hand {
	ArrayList<Card> hand;
	
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
}




