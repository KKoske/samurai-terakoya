package item;

public class ItemFactory {

	public static Item createItem(String itemName) {

		if(itemName == null) {
			System.out.println("道中に何も拾わなかった。");
			return null;
		}else {
			switch(itemName) {
			case "Herb":
				return new Herb("Herb", "体力を癒してくれる野草", 100,20);
				
			case "Glass":
				return new Glass("Glass", "魔力を回復させる雑草", 100,10);
				
			default:
				return null;
			}
		}
	}
}
