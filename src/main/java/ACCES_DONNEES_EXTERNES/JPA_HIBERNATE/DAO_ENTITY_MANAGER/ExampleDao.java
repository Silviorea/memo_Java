package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.DAO_ENTITY_MANAGER;

import ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.Model.Example;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ExampleDao {

	
	// Sauvegarde
	
	public Example merge(Example object) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Example merged = em.merge(object);
		transaction.commit();
		em.close();
		return merged;
	}

	
	// Recherche
	
	public Example findById(Long id) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		return em.find(Example.class, id);
	}

	
	// Supprime
	
	public void remove(Long id) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.createQuery("delete from Example e where e.id = :id", Example.class).setParameter("id", id)
				.executeUpdate();
		transaction.commit();
		em.close();
	}

}
