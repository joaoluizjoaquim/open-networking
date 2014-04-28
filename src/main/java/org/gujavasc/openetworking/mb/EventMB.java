package org.gujavasc.openetworking.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@RequestScoped
public class EventMB implements Serializable{
	
	private static final long serialVersionUID = -6601391210412051501L;
	
	private boolean search;
	private String filterEventName;
	private List<Event> eventsFound;
	
	public void searchEvent(){
		eventsFound = Arrays.asList(new Event("TDC 2014", 5753), new Event("JavaOne 2014",8492));
		search = true;
	}
	
	public Boolean foundSomeEvent(){
		return search;
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
