package org.gujavasc.openetworking.mb;

import java.io.Serializable;



import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Event;

@Named
@ViewScoped
public class EventMB implements Serializable{
	
	private static final long serialVersionUID = -6601391210412051501L;
	
	private boolean search;
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
	
}
