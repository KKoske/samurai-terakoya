package item;

import character.Hero;

public class ConsumableItem extends Item{
	private int recoveryHP;
	private int recoveryMP;
	
	public ConsumableItem(String name, String description,int price, int recoveryHP, int recoveryMP) {
		super(name, description,price);
		this.recoveryHP = recoveryHP;
		this.recoveryMP = recoveryMP;
	}
	
	public int getrecoveryHP() {
		return recoveryHP;
	}
	
	public int getrecoveryMP() {
		return recoveryMP;
	}
	
	public boolean isUsableInBattle() {
		return true;
	}
	
	public void use(Hero hero) {
		hero.recoveryHP(recoveryHP);
	}
	
	
}
