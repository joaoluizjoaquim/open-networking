package org.gujavasc.openetworking.mb;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;
import org.gujavasc.openetworking.service.EventService;

@Named
@RequestScoped
public class SearchEventsMB{
	
	private String filterEventName;
	private List<Event> eventsFound;
	
	@Inject
	private EventService service;
	
	public void searchEvent(){
		eventsFound = service.findAllByName(filterEventName);
	}
	
	public Boolean foundSomeEvent(){
		return eventsFound != null && !eventsFound.isEmpty();
	}

	public List<Event> getEventsFound() {
		return eventsFound;
	}

	public String getFilterEventName() {
		return filterEventName;
	}

	public void setFilterEventName(String filterEventName) {
		this.filterEventName = filterEventName;
	}
	
}
