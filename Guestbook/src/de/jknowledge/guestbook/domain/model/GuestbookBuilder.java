package de.jknowledge.guestbook.domain.model;

import java.util.Date;


public class GuestbookBuilder {
	
	public Guestbook buildGuestbook() {
		Guestbook newObject = new Guestbook();
		newObject.setCreationDate(new Date());
		return newObject;
	}
	
}
