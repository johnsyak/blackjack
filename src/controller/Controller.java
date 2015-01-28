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
		Scoring.init();
		table = new Table(deck, playerHands);
	}
	
	public void playerUpdate(String input, Deck deck, Hand hand){
		String hitOrStay = "hit";
		if(hand.playerStop == false){
			if(input.equals(hitOrStay)){
				hand.hitCard(deck.drawCard());
				
			}
		
			else{
				hand.playerStop = true;
			}
		}
	}
	
	public Table getTable(){
		return table;
	}
	
	public boolean allPlayersStopped(){
		for(Hand h : table.getHands()){
			if(!h.playerStop){
				return false;
			}
		}
		return true;
	}
}


/*
 * run everything
 * init everything
 * game loop
 * clean-up
 */
