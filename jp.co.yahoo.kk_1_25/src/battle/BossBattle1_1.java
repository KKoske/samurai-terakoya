package battle;

import character.Hero;
import item.Inventory;
import monster.Boss1_1;
import monster.Boss1_2;
import monster.Monster;
import monster.ReleaseMonsterPool;

public class BossBattle1_1 extends BattleSystem{
	
	public static void bossBattle1_1(Hero hero, Monster monster) {
		System.out.println("???:まさか人間がここまで辿り着けるとはな！");
		System.out.println("ジャハーム：俺の名は四天王ジャハーム");
		System.out.println("ジャハーム：魔王様を封じるこの宝具は先に頂いた");
		System.out.println("欲しければ俺を倒してみるがいい");
		System.out.println("できればの話だがな！！");
		System.out.println(monster.getName() + "があらわれた！");
		
		while(hero.isAlive() && monster.isAlive()) {
			//ターンでの各動作完了に伴って、相手のターンに映るかの判定↓
			boolean turnCompleted = false;
			while(!turnCompleted) {
				
			BattleCommand command = new BattleCommand();
			int selectCommand = command.selectCommand();
			switch(selectCommand){
				case 1:
					hero.heroAttack(monster);
					turnCompleted = true;
					break;
				case 2:
					//skillメソッド
					break;
				case 3:
					Inventory inventory = Inventory.getInstance();
					turnCompleted = inventory.displayAndUseItem(hero);
					if(!turnCompleted) {
						continue;
					}
					break;
				case 4:
					//逃げるメソッド
					break;
			}
			
			if(!monster.isAlive()) {
				if(monster instanceof Boss1_1) {
					Boss1_2 boss1_2 = new Boss1_2("ジャヒーム", 50, 50, 30, 30, 10, 23);
					BossBattle1_2.bossBattle1_2(hero, boss1_2);
			}
				break;
			}else {
			monster.monsterAttack(hero);
			}
			
			if (!hero.isAlive()) {
				System.out.println(hero.getName() + "は倒れた！");
				Hero.heroDead();
				break;
				}
			}
		}
		ReleaseMonsterPool pool = ReleaseMonsterPool.getInstance();
		pool.addReleaseMonster(monster);
	}
}

