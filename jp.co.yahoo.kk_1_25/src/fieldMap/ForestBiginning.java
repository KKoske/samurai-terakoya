package fieldMap;

import java.util.InputMismatchException;

import commons.SingletonScanner;
import mapStages.MapStages;
import mapStages.StageProgression;
import town.TownChoice;

public class ForestBiginning {
	
	static StageProgression Progression = new StageProgression();
	
	private static final String NAME = "始まりの森";
	
	public static String getName() {
		return NAME;
	}

	public static void forestBiginning() {
		System.out.println(getName());
		
		//始まりの森をインスタンス化して、名前をつけて、getNameForestBiginningメソッドで名前を呼び出せる様にする？
		
		boolean validInput = false;
		while (!validInput) {
			try {
				System.out.println("１：進む");
				System.out.println("２：戻る");
				
				int Choice = SingletonScanner.getInstance().getScanner().nextInt();
				SingletonScanner.getInstance().getScanner().nextLine();
				
				switch(Choice) {
				case 1:
					MapStages Stages = new MapStages(Progression.getNextStageName());
					Stages.enterStage();
					
					validInput = true;
					break;
					
				case 2:
					System.out.println("街に戻ります");
					TownChoice.townChoice();
					validInput = true;
					break;
					
				}
			}catch(InputMismatchException e) {
				System.out.println("無効な入力です");
			}
		}
	}
}