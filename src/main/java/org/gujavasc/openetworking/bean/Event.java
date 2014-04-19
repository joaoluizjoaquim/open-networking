package org.gujavasc.openetworking.bean;

public class Event {

	private String name;
	
	private Integer totalParticipants;
	
	public Event() {
	}
	
	public Event(String name, Integer totalParticipants) {
		this.name = name;
		this.totalParticipants = totalParticipants;
	}

	public Integer getTotalParticipants() {
		return totalParticipants;
	}

	public void setTotalParticipants(Integer totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
