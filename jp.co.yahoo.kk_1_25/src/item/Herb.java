package item;

import character.Hero;

public class Herb extends ConsumableItem {

	private int recoveryHP;
	
	public Herb(String name, String description, int price, int recoveryHP) {
		super(name, description, price, recoveryHP, 0);
		this.recoveryHP = recoveryHP;
	}
	
	public int getHealingHPAmount() {
		return recoveryHP;
	}

	public void  useHerb(Hero hero) {
		hero.recoveryHP(this.recoveryHP);
	}
}
