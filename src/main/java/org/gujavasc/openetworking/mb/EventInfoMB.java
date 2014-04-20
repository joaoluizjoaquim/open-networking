package org.gujavasc.openetworking.mb;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@ViewScoped
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
