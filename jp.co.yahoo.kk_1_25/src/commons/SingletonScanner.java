package commons;

import java.util.Scanner;

public class SingletonScanner {
	private static final SingletonScanner INSTANCE = new SingletonScanner();
	private final Scanner scanner;
	
	private SingletonScanner() {
		this.scanner = new Scanner(System.in);
	}
	
	public static SingletonScanner getInstance() {
		return INSTANCE;
	}
	
	public Scanner getScanner() {
		return scanner;
	}
}

