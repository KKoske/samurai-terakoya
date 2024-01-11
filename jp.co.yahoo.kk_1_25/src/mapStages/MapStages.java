package mapStages;

import battle.BattleSystem;
import character.Hero;
import character.HeroInstancePool;
import encounter.EncountMonsterType;
import encounter.MonsterEncounterChance;
import item.ItemSearcher;
import monster.Monster;

public class MapStages {
	private static MapStages instance = null;
	private String name;
	
	public MapStages(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public  static MapStages getMapStagesInstance(String name) {
		instance = new MapStages(name);
		return instance;
	}
	
	public void enterStage() {
		System.out.println(name + "に入ります。");
		ItemSearcher itemSearcher = new ItemSearcher();
        itemSearcher.searchForItem();
		
		boolean hasEncounted = MonsterEncounterChance.monsterEncounterChance();
		StageProgression stageProg = new StageProgression();
		
		if (hasEncounted) {
			Monster randomMonster = EncountMonsterType.encountMonsterType();
			Hero hero = HeroInstancePool.getHero();
			BattleSystem.battleSystem(hero, randomMonster);
			stageProg.progressOrReturn();
		}else {
			System.out.println("道は平穏で、何も起こらなかった。");
			stageProg.progressOrReturn();
		}
        }
	}


