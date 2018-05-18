package showdown;
import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> deck;
	private Card[] hand = new Card[6];
	private creature[] field = new creature[7];
	public Player(String name, ArrayList deck, Card[] hand, creature[] field) {
		this.name = name;
		this.deck = deck;
		this.hand = hand;
		this.field = field;
	}
}
