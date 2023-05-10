package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.DAO_ENTITY_MANAGER;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Singleton pour un contexte de persistence
 */
public class PersistenceSingleton {


	// On s'assure ici que seule une instance de la classe sera créée
	public static final PersistenceSingleton INSTANCE = new PersistenceSingleton();

	
	
	private EntityManagerFactory entityManagerFactory;

	// Cette String est enregistrée dans le fichier "persistence.xml" (fichier de properties qui fait le lien avec la BDD)
	private static final String PERSISTENCE_UNIT = "persistence-unit";
	
	
	
	// On s'assure ici que seule une instance de la classe sera créée
	private PersistenceSingleton() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
	}

	//Grace à la factory, on crée un EntityManager 
	// Méthode utile pour créer une entityManager
	public EntityManager createEntityManager() {
		return this.entityManagerFactory.createEntityManager();
	}

}
