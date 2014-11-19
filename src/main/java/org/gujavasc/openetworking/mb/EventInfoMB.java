package org.gujavasc.openetworking.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;
import org.gujavasc.openetworking.service.EventService;

@Named
@RequestScoped
public class EventInfoMB {

	private Event selectedEvent;
	
	public void searchSelectedEvent(Long eventId){
		selectedEvent = new EventService().findById(eventId);
	}
	
	public Event getSelectedEvent() {
		return selectedEvent;
	}

	public void setSelectedEvent(Event selectedEvent) {
		this.selectedEvent = selectedEvent;
	}
}
