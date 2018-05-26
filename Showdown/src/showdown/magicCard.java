package showdown;
//magic cards
public class magicCard implements Card { // i'm gonna need to learn what 'implements' does, im guessing it just means that its a sub boi?
	String name;
	public magicCard(String name) {
		this.name = name;
	}
	public void play(Game game) {
		System.out.println("Played Magic Card!");
	}

	public String getName() {
		return this.name;
	}
}
