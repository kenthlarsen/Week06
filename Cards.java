package Week06;

public class Cards {
	String names;
	String suit;
	int value;
	
	Cards(String name, String suit, int value){
		this.names = name;
		this.suit = suit;
		this.value = value;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.names + " " + "of" + " " + this.suit);
	}
}
