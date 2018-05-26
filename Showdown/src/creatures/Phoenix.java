package creatures;

import showdown.ElementalTypes;
import showdown.creatureCard;

public class Phoenix extends creatureCard {
	public Phoenix(){
		super("Phoenix", 80, 20, "Bite", ElementalTypes.FIRE, new Fawkes());
	}
}
