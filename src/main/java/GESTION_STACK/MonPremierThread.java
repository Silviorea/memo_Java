package GESTION_STACK;

public class MonPremierThread extends Thread {
	
	public void run() {
		int i = 0;
		while(true) {
			System.out.println("Dans mon autremon i vaut : " + i);
		}
	}

}
