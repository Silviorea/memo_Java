package CLASSES.HERITAGE;

public class Cylindre extends Cercle{
	
	private int hauteur;
	

	public Cylindre(int rayon, int hauteur) {
		super(rayon);
		this.hauteur = hauteur;
	}

	
	
	public double volume()
	{
		return this.hauteur * super.surface();
	}
	
	

	
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	

}
