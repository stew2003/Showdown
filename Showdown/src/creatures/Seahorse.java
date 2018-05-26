package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Seahorse extends creatureCard {
	public Seahorse() {
		super("Seahorse", 60, 20, "Water Spray", ElementalTypes.WATER, new Mermaid());
	}
}
