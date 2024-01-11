package monster;

import character.Hero;

public class Monster {
	
		private String name;
		private int MaxHP;
		private int currentHP;
		private int MaxMP;
		private int currentMP;
		private int attackPower;
		private int exp;
		
		
		public Monster(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
			this.name = name;
			this.MaxHP = MaxHP;
			this.currentHP = currentHP;
			this.MaxMP = MaxMP;
			this.currentMP = currentMP;
			this.attackPower = attackPower;
			this.exp = exp;
			
		}
		
		public String getName() {
			return name;
		}
		public int getMaxHP() {
			return MaxHP;
		}
		public int getCurrentHP() {
			return currentHP;
		}
		public int getMaxMP() {
			return MaxMP;
		}
		public int getCurrentMP(){
			return currentMP;
		}
		public int getAttackPower() {
			return attackPower;
		}
		public int getExp() {
			return exp;
		}
		public void setName(String name ) {
			this.name = name;
		}
		public void setMaxHP(int MaxHP) {
			this.MaxHP = MaxHP;
		}
		public void setCurrentHP(int curretnHP) {
			this.currentHP =  curretnHP;
		}
		public void setMaxMP(int MaxMP) {
			this.MaxMP = MaxMP;
		}
		public void setCurrentMP(int currentMP) {
			this.currentMP = currentMP;
		}
		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		
		public void resetState() {
			setCurrentHP(getMaxHP());
			setCurrentMP(getMaxMP());
		}
		
		public void monsterTakeDamage(int damage) {
			currentHP -= damage;
			if (currentHP < 0 ) {
				currentHP = 0;
			}
			setCurrentHP(currentHP);
		}
		
		public boolean isAlive() {
			return currentHP > 0;
		}
		
		public int getEXP() {
			return this.exp;
		}
	
		public void monsterAttack(Hero hero) {
			int monsterAttackDamage = getAttackPower();
			hero.heroTakeDamage(monsterAttackDamage);
			System.out.println(getName() + "が" + hero.getName() + "に" + monsterAttackDamage + "のダメージを与えました！");
		}
		
		
		
		
	}

