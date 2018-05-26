package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Goblin extends creatureCard{
	public Goblin() {
		super("Goblin", 60, 20, "Surprise", ElementalTypes.EARTH, new Hobgoblin());
	}
}
