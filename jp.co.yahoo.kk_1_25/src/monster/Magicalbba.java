
package monster;

import character.Hero;

public class Magicalbba extends Monster {

    public Magicalbba(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
        super(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
    }

    // スライム固有のメソッドや振る舞いをここに追加
    	
    public void magicalbbaAttack(Hero hero){
    	int magicalbbaAttackDamage = getAttackPower();
    	hero.heroTakeDamage(magicalbbaAttackDamage);
    	System.out.println(getName() + "が" + hero.getName() + "に" + magicalbbaAttackDamage + "のダメージを与えました！");
    }
    public boolean isAlive() {
		return getCurrentHP() > 0;
	}
    }




