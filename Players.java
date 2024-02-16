package Week06;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Cards> hand = new ArrayList<Cards>();
	List<Cards> card = new ArrayList<Cards>();
	int score = 0;
	int incrementScore = 0;
	String playerName;
	
	
	public List<Cards> getHand() {
		return hand;
	}
	public void setHand(List<Cards> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Cards flip() {
		Cards card = this.card.remove(0);
		return card;
}
	public void incrementScore() {
		score++;
				
	}
	
}