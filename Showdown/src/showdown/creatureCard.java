package showdown;

public class creatureCard implements Card {
	private String name;
	private int maxHP;
	private int currentHP;
	private int attackStat;
	private creatureCard[] evolutionList;
	private ElementalTypes elementalType;
	creatureCard(int maxHP, int attackStat, ElementalTypes elementalType, creatureCard[] evolutionList){
		this.maxHP = maxHP;
		this.attackStat = attackStat;
		this.elementalType = elementalType;
		this.evolutionList = evolutionList;
	}
	public void play() {
		System.out.println("Hi");
	}
}
