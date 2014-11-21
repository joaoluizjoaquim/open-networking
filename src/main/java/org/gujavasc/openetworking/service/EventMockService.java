package org.gujavasc.openetworking.service;

import java.util.List;

import javax.enterprise.inject.Alternative;

import org.gujavasc.openetworking.bean.Event;

@Alternative
class EventMockService implements EventService {

	@Override
	public List<Event> findAllByName(String name) {
		return null;
	}

	@Override
	public Event findById(Long id) {
		return null;
	}

	@Override
	public void checkin(Long eventId, Long participantId) {	
	}

}
