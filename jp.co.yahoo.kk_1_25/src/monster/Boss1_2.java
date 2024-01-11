
package monster;

import character.Hero;

public class Boss1_2 extends Monster {

    public Boss1_2(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
        super(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
    }

    public void BossAttack(Hero hero){
    	int BossAttackDamage = getAttackPower();
    	hero.heroTakeDamage(BossAttackDamage);
    	System.out.println(getName() + "が" + hero.getName() + "に" + BossAttackDamage + "のダメージを与えました！");
    	
    }
    
    public boolean isAlive() {
		return getCurrentHP() > 0;
    }
    }