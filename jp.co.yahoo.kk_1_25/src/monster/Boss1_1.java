
package monster;

import character.Hero;

public class Boss1_1 extends Monster {
	private int lastCheckedHP;

    public Boss1_1(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
        super(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
        this.lastCheckedHP = MaxHP;
    }

   public void checkAndSpeakBasedOnHP() {
	   int currentHP = this.getCurrentHP();
	   
	   if (currentHP != lastCheckedHP) {
		   if(currentHP <= this.getMaxHP() * 0.75) {
			   System.out.println("かかってこいよ、人間。");
		   }else if (currentHP <= this.getMaxHP() * 0.50) {
			   System.out.println("人間の割にはやるな");
		   }else if (currentHP <= this.getMaxHP() * 0.25) {
			   System.out.println("おかしいぞ、お前！");
		   }
		   lastCheckedHP = currentHP;
	   }
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