package showdown;
import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> deck;
	private Card[] hand = new Card[6];
	private creatureCard[] field = new creatureCard[7];
	public Player(String name, ArrayList deck) {
		this.name = name;
		this.deck = deck;
		//hand is first 6 cards from deck
		//field is empty, fills when player plays something
	}
	
	public static void turn() {
	}
	
}
