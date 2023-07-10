package GRAPHIQUE.AWS.Animé;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

// CLASSE qui paramètre ce qu'on va placer DANS LA FENETRE

public class ConteneurFenetreAnime extends JPanel implements ActionListener{
	
	
	
	// Tous les combien de temps / ActionListener a implementer (this car Classe l'implemente directement)
	
	Timer chrono = new Timer(10, this);			// !! Prende le TIMER DE SWING !!
	int deplacementX = 0;
	
	
	
	public ConteneurFenetreAnime() {
		super();
		chrono.start(); 				// Mon constructeur lance le chrono
	}

		
	
	

	// METHODES
	
	
	// Je redéfinie la méthode paintComponent() de la classe JPanel
	
	public void paintComponent(Graphics graph) {
		
		super.paintComponent(graph);
		
		/*
		 * Si je ne souhaite pas que les précédent rectangle reste dessiné, 
		 * je peux actualiser la couleur de la page à chaque rafraichissement
		 * du timer
		 */
		graph.setColor(Color.WHITE);
		graph.fillRect(0, 0, 400, 300);
		
		
		// Je dessine un rectangle
		graph.setColor(Color.BLUE);
		
		// je le place en ajoutant la variable deplacementX sur son axe des X
		graph.fillRect(10 + deplacementX, 10, 20, 30);
	}





	@Override
	public void actionPerformed(ActionEvent event) {
		
		/*
		 *  L'action de mon Timer sera d'augmenter la valeur de deplacementX afin
		 *  que le rectangle se déplace sur l'axe X a chaque fois qu'il est actualisé
		 */
		
		deplacementX ++;
		
		// repaint va relancer la methode paintComponent qui, à la base, n'est lancée qu'une fois
		repaint();
	}

}
