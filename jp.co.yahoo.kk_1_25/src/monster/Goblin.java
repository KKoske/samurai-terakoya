
package monster;

import character.Hero;

public class Goblin extends Monster {

    public Goblin(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
        super(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
    }

    // スライム固有のメソッドや振る舞いをここに追加
    	
    public void goblinAttack(Hero hero){
    	int goblinAttackDamage = getAttackPower();
    	hero.heroTakeDamage(goblinAttackDamage);
    	System.out.println(getName() + "が" + hero.getName() + "に" + goblinAttackDamage + "のダメージを与えました！");
    }
    public boolean isAlive() {
		return getCurrentHP() > 0;
	}
    }




