package item;

public class StageItem {
	
	private final String itemName;
	private final double probability;
	
	public StageItem(String itemName, double probability) {
		this.itemName = itemName;
		this.probability = probability;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public double getProbability() {
		return probability;
	}
}

