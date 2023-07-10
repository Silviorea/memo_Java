package GRAPHIQUE.AWS.Fixe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

// CLASSE qui paramètre ce qu'on va placer DANS LA FENETRE

public class ConteneurFenetreAWS extends JPanel{
	
	
	
	//////////////////////////////////////////////////
	// DEFINITION DES PROPRIETE QUE JE VAIS UTILISER//
	//////////////////////////////////////////////////
	
	private Color couleur1 = new Color(100, 200, 250);				// RGB
	private Font police1 = new Font("Arial", Font.BOLD, 20);		// Type, Style, Taille
	private ImageIcon icon = new ImageIcon("images/marioSautDroite.png");
	private Image myImage = icon.getImage();
	
	
	////////////////
	// CONSTRUCTOR//
	////////////////

	
	public ConteneurFenetreAWS() {
		super();
	}

		

	// METHODES
	
	
	// Je redéfinie la méthode paintComponent() de la classe JPanel
	
	public void paintComponent(Graphics graph) {
		
		super.paintComponent(graph);
		
		// Je définie la couleur et la forme de mon dessin
		graph.setColor(couleur1);
		graph.drawRect(10, 10, 200, 250);		// Meme paramètre que pour setBounds() de Swing
		
		// Je définie la couleur et la forme d'un autre dessin. Je le place a l'interieur du 1er
		graph.setColor(Color.GREEN);
		graph.fillRect(20, 20, 180, 230);
		
		graph.setColor(Color.MAGENTA);
		graph.fillOval(40, 40, 100, 150);
		
		// Je peux dessiner une String
		graph.setColor(Color.BLACK);
		graph.drawString("MA STRING SANS MON FONT", 220, 50);
		graph.setFont(police1);
		graph.drawString("MA STRING AVEC MON FONT", 220, 70);
		
		// Je peux afficher une image
		graph.drawImage(myImage, 260, 100, null);
	}

}
