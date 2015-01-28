package controller;

import java.util.ArrayList;
import java.util.HashMap;

import model.Card;
import model.Card.Rank;
import model.Hand;

public class Scoring {
	ArrayList<Card> playerHand;
	private int bust = 22;
	HashMap<Rank, Integer> cardValues = new HashMap<Rank, Integer>();
	
	public Scoring(ArrayList<Card> playerHand){
		this.playerHand = playerHand;
		Rank[] ranks = Card.Rank.values();
		
		for(int i = 0; i < ranks.length; i++){
			int n = i + 2;
				if(n > 10 && n < 14){
					n = 10;
				}
				else if(n == 13){
					n = 11;
				}
			cardValues.put(ranks[i], n);
		}
	}
	
	public int checkScore(){
		int score = 0;
		for(int i = 0; i < playerHand.size(); i++){
			Card card = playerHand.get(i);
			score += cardValues.get(card.rank);
		}
		return score;
	}
	
	public boolean isOver(){
		boolean isOver = true;
		return isOver;
	}
}
