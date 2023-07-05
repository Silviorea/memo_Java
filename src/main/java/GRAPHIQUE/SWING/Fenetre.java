package GRAPHIQUE.SWING;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	
	private ConteneurFenetre pan;
	
	
	// CONSTRUCTOR
	public Fenetre() {
		super();
		proprieteFenetre();
	}
	

	
	public void proprieteFenetre() {
		
		// Dimension fenetre (X, y)
		this.setSize(400, 300);
		
		// Non redimensionable
		this.setResizable(false);
		
		// Centrée à l'écran
		this.setLocationRelativeTo(null);
		
		// Programme se ferme si je ferme la fenetre
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Fenetre reste toujours visible
		this.setAlwaysOnTop(true);
		
		// On instancie de conteneur Fenetre:
		pan = new ConteneurFenetre();
		
		// on le relie à la fenetre
		this.setContentPane(pan);
	}

}
