package battle;

import commons.SingletonScanner;

public class BattleCommand {
	
	public int selectCommand() {
		System.out.println("コマンドを選択してください。");
		System.out.println("1. こうげき");
		System.out.println("2. まほう");
		System.out.println("3. どうぐ");
		System.out.println("4. にげる");
		
		while(true) {
			if(SingletonScanner.getInstance().getScanner().hasNextInt()) {
				int choice = SingletonScanner.getInstance().getScanner().nextInt();
				if(choice >= 1 && choice <= 4) {
					return choice;
				}
			}else {
				SingletonScanner.getInstance().getScanner().next();
			}
			System.out.println("");
		}
	}
}
