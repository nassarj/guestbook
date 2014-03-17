package de.jknowledge.guestbook.web;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utils {
	
	private static ResourceBundle messages = ResourceBundle.getBundle("de.jknowledge.guestbook.web.resources.messages");
	
	public static final void addInfoMessage(String key) {
		String msgStr = messages.getString(key);
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, 
				null, 
				msgStr);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		
	}

}
