package town;

import java.util.InputMismatchException;

import commons.SingletonScanner;

public class WeaponShop {

	public static void weaponShop() {
		System.out.println("らっしゃい！武器屋だ、何か買っていくかい？");
		System.out.println("武器、防具は装備しないと意味がないぞ！");
		
		boolean validInput = false;
		while(!validInput) {
			try {
				System.out.println("1:武器購入、実装中");
				System.out.println("2:やめておく");
				
				int choice = SingletonScanner.getInstance().getScanner().nextInt();
				SingletonScanner.getInstance().getScanner().nextLine();
				
				switch(choice){
					case 1:
						System.out.println("実装中");
						validInput = true;
						break;
						
					case 2:
						System.out.println("そうかい、またおいで！");
						validInput = true;
						break;
					default:
						System.out.println("選択肢を入力して下さい");
				}
					
			}catch(InputMismatchException e) {
				System.out.println("無効な入力です、半角で数字を入力して下さい");
				SingletonScanner.getInstance().getScanner().nextLine();
			}
			TownChoice.townChoice();
		}
	}	
	}
