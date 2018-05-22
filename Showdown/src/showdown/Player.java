package showdown;
import java.io.File;
import java.util.ArrayList;
//player class
public class Player {
	private String name;
	private Deck deck;
	private ArrayList<Card> hand = new ArrayList<Card>(); //hand can vary in size, e.x Chest of Plenty can make it go over 6.
	private creatureCard[] field = new creatureCard[7];
	public Player(String name, File deckFile) {
		this.name = name;
		this.deck = new Deck(deckFile);
		draw(6);
		//hand is first 6 cards from deck
		//field is empty, fills when player plays something
	}
	void draw(int x) {
		for(int i = 0; i<x; i++) { //this doesn't work
			this.hand.add(this.deck.library.get(0));
			this.deck.library.remove(0);
		}
	}
	
	
	public static void turn() {
	}
	
}
