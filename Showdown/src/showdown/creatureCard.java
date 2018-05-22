package showdown;

public class creatureCard implements Card {
	private String name;
	private int maxHP;
	private int currentHP;
	private int attackStat;
	private String attackName;
	private creatureCard evolution;
	private ElementalTypes elementalType;
	private int age = 0;
	public creatureCard(int maxHP, int attackStat, String attackName, ElementalTypes elementalType, creatureCard evolution) {
		this.maxHP = maxHP;
		this.attackStat = attackStat;
		this.attackName = attackName;
		this.elementalType = elementalType;
		this.evolution = evolution;
		this.currentHP = maxHP;
	}
	public creatureCard(int maxHP, int attackStat, String attackName, ElementalTypes elementalType) {
		this.maxHP = maxHP;
		this.attackStat = attackStat;
		this.attackName = attackName;
		this.elementalType = elementalType;
		this.currentHP = maxHP;
	}
	public void play(Game game) {
		System.out.println("Hi");
	}
}

//Test Commit