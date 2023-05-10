package TIMER;

import java.util.TimerTask;

// Ma classe va étendre TIMERTASK,
// Je pourrais donc l'utiliser en paramètre du Chrono.

public class MyTaskToTimer extends TimerTask{

	private int time = 5;
	
	@Override
	public void run() {
		if(time==0)
		{
			System.out.println("Boom!");
			cancel();
		}
		else 
		{
			System.out.println("Il reste " + time + " sec");
		} 
		time--;
	}
	
	
}
