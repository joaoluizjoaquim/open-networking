package org.gujavasc.openetworking.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@RequestScoped
public class EventInfoMB {

	private Event selectedEvent;
	
	public void searchSelectedEvent(String selectedEventName){
		selectedEvent = new Event(selectedEventName, 7543);
	}
	
	public Event getSelectedEvent() {
		return selectedEvent;
	}

	public void setSelectedEvent(Event selectedEvent) {
		this.selectedEvent = selectedEvent;
	}
}
