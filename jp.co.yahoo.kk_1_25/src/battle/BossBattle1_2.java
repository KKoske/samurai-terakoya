package battle;

import character.Hero;
import item.Inventory;
import monster.Monster;
import monster.ReleaseMonsterPool;
import story.DefeatEvent1_2;

public class BossBattle1_2 extends BattleSystem{
	public static void bossBattle1_2(Hero hero, Monster monster) {
		System.out.println("悪いがここで死んでもらうぞ、勇者！");
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

				//主人公のターン
				if(!monster.isAlive()) {
					System.out.println(monster.getName() + "をたおした！");
					System.out.println("バトル終了！");
					hero.gainEXP(monster.getEXP());
					break;
				}
				monster.monsterAttack(hero);
				if (!hero.isAlive()) {
					System.out.println(hero.getName() + "は倒れた！");
					System.out.println("ジャハーム：終わりだ！！！");
					DefeatEvent1_2 defeatEvent = new DefeatEvent1_2();
					defeatEvent.defeatEvent1_2(hero);
					break;
				}
			}
		}
		ReleaseMonsterPool pool = ReleaseMonsterPool.getInstance();
		pool.addReleaseMonster(monster);
	}
}



