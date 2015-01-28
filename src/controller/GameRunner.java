package controller;

import model.Hand;
import model.Table;

public class GameRunner {

	public void gameRunner() {

		Controller controller = new Controller();
		//int playerNumber = (int) Math.ceil((Math.random() * 7) + 1);
		int playerNumber = 5;
		controller.init(playerNumber);
		Table table = controller.getTable();
		int playerCount = 0;

		while (!controller.allPlayersStopped()) {
			Hand playerHand = table.getHands().get(playerCount++);
			if (!playerHand.playerStop) {
				String input = (Math.random() > 0.5) ? "hit" : "stay";

				controller.playerUpdate(input, table.getDeck(), playerHand);

				

				int totalScore = Scoring.getTotalScore(playerHand);
				if (Scoring.playerBust(totalScore)) {
					playerHand.playerStop = true;
				}
			}
			if (playerCount >= playerNumber)
				playerCount = 0;
		}
		int highestScore = 0;
		int indexHighestScore = -1;
		for(int i = 0; i < table.getHands().size(); i++){
			Hand hand = table.getHands().get(i);
			int currentScore = Scoring.getTotalScore(hand);
			if(currentScore > highestScore && !Scoring.playerBust(currentScore)){
				indexHighestScore = i;
				highestScore = currentScore;
			}
		}
		System.out.println("" + indexHighestScore + " IS THE WINNER HAHAHAHAH! YOU ALL LOSE AHAHAHAHAH!!");
	}
}

/*
 * run everything init everything X game loop clean-up
 */