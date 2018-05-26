package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Troll extends creatureCard {
	public Troll() {
		super("Troll", 40, 30, "Intimidate", ElementalTypes.EARTH, new Ogre());
	}
}
