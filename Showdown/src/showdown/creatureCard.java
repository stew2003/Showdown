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
	public creatureCard(String name,int maxHP, int attackStat, String attackName, ElementalTypes elementalType, creatureCard evolution) {
		this.setName(name);
		this.setMaxHP(maxHP);
		this.setAttackStat(attackStat);
		this.setAttackName(attackName);
		this.setElementalType(elementalType);
		this.setEvolution(evolution);
		this.setCurrentHP(maxHP);
	}
	public creatureCard(String name, int maxHP, int attackStat, String attackName, ElementalTypes elementalType) {
		this.setName(name);
		this.setMaxHP(maxHP);
		this.setAttackStat(attackStat);
		this.setAttackName(attackName);
		this.setElementalType(elementalType);
		this.setCurrentHP(maxHP);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getAttackStat() {
		return attackStat;
	}
	public void setAttackStat(int attackStat) {
		this.attackStat = attackStat;
	}
	public String getAttackName() {
		return attackName;
	}
	public void setAttackName(String attackName) {
		this.attackName = attackName;
	}
	public creatureCard getEvolution() {
		return evolution;
	}
	public void setEvolution(creatureCard evolution) {
		this.evolution = evolution;
	}
	public ElementalTypes getElementalType() {
		return elementalType;
	}
	public void setElementalType(ElementalTypes elementalType) {
		this.elementalType = elementalType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void play(Game game) {
		System.out.println("Hi");
	}
}

//Test Commit
//hi