package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Hobgoblin extends creatureCard {
	public Hobgoblin() {
		super("Hobgoblin", 100, 30, "Steal", ElementalTypes.EARTH, new Erlking());
	}
}
