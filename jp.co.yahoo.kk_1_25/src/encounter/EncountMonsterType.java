package encounter;

import monster.Monster;
import monster.MonsterPool;

public class EncountMonsterType {
	public static Monster encountMonsterType() {
		System.out.println("まものがあらわれた！");
		MonsterPool monsterPool = MonsterPool.getInstance(3);
		Monster randomMonster = monsterPool.getRandomMonster();
		
		if(randomMonster != null) {
		return randomMonster; //ここにおける引数とMonster型の関係性について仕組みをしっかり解析する
		}else {
			System.out.println("randomMonsterがnullです");
			return null;
		}
	}
}
	
