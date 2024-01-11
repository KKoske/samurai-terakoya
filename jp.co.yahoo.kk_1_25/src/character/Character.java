package character;

import java.util.Random;

public class Character {

	private String name;
	protected int maxHP;
	protected int currentHP;
	protected int maxMP;
	protected int currentMP;
	private int attackPower;
	private int level;
	protected int exp;
	
	public Character(String name, int maxHP, int currentHP, int maxMP, int currentMP, int attackPower, int level, int exp) {
		this.name = name;
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.maxMP = maxMP;
		this.currentMP = currentMP;
		this.attackPower = attackPower;
		this.level = level;
		this.exp = exp;
		
	}
	public String getName() {
		return name;
	}
	public int gemaxHP() {
		return maxHP;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public int getMaxMP() {
		return maxMP;
	}
	public int getCurrentMP() {
		return currentMP;
	}
	public int  getAttackPower() {
		return attackPower;
	}
	public int getLevel() {
		return level;
	}
	public int getExp() {
		return exp;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public void setCurrentHP(int curretnHP) {
		this.currentHP =  curretnHP;
	}
	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
	}
	public void setCurrentMP(int currentMP) {
		this.currentMP = currentMP;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public void setlevel(int level) {
		this.level = level;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

	
	public void heroTakeDamage(int damage){
		currentHP -= damage;
		if (currentHP < 0) {
			currentHP = 0; 
		}
	}
	public void calcLevelUp() {
		int[] expThresholds = {7,23,47,110};
		for(int i = 0; i < expThresholds.length; i++) {
			if(exp >= expThresholds[i] && level == i + 1){
				LevelUp();
				break;
				}
			}
		}
		
	private void LevelUp() {
		Random random = new Random();
		
		maxHP += 3 + random.nextInt(3);
		maxMP += 1 + random.nextInt(3);
		attackPower += 2 + random.nextInt(3);
		level += 1;
		
		System.out.println(getName() + "のレベルが上がった”");
	}
}




