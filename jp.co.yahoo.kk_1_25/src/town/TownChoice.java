package town;

import java.util.InputMismatchException;

import commons.SingletonScanner;
import fieldMap.FieldChoice;

public class TownChoice {
	
		public static void townChoice(){
		
			System.out.println("[城下街]");
			System.out.println("どこへ行きますか？");
			
			
			boolean validInput = false;
			while(!validInput) {
				try {
					System.out.println("1:宿屋");
					System.out.println("2:道具屋");
					System.out.println("3:武器屋");
					System.out.println("4:教会");
					System.out.println("5:街の外へ");
				
					int Choice = SingletonScanner.getInstance().getScanner().nextInt();
					SingletonScanner.getInstance().getScanner().nextLine();
					
					switch(Choice){
					
					case 1:
						Inn.inn();
						validInput = true;
						break;
						
					case 2:
						ToolShop.toolShop();
						validInput = true;
						break;
						
					case 3:
						WeaponShop.weaponShop();
						validInput = true;
						break;
						
					case 4:
						Church.church();
						validInput = true;
						break;
						
					case 5:
						FieldChoice.fieldChoice();
						validInput =true;
						break;
						
					default:
						System.out.println("選択を入力して下さい");
						
					}
				}catch(InputMismatchException e){
						System.out.println("無効な選択です");
						SingletonScanner.getInstance().getScanner().nextLine();
				}
			}
		}
}


