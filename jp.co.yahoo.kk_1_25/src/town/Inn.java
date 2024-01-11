package town;

import java.util.InputMismatchException;

import commons.SingletonScanner;

public class Inn {
	
	public static void inn(){
		System.out.println("旅の宿屋だよ");
		System.out.println("休んでいくかい？一泊5Gだよ！");
		
		boolean validInput = false;
		while(!validInput) {
			try {
				System.out.println("1:泊まる");
				System.out.println("2:やめておく");
				
				int choice = SingletonScanner.getInstance().getScanner().nextInt();
				SingletonScanner.getInstance().getScanner().nextLine();
				
				switch(choice){
					case 1:
						System.out.println("ゆっくりして行きな！");
						System.out.println("勇者らは全回復した。");
						System.out.println("回復実装中");
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


//各行の間にEnter を押すごとに１行進むシステムのクラスを作ってしまう。それで各行の間にそのクラスメソッドを挟むことで、Enterを押すことで１行ずつ進むシステムにする

