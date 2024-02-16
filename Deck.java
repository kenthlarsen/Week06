package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	List<Cards> card = new ArrayList<Cards>();
		
	Deck(){
		String[] suit = {"Clubs", "Hearts", "Diamonds", "Spades"};
		String[] numbers = {"2","3", "4", "5", "6", "7", "8",
							"9", "10", "Jack", "Queen", "King", "Ace"};
			
	for(String suit1 : suit) {
		int counter = 2;
		for (String number : numbers) {
		Cards card = new Cards (number, suit1, counter);
		this.card.add(card);
		counter++;
		}					
		}		
	}

	public List<Cards> getCard() {
		return card;
	}

	public void setCard(List<Cards> card) {
		this.card = card;
	}
	
	public void shuffle() {
		Collections.shuffle(this.card);
		}
	public Cards draw() {
		Cards card = this.card.remove(0);
		return card;
			
		}
}

	