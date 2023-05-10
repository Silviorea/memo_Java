package CLASSES.INTERFACE;


// ICI je redéfinis la méthode de l'interface TEST1

public interface test3 extends test1{
	
default void methodeDeMontest1() {
		
		System.out.println(("Je redéfinis la méthode TEST1"));
	}

}
