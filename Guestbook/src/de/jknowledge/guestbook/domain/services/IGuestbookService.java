package de.jknowledge.guestbook.domain.services;

import java.util.List;

import de.jknowledge.guestbook.domain.model.Guestbook;

public interface IGuestbookService {
	
	public List<Guestbook> getGuestbookEntries();
	
	public Guestbook buildNewObject();
	
	public void store(Guestbook gbObj);
	
}
