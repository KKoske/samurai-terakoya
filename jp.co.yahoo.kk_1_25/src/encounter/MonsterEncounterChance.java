package encounter;

import java.util.Random;

public class MonsterEncounterChance {
	
	static Random random = new Random();

	public static boolean monsterEncounterChance() {
		
		double encounterChance = 0.8;
		if(random.nextDouble() <= encounterChance) {
			return true;
		}else {
			return false;
		}
		}
	}
	
