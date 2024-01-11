package item;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

import  character.Hero;
import commons.SingletonScanner;

public class Inventory {
	
	private HashMap<Item, Integer> items;
	private static Inventory instance;
	
	private Inventory() {
		items = new HashMap<>();
	}
	
	public static Inventory getInstance() {
		if(instance == null) {
				synchronized(Inventory.class) {
					if(instance == null)
					instance = new Inventory();
				}
		}
		return instance;
	}

	public void addItem(Item item, int count) {
		items.put(item, items.getOrDefault(item, 0) + count);
		System.out.println(item.getName() + "が１つ手に入った");
	}
	
	public void useItem(Item item, Hero hero) {
		if(item.isUsableInBattle() && items.containsKey(item) && items.get(item) > 0) {
			item.use(hero);
			items.put(item, items.get(item) - 1);
			if(items.get(item) == 0) {
				items.remove(item);
			}
		}
	}
	
	public int getItemCount(Item item) {
		return items.getOrDefault(item, 0);
	}
	
	public List<Item>getConsumableItemsInStock(){
		return items.keySet().stream()
			.filter(item -> item.isUsableInBattle() && items.get(item) > 0)
			.collect(Collectors.toList());
	}
	
	public boolean displayAndUseItem(Hero hero) {
		List<Item> consumableItems = getConsumableItemsInStock();
		
		if(consumableItems.isEmpty()) {
			System.out.println("現在、使用できるアイテムを所持していません。");
			return false;
		}
		
		for(int i = 0; i < consumableItems.size(); i++) {
			System.out.println((i + 1) + "." + consumableItems.get(i).getName() + "(在庫：" + getItemCount(consumableItems.get(i)) + ")");
		}
		
		int choice = -1;
		try {
			choice = SingletonScanner.getInstance().getScanner().nextInt();
			
			if(choice < 1 || choice > consumableItems.size()) {
				System.out.println("無効な選択です。");
				return false;
		}
	}catch(InputMismatchException e) {
		System.out.println("正しい番号を入力して下さい。");
		return false;
	}
	
	Item selectedItem = consumableItems.get(choice - 1);
	System.out.println(selectedItem.getName() + "を使用しますか？(y/n)");
	char confirmation = SingletonScanner.getInstance().getScanner().next().charAt(0);
	
	if(confirmation == 'y' || confirmation == 'Y') {
		useItem(selectedItem, hero);
		System.out.println(selectedItem.getName() + "を使用しました");
		return true;
	}else {
		System.out.println("アイテムの使用をキャンセルしました。");
		return false;
	}
}
}