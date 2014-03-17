package de.jknowledge.guestbook.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import de.jknowledge.guestbook.domain.model.Guestbook;
import de.jknowledge.guestbook.domain.services.IGuestbookService;
import de.jknowledge.guestbook.web.Outcomes;
import de.jknowledge.guestbook.web.Utils;

@ManagedBean(name="guestbookBean")
@SessionScoped
public class GuestbookBean implements Serializable {
	
	private Guestbook newEntry;
	
	@Inject
	private IGuestbookService guestbookService;
	
	public String actionCreateNewEntry() {
		newEntry = guestbookService.buildNewObject();
		return Outcomes.CREATE_ENTRY;
	}
	
	public String actionSaveNewEntry() {
		guestbookService.store(newEntry);
		Utils.addInfoMessage("message.guestbook.entry.saved.successful");
		return Outcomes.GUESTBOOK;
	}
	
	public String actionCancelCreateNewEntry() {
		newEntry = null;
		return Outcomes.GUESTBOOK;
	}
	
	public List<Guestbook> getGuestbookEntries() {
		return guestbookService.getGuestbookEntries();
	}

	public Guestbook getNewEntry() {
		return newEntry;
	}

	public void setNewEntry(Guestbook newEntry) {
		this.newEntry = newEntry;
	}
	
	
	
}
