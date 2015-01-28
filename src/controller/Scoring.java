package controller;

import java.util.ArrayList;
import java.util.HashMap;

import model.Card;
import model.Card.Rank;
import model.Hand;

public class Scoring {
	
	private static final int BUST = 22;
	private static final HashMap<Rank, Integer> CARDVALUES = new HashMap<Rank, Integer>();
	
	public static void init(){
		int faceCardValue = 10;
		int aceRankValue = 13;
		int aceValue = 11;
		Rank[] ranks = Card.Rank.values();
		
		for(int i = 0; i < ranks.length; i++){
			int n = i + 2;
				if(n > faceCardValue && n < aceRankValue + 1){
					n = faceCardValue;
				}
				else if(n == aceRankValue){
					n = aceValue;
				}
			CARDVALUES.put(ranks[i], n);
		}
	}
	
	
	
	public static int getTotalScore(Hand playerHand){
		int score = 0;
		int aceCount = 0;
		int subtractAceValue = 10;
		for(int i = 0; i < playerHand.getCards().size(); i++){
			Card card = playerHand.getCards().get(i);
			score += CARDVALUES.get(card.rank);
		
			if(card.rank == Card.Rank.ACE){
				aceCount++;
			}
		}
		for(int n = 0; n < aceCount; n++){
			if(score >= BUST){
				score -= subtractAceValue;
			}
		}
		return score;
	}
	
	public static boolean playerBust(int score){
		return score >= BUST;
	}
}
