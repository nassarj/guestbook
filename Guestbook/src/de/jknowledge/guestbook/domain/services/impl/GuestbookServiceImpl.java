package de.jknowledge.guestbook.domain.services.impl;

import java.util.List;

import javax.inject.Inject;

import de.jknowledge.guestbook.domain.model.Guestbook;
import de.jknowledge.guestbook.domain.model.GuestbookBuilder;
import de.jknowledge.guestbook.domain.services.IGuestbookService;
import de.jknowledge.guestbook.repository.common.GuestbookRepository;

public class GuestbookServiceImpl implements IGuestbookService {
	
	@Inject
	private GuestbookRepository guestbookRep;
	
	@Inject
	private GuestbookBuilder guestbookBuilder;
	
	@Override
	public List<Guestbook> getGuestbookEntries() {
		return guestbookRep.findAll();
	}
	
	@Override
	public Guestbook buildNewObject() {
		return guestbookBuilder.buildGuestbook();
	}
	
	@Override
	public void store(Guestbook gbObj) {
		guestbookRep.persist(gbObj);
	}
	
}
