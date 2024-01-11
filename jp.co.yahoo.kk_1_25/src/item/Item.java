package item;

import java.util.Objects;

import character.Hero;

public abstract class Item {

	private String name;
	private String description;
	private int price;
	
	public abstract void use(Hero hero);
	
	public Item(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getPrice() {
		return price;
	}
	
	public boolean isUsableInBattle() {
		return false;
	}
	
	//override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if(obj == null || getClass()!= obj.getClass())return false;
		Item item = (Item) obj;
		return Objects.equals(name, item.name);
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
}
