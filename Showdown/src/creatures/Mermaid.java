package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Mermaid extends creatureCard {
	public Mermaid() {
		super("Mermaid", 100, 20, "Squall", ElementalTypes.WATER, new Poseidon());
	}
}
