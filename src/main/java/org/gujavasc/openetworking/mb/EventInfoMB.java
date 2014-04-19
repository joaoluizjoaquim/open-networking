package org.gujavasc.openetworking.mb;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@ViewScoped
public class EventInfoMB {

	private Event selectedEvent;
	
	@PostConstruct
	public void postConstruct(){
		selectedEvent = new Event();
	}

	public Event getSelectedEvent() {
		return selectedEvent;
	}

	public void setSelectedEvent(Event selectedEvent) {
		this.selectedEvent = selectedEvent;
	}
	
}
