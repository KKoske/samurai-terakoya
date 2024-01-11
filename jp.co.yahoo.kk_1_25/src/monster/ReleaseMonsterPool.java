package monster;

import java.util.LinkedList;
import java.util.Queue;

public class ReleaseMonsterPool {
	
	private static ReleaseMonsterPool instance = new ReleaseMonsterPool();
	private Queue<Monster> releaseMonster;
	private static final int THERSHOLD = 1;
	
	private ReleaseMonsterPool() {
		this.releaseMonster = new LinkedList<>();
	}
	
	public static synchronized ReleaseMonsterPool getInstance() {
		return instance;
	}
	
	public void addReleaseMonster(Monster monster) {
		monster.resetState();
		releaseMonster.offer(monster);
		if(releaseMonster.size() > THERSHOLD) {
			removeOldestMonster();
		}
	}
	private void removeOldestMonster() {
		releaseMonster.poll();
	}
}