package showdown;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//player class
public class Player {
	private String name;
	private Deck deck;
	private ArrayList<Card> hand = new ArrayList<Card>(); //hand can vary in size, e.x Chest of Plenty can make it go over 6.
	private creatureCard[] field = new creatureCard[7];
	private boolean isDead = false;
	public Player(String name, File deckFile) throws IOException {
		this.name = name;
		this.deck = new Deck(deckFile);
		draw(6);
		//hand is first 6 cards from deck
		//field is empty, fills when player plays something
	}
	public String getName() {
		return this.name;
	}
	public String getHand() {
		String hand = null;
		for (int i = 0; i < this.hand.size(); i++) {
			if (i == 0) {
				hand = this.hand.get(i).getName();
			}
			else {
				hand = hand + ", " + this.hand.get(i).getName();
			}
		}
		return hand;
	}
	
	public void turn() {
		System.out.println("It is " + this.name + "'s turn!");
	}
	public void draw(int x) {
		for(int i = 0; i<x; i++) { //this doesn't work
			this.hand.add(this.deck.library.get(0));
			this.deck.library.remove(0);
		}
	
	}
	public boolean isDead() {
		return this.isDead;
	}
	
	
}
