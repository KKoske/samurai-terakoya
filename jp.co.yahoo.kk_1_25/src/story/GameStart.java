package story;

import java.util.InputMismatchException;

import commons.SingletonScanner;

public class GameStart {

	public static void gameStart() {
		
		System.out.println("王様：よく来た、勇者よ！まずは名前を聞かせてくれ。");
		System.out.println("勇者：");
		
		String name = SingletonScanner.getInstance().getScanner().nextLine();
		System.out.println("王様：" + name + " か、良い名だ");
		
		System.out.println("王様：では " + name + "　よ、最近魔物が活発化していて、はるか昔に封印されし魔王が復活する！そこで魔王を倒してくれ勇者よ！");
		System.out.println("勇者：");
		
		boolean vaildInput = false;
		while(!vaildInput) {
			try {
				System.out.println("1. はい");
				System.out.println("2. いいえ");
				System.out.println("1 か2 の選択肢を入力してください");
				
				int choice = SingletonScanner.getInstance().getScanner().nextInt();
				SingletonScanner.getInstance().getScanner().nextLine();
				
				switch(choice) {
					case 1:
						System.out.println("王様：おぉやってくれるか！それでは頼んだぞ！");
						vaildInput = true;
						break;
						
					case 2:
						System.out.println("最近耳が遠くての、なんと言ったかよく聞き取れんかった。");
						System.out.println("もう一度言ってくれるかの。");
						vaildInput = false;
						break;
						
					default:
						System.out.println("選択肢を入力してください");
				}
			}catch(InputMismatchException e) {
				System.out.println("無効な入力です、半角で整数を入力して下さい");
				SingletonScanner.getInstance().getScanner().nextLine();
			}
		}
		
		System.out.println("王様：まずは何代も昔から受け継いだ、家宝がある。\nそれをまずは取りに南の洞窟に行ってくれ！");
		System.out.println("王様：これは餞別じゃ");
		System.out.println(name + " は 20G と「ひのきのぼう」を手に入れた");
	}
}