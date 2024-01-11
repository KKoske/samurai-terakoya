package item;

import character.Hero;

public class Glass extends ConsumableItem {

	private int recoveryMP;
	
	public Glass(String name, String description, int price, int recoveryHP) {
		super(name, description, price, recoveryHP, 0);
		this.recoveryMP = recoveryHP;
	}
	
	public int getHealingMPAmount() {
		return recoveryMP;
	}

	public void  useGlass(Hero hero) {
		hero.recoveryMP(this.recoveryMP);
	}
}

