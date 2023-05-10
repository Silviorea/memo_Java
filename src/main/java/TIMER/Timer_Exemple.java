package TIMER;

import java.util.Timer;
import java.util.TimerTask;


/*
 * La méthode SCHEDULE() de la classe TIMER permet de créer un chronometre : 
 * 
 * On va créer une tache qui permet d'effectuer un certain nombre d'instruction
 * soit de manière itérative (par exemple chaque seconde)
 * soit de manière temporisée (après un certain temp)
 * 
 * Paramètre 1 = Instance de TimerTask. tache a acomplire 
 * Paramètre 2 = delay de démarrage
 * Paramètre 3 = délay entre chaque répétition 
 * 
 * On peut annuler la répétition avec la méthode CANCEL()
 */


public class Timer_Exemple {

	public static void main(String[] args) {


		
		System.out.println("Début du programme : ");
		
		Timer chrono = new Timer();
		
		
		chrono.schedule(new MyTaskToTimer(),
						3000,
						1000);
		
	}

}
