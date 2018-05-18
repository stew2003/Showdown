package showdown;
import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> deck;
	private Card[] hand = new Card[6];
	private creatureCard[] field = new creatureCard[7];
	public Player(String name, ArrayList deck, Card[] hand, creatureCard[] field) {
		this.name = name;
		this.deck = deck;
		this.hand = hand;
		this.field = field;
	}
}
