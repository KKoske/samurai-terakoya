package character;

public class HeroInstancePool {
	private static Hero heroInstance;
	
	
	private HeroInstancePool() {	
	}
	
	public static synchronized Hero getHero() {
		if(heroInstance == null) {
			heroInstance = new Hero("みなと", 20, 20, 10, 10, 3 ,1, 0);
		}
		return heroInstance;
	}
	
}
