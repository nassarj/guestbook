package de.jknowledge.guestbook.repository.common;

import java.util.List;

import de.jknowledge.guestbook.domain.model.Guestbook;

public interface GuestbookRepository extends GenericRepository<Guestbook> {
	
	public List<Guestbook> findAll();
	
}
