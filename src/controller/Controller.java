package controller;

import java.util.ArrayList;

import model.Card;
import model.Deck;
import model.Hand;
import model.Table;


public class Controller {
	Table table;
	
	public Deck initBuildDeck(){
		Deck deck = new Deck();
		deck.buildDeck();
		deck.shuffleDeck();
		
		return deck;
	}
	
	public Hand initBuildPlayerHand(Deck deck){
		Hand hand = new Hand();
		int playerHandCount = 2;
		for(int i = 0; i < playerHandCount; i++ ){
			Card card = deck.drawCard();
			hand.hitCard(card);
			}
		return hand;
	}
	
	public void init(int numHands){
		Deck deck = initBuildDeck();
		ArrayList<Hand> playerHands = new ArrayList<Hand>();
		for(int i = 0; i < numHands; i++){
			playerHands.add(initBuildPlayerHand(deck));
		}
		table = new Table(deck, playerHands);
	}
	
	public void playerTurnPhase(String input, Deck deck, Hand hand){
		String hitOrStay = "";
		if(hand.playerStop = false){
			if(input.equals(hitOrStay)){
				hand.hitCard(deck.drawCard());
				getScoring(hand.getCards());
			}
		
			else{
				hand.playerStop = true;
			}
		}
	}
	
	public void getScoring(ArrayList<Card> hand){
		Scoring scoring = new Scoring(hand);
	}

	public void continueGame(){
		
	}
}

