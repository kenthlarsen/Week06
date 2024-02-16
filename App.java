package Week06;


public class App {

	

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Players player1 = new Players();
		Players player2 = new Players();
		deck.shuffle();	
		
		System.out.println("**** Let the WAR begin! ****");
		System.out.println();
				
		for (int i = 0; i < 26; i++) {     
			//System.out.println("Player 1 Score = " + player1.getScore() + "\n--------");
			Cards drawnCard = deck.draw();
			System.out.print("Player 1 card is ");
			drawnCard.describe();
			System.out.println();
			
			//System.out.println("Player 2 Score = " + player2.getScore() + "\n--------");
			Cards drawnCard2 = deck.draw();
			System.out.print("Player 2 card is ");
			drawnCard2.describe();
			System.out.println();
			System.out.println("*** Winner ***");
			
		if(drawnCard.value > drawnCard2.value) {	
			player1.incrementScore();		
			System.out.println("Player 1 Wins!" + " " );
			System.out.println();
		}else if(drawnCard.value < drawnCard2.value){
			player2.incrementScore();
			System.out.println("Player 2 Wins!" + " " );
			System.out.println();
		}else {
			System.out.println("1, 2, 3, 4,.....I declair WAR! Draw Again!");
			System.out.println();			
		}		
		System.out.println("Player 1 Score = " + player1.getScore() + "\n--------");
		System.out.println("Player 2 Score = " + player2.getScore() + "\n--------");
	}
			System.out.println("**** Game Over ****");
			System.out.println("Player 1 Score = " + player1.getScore());
			System.out.println("Player 2 Score = " + player2.getScore()); 
		if 	(player1.getScore()>player2.getScore()) {
			System.out.println("*** **** *** **** ***" + "\nPlayer 1 won the WAR!");
		}else{
			System.out.println("*** **** *** **** ***" + "\nPlayer 2 won the WAR!");
		}
	}
}
	    