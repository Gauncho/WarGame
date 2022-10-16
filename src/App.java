
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck gameDeck = new Deck();
		for (int i = 0; i <52; i++)	{
			
		Card card = new Card(i);
		gameDeck.addCard(card);
		}
	
	
	gameDeck.shuffle();
	Player p1 = new Player();
	Player p2 = new Player();
	
	//Deal
	for(int i = 0; i < gameDeck.deck.size(); i++) {
		if (i<26) {
			p1.playerDeck.addCard(gameDeck.deck.get(i));
		}
		else {
			p2.playerDeck.addCard(gameDeck.deck.get(i));
		}
	}
		for(int i = 0; i <26; i++) {

		
		if(p1.playerDeck.deck.get(i).Rank > p2.playerDeck.deck.get(i).Rank ) {
			
			p1.addScore();
		}else if 
			(p2.playerDeck.deck.get(i).Rank >p1.playerDeck.deck.get(i).Rank) {
				p2.addScore();
			}else {
				//Tie
			}
			}
		 if(p1.score > p2.score)
	        {
	            System.out.println("Player 1 Wins!!!");
	            System.out.println("Final Score:");
	            System.out.println("Player 1: " + p1.score);
	            System.out.println("Player 2: " + p2.score);
	        }
		 else if(p1.score < p2.score)
	        {
	            System.out.println("Player 2 Wins with: " + p2.score + " points.");
	            System.out.println("Final Score:");
	            System.out.println("Player 1: " + p1.score);
	            System.out.println("Player 2: " + p2.score);
	        }
		 else { 
	        
	            System.out.println("Tie Game! No winner. Play again?");
	            System.out.println("Final Score:");
	            System.out.println("Player 1: " + p1.score);
	            System.out.println("Player 2: " + p2.score);
	            
	            
	        }

	        

	
		
		
		
	}
	}


	
	
	
	


