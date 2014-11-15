package org.gujavasc.openetworking.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@RequestScoped
public class SearchEventsMB implements Serializable{
	
	private static final long serialVersionUID = -6601391210412051501L;
	
	private String filterEventName;
	private List<Event> eventsFound;
	
	public void searchEvent(){
		eventsFound = Arrays.asList(new Event(1l,"TDC 2014"), new Event(2l,"JavaOne 2014"));
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
