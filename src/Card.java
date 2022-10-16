
/**
 * @author pstew
 *
 */
public class Card {
	private int suit, value,rank;
	String[] suits;
	String [] values;
	int Rank;
	
	/**
	 * 
	 */
	public Card(int card) {
		this.suit = card / 13;
		this.value = card % 13;
		if (this.value == 0) {
			Rank = 1 ;
		}if (this.value == 1) {
			Rank = 2;
		}if (this.value == 2) {
			Rank = 3;
		}if (this.value == 3) {
			Rank = 4;
		}if (this.value == 4) {
			Rank = 5;
		}if (this.value == 5) {
			Rank = 6;
		}if (this.value == 6) {
			Rank = 7;
		}if (this.value == 7) {
			Rank = 8;
		}if (this.value == 8) {
			Rank = 9;
		}if (this.value == 9) {
			Rank = 10;
		}if (this.value == 10) {
			Rank = 11;
		}if (this.value == 11) {
			Rank = 12;
		}if (this.value == 12) {
			Rank = 13;
		}
	}
	@Override
	public String toString() {
		String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };
		String[] values = { "2", "3", "4", " 5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		
		
		return "Card is " + values[value] + " of " + suits[suit] + " " +Rank;
	}

	
	/**
	 * 
	 */

}
