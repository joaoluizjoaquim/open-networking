package org.gujavasc.openetworking.service;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.gujavasc.openetworking.bean.Event;

public class EventService {

	public List<Event> findAllByName(String name) {
		Response response = eventPath()
			.queryParam("q", name)
			.request(MediaType.APPLICATION_JSON).get();
		List<Event> readEntity = response.readEntity(new GenericType<List<Event>>() {});
		return readEntity;
	}
	public Event findById(Long id){
		Response response = eventPath()
		.path("/"+id)
		.request(MediaType.APPLICATION_JSON).get();
		Event event = response.readEntity(Event.class);
		return event;
	}	
	
	private WebTarget eventPath() {
		return ClientBuilder.newClient()
				.target("http://localhost:8088/open-networking-back-java")
				.path("/events");
	}	
	
}