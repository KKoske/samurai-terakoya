package character;

import monster.Monster;
import town.TownChoice;

public class Hero extends Character {
	public Hero(String name, int maxHP, int currentHP,int maxMP, int currentMP, int attackPower, int level, int exp) {
		super(name, maxHP, currentHP, maxMP, currentMP,attackPower,level,0);
	}

	public void heroAttack(Monster monster) {
		int heroAttackDamage = getAttackPower();
		monster.monsterTakeDamage(heroAttackDamage);
		System.out.println(getName() + "が" + monster.getName() + "に" + heroAttackDamage + "のダメージを与えました！");
	}
	
	public void gainEXP(int monsterExp) {
		exp += monsterExp;
	}
	
	public boolean isAlive() {
		return currentHP > 0;
	}
	
	public void recoveryHP(int amount) {
		this.currentHP += amount;
		if(currentHP > maxHP) {
			currentHP = maxHP;
		}
	}
	public void recoveryMP(int amount) {
		this.currentMP += amount;
		if(currentMP > maxMP) {
			currentMP = maxMP;
		}
	}
	public static void heroDead() {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		TownChoice.townChoice();
}
}

