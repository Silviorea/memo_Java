package GRAPHIQUE.SWING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

// CLASSE qui paramètre ce qu'on va placer DANS LA FENETRE

public class ConteneurFenetre extends JLabel implements ActionListener, MouseListener, KeyListener{
	
	
	
	//////////////////////////////////////////////////
	// DEFINITION DES PROPRIETE QUE JE VAIS UTILISER//
	//////////////////////////////////////////////////
	
	
	private JLabel etiquette;		
	private JButton bouton;
	private JTextField champTexte;
		//pour image :
	private JLabel imageLabel;
	private ImageIcon monImage;
	
	
	
	
	
	////////////////
	// CONSTRUCTOR//
	////////////////
	
	// Il lance la méthode qui centralise toutes les propriétés
	
	public ConteneurFenetre() {
		super();
		this.proprieteConteneur();
	}


	// En JAVA il y a des outils qui permettent de gérer les dispositions (LAYOUT). 
	// On ne va pas les utiliser ici On va placer les composants à la main en posiiton Absolue
	
	
	private void proprieteConteneur() {
		// on utilise pas de Layout
		this.setLayout(null);
		
		// On ajoute l'étiquette au conteneur
		this.proprieteText();
		this.proprieteBouton();
		this.proprieteChampText();
		this.proprieteImage();
		
		// Propriété liées aux Listeners
		this.addMouseListener(this);		// J'ajoute le Conteneur au MouseListener
		this.addKeyListener(this); 			// J'ajoute le Conteneur au KeyListener
		this.setFocusable(true); 			// Pour récupérer le focus avec un listener. 
		this.requestFocusInWindow();
	}


	
	
	
	
	//////////////////////////////////////////////////
	// METHODES DE PROPRIETES DES DIFFERENTS CHAMPS //
	//////////////////////////////////////////////////
	

	private void proprieteText () {
		etiquette = new JLabel();
		
		/*
		 *  coordonnées où l'on souhaite placer le texte (x,y, w, h)
		 *  x,y => coordonnes du coin en haut à gauche où l'on souhaite placer le texte
		 *  w,h => largeur et hauteur de l'etiquette
		 */
	
		this.etiquette.setBounds(50, 100, 350, 20);
		
		// On met un text dans l'étiquette
		this.etiquette.setText("Texte de l'Etiquette");
		
		// On associe l'étiquette au conteneur
		this.add(etiquette);
	}
	
	
	
	
		private void proprieteImage() {
			// je crée mon conteneur d'image
			imageLabel = new JLabel();
			
			//je récupère mon image
			monImage = new ImageIcon("images/marioSautDroite.png");
			
			// je dimensionne mon conteneur
			this.imageLabel.setBounds(20, 20, 50, 50);
			
			// je lui rajoute mon image
			this.imageLabel.setIcon(monImage);
			
			// j'ajoute mon conteneur d'image au conteneur de ma fenetre
			this.add(imageLabel);
			
		}
	
	
		
		
		private void proprieteBouton() {
			bouton = new JButton();
			this.bouton.setBounds(50, 150, 150, 50);
			this.bouton.setText("Appuyer ICI");
			this.bouton.addActionListener(this);		// J'ajoute le bouton à l'ActionListener
			this.add(bouton);
		}

		
		
		
		private void proprieteChampText() {
			champTexte = new JTextField();
			this.champTexte.setBounds(220, 150, 150, 50);
			this.add(champTexte);
			this.champTexte.addActionListener(this);	// J'ajoute le ChampText à l'ActionListener
		}


		
		
		
		
		
		/////////////////////////////////////
		// METHODES DES INTERFACES LISTENER//
		/////////////////////////////////////
		
		
		
		// Methode de l'interface ActionListener qui définit L'ACTION de l'ActionListener
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			// Si j'appuie sur le bouton, le texte de l'etiquette change
			if(event.getSource() == this.bouton)
			{
				this.etiquette.setText("On a cliqué sur le bouton");
			}
			
			// j'édite le champTexte, le texte de l'etiquette change
			else if (event.getSource() == this.champTexte)
			{
				this.etiquette.setText(this.champTexte.getText());
			}
			
			
			// Je rends le FOCUS aux autres composants apres avoir cliquer le bouton
			// Sinon quand je clique, je ne peux plus utiliser le KeyListener car il n'a plus le focus
			this.requestFocusInWindow();
			
		}


		
		
		
		// Methodes de l'interface MouseListener qui définit L'ACTION du MouseListener
		// On va juste utiliser mousePressed pour l'exemple
		
		@Override
		public void mousePressed(MouseEvent event) {
			this.imageLabel.setBounds(event.getX(), event.getY(), imageLabel.getWidth(), imageLabel.getHeight());
			this.etiquette.setText("Image déplacée au coordonnées : " + event.getX() + " - " + event.getY());
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
				
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		
		
		
		
		
		
		
		// Methodes de l'interface KeyListener qui définit L'ACTION du KeyListener
		// On va juste utiliser mousePressed pour l'exemple
		
		@Override
		public void keyPressed(KeyEvent event) {
			
			if (event.getKeyCode() == KeyEvent.VK_UP)				// VK_UP => Fleche du haut
			{
				this.imageLabel.setBounds(imageLabel.getX(), 
										  imageLabel.getY() - 10, 	// si fleche du haut, je déplace vers le haut
										  imageLabel.getWidth(), 
										  imageLabel.getHeight());
			}
			
			if (event.getKeyCode() == KeyEvent.VK_DOWN)				// => Fleche du bas
			{
				this.imageLabel.setBounds(imageLabel.getX(), 
										  imageLabel.getY() + 10, 	// si fleche du bas, je déplace vers le bas
										  imageLabel.getWidth(), 
										  imageLabel.getHeight());
			}
			
			if (event.getKeyCode() == KeyEvent.VK_LEFT)				
			{
				this.imageLabel.setBounds(imageLabel.getX() - 10, 
										  imageLabel.getY(), 	
										  imageLabel.getWidth(), 
										  imageLabel.getHeight());
			}
			
			if (event.getKeyCode() == KeyEvent.VK_RIGHT)				
			{
				this.imageLabel.setBounds(imageLabel.getX() + 10, 
										  imageLabel.getY(), 	
										  imageLabel.getWidth(), 
										  imageLabel.getHeight());
			}
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}


		


		
		
		
		

	

}
