
package monster;

import character.Hero;

public class Slime extends Monster {

    public Slime(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
        super(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
    }

    // スライム固有のメソッドや振る舞いをここに追加
    	
    public void slimeAttack(Hero hero){
    	int slimeAttackDamage = getAttackPower();
    	hero.heroTakeDamage(slimeAttackDamage);
    	System.out.println(getName() + "が" + hero.getName() + "に" + slimeAttackDamage + "のダメージを与えました！");
    }
    
    public boolean isAlive() {
		return getCurrentHP() > 0;
    }
    }