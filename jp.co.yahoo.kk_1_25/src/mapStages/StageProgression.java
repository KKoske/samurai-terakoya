package mapStages;

import battle.BossBattle1_1;
import character.Hero;
import character.HeroInstancePool;
import commons.SingletonScanner;
import fieldMap.FieldChoice;
import monster.Boss1_1;

public class StageProgression {
	private static final int MAX_STAGE = 3;
	private int currentArea = 1;
	private static int currentStage = 1;
	private String baseStageName = "始まりの森";
	
public String getNextStageName() {
	return baseStageName + " " + currentArea + "-" + currentStage;
	}

public static void stageClear() {
	System.out.println("ステージクリア！");
}
	//currentStageの数の管理用メソッド
public static void advanceStage() {
		currentStage++;
}

public static int getCurrentStage() {
	return currentStage;
}

public void progressOrReturn() {
	System.out.println("進みますか？");
	System.out.println("1: 進む");
	System.out.println("2: 戻る");
	int input = SingletonScanner.getInstance().getScanner().nextInt();

	if(input == 1){
			proceedToNextStage();
	}else if(input == 2) {
		FieldChoice.fieldChoice();
	}
}

public void proceedToNextStage() {
	if(currentStage < MAX_STAGE) {
	advanceStage();
	System.out.println("次のステージ: " + getNextStageName()); 
	MapStages nextStage = MapStages.getMapStagesInstance(getNextStageName());
	nextStage.enterStage();
	}else {
		Boss1_1 boss1_1 = new Boss1_1("", 50, 50, 30, 30, 10, 23);
		Hero hero =  HeroInstancePool.getHero();
		BossBattle1_1.bossBattle1_1(hero, boss1_1);
		stageClear();//本来はここにボス戦闘メソッドを入れて、そのボス戦闘が終了したタイミングにstageClear()を入れる。
		System.out.println("第１ボス後エンディングストーリー");//拡張性的にもここをエンディングとするのではなく、第１章エンディングなどとした方がいい
	}
}
}


