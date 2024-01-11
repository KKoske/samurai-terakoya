package fieldMap;

import java.util.InputMismatchException;

import commons.SingletonScanner;
import town.TownChoice;

public class FieldChoice {
	
	public static void fieldChoice() {
		
		System.out.println("街");
		System.out.println("どこのマップに行きますか？");
		
		boolean validInput = false;
		while(!validInput) {
			try {
				System.out.println("１：はじまりの森");
				System.out.println("２：森奥の洞窟 (実装中)");
				
				int choice = SingletonScanner.getInstance().getScanner().nextInt();
				SingletonScanner.getInstance().getScanner().nextLine();
				
				switch(choice) {
				
				case 1:
					ForestBiginning.forestBiginning();
					validInput = true;
					break;
					
				case 2:
					//DeepForestCave.deepForestCave();を呼び出し
					System.out.println("[第２フィールド]　実装中");
					validInput = true;
					TownChoice.townChoice();
					break;
					
				default:
					System.out.println("数字で選択肢を入力してください");
				}
			}catch(InputMismatchException e) {
				System.out.println("無効な選択です");
				System.out.println("半角数字を入力して選択肢して下さい");
				SingletonScanner.getInstance().getScanner().nextLine();
			}
		}
		
	}
}
