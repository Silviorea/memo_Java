package ACCES_DONNEES_EXTERNES.JPA_HIBERNATE.DAO_ENTITY_MANAGER;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;

/*
 * Classe abstraite et GENERIQUE avec toutes les méthodes d'EntityManager (crud) qui 
 * sont aussi GENERIQUE.
 * 
 * L'intéret est de pouvoir l'étendre aux classes de DAO afin qu'elles récupèrent toutes les
 * méthodes génériques qui vont s'appliquer au type du modèle du DAO : 
 * FournisseurDao => Type générique sera Fournisseur
 * ArticleDao => Type générique sera Article
 */



/**
 * Base Abstract DAO
 * @author bigcorp
 *
 * @param <T>
 */
public abstract class AbstractDaoClass<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	/**
	 * @see EntityManager#find(Class, Object)
	 * @param entity
	 */
	public T findById(Class<T> clazz, Integer id) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		return em.find(clazz, id);
	}

	/**
	 * @see EntityManager#merge(Object)
	 * @param entity
	 */
	public T merge(T entity) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		T merged = em.merge(entity);
		transaction.commit();
		em.close();
		return merged;
	}

	/**
	 * @see EntityManager#persist(Object)
	 * @param entity
	 */
	public void persist(T entity) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(entity);
		transaction.commit();
		em.close();
	}

	/**
	 * @see EntityManager#remove(Object)
	 * @param entity
	 */
	public void remove(T entity) {
		EntityManager em = PersistenceSingleton.INSTANCE.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.remove(entity);
		transaction.commit();
		em.close();
	}

}
