package town;

import java.util.InputMismatchException;

import commons.SingletonScanner;

public class ToolShop {

	public static void toolShop() {
		
		System.out.println("いらっしゃ");
		System.out.println("道具買っていくかい");
		System.out.println("実装中");
			
			boolean validInput = false;
			while(!validInput) {
				try {
					System.out.println("1:道具購入、実装中");
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
					System.out.println("無効な入力です、半角で整数を入力して下さい");
					SingletonScanner.getInstance().getScanner().nextLine();
				}
				TownChoice.townChoice();
			}
		}	
	}
