package org.gujavasc.openetworking.bean;


public class Event {

	private Long id;	
	private String name;
	private Long totalParticipants;

	public Event() {}
	
	public Event(Long id, String name){
		this.id = id;
		this.name = name;
		this.totalParticipants = Math.round(Math.random() * 1000);
	}

	public Long getTotalParticipants() {
		return totalParticipants;
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

}
