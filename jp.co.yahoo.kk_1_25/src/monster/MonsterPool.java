package monster;

import java.util.ArrayList;
import java.util.List;


public class MonsterPool {
	private static MonsterPool monsterPoolInstance;
	private List<Monster>pool;	
	private final int maxPoolSize;

	private MonsterPool(int maxPoolSize) {
		this.pool = new ArrayList<>();
		this.maxPoolSize = maxPoolSize;
		initializePool();
	}

	public static synchronized MonsterPool getInstance(int maxPoolSize) {
		if (monsterPoolInstance == null) {
			monsterPoolInstance = new MonsterPool(maxPoolSize);
		}
		return monsterPoolInstance;
	}

	public void initializePool() {
		while (pool.size() < maxPoolSize) {
			addSlime("スライム", 10, 10, 5, 5, 3, 3);
			addGoblin("ゴブリン", 10, 10, 5, 5, 3, 3);
			addMagicalbba("マジカルばばあ", 10, 10, 5, 5, 3, 3);
		}
	}

	public void addSlime(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
		if(pool.size() < maxPoolSize) {
			Slime slime = new Slime(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
			pool.add(slime);
		}
	}

	public void addGoblin(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
		if(pool.size() < maxPoolSize) {
			Goblin goblin = new Goblin(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
			pool.add(goblin);
		}
	}

	public void addMagicalbba(String name, int MaxHP, int currentHP, int MaxMP, int currentMP, int attackPower, int exp) {
		if(pool.size() < maxPoolSize) {
			Magicalbba magicalbba = new Magicalbba	(name, MaxHP, currentHP, MaxMP, currentMP, attackPower, exp);
			pool.add(magicalbba);
		}
	}

	public Slime getSlime() {
		if(pool.isEmpty()) {
			System.out.println("モンスターインスタンスが不足しています");
			return null;
		}else {
			return (Slime) pool.get(0);
		}
	}

	public Goblin getGoblin() {
		if(pool.isEmpty()) {
			System.out.println("モンスターインスタンスが不足しています");
			return null;
		}else {
			return (Goblin) pool.get(1);
		}
	}

	public Magicalbba getMagicalbba() {
		if(pool.isEmpty()) {
			System.out.println("モンスターインスタンスが不足しています");
			return null;
		}else {
			return (Magicalbba) pool.get(2);
		}
	}

	public Monster getRandomMonster() {
		if(pool.isEmpty()) {
			System.out.println("モンスターインスタンスが不足しています");
			return null;
		}else {
			int randomIndex = (int)(Math.random() * pool.size());
			return  pool.get(randomIndex);
		}
	}
}
