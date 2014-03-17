package de.jknowledge.guestbook.repository.common;

public interface GenericRepository<T> {
		
	public void persist(T entity);
	
	public void remove(T entity);
	
}
