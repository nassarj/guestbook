package de.jknowledge.guestbook.repository.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.jknowledge.guestbook.repository.common.GenericRepository;

public abstract class GenericJpaRepository<T> implements GenericRepository<T> {
	
	
	protected EntityManager em;
	
	public GenericJpaRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("guestbookPU");
		em = emf.createEntityManager();
	}
	
	@Override
	public void persist(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	@Override
	public void remove(T entity) {
		em.remove(entity);
	}
	
}
