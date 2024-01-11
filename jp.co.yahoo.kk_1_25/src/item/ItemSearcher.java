package item;

public class ItemSearcher {
	public void searchForItem() {
		StageItem foundItem = StageLoot.pickUpItemInForestStage();
		
		if(foundItem != null) {
			Item newItem = ItemFactory.createItem(foundItem.getItemName());
			
			if(newItem != null){
				Inventory inventory = Inventory.getInstance();
				inventory.addItem(newItem, 1);
			}
		}
		
	}
	

}
