package org.gujavasc.openetworking.service;

import java.util.List;

import org.gujavasc.openetworking.bean.Event;

public interface EventService {

	List<Event> findAllByName(String name);
	
	Event findById(Long id);
	
	void checkin(Long eventId, Long participantId);
}
