package org.gujavasc.openetworking.bean;

public class Event {

	private Long id;	
	private String name;
		
	private Long totalParticipants;

	public Event() {}
	
	public Event(Long id, String name){
		this.setId(id);
		this.setName(name);
		this.setTotalParticipants(Math.round(Math.random() * 1000));
	}
	
	public Event(Long id, String name,Long totalParticipants){
		this.setId(id);
		this.setName(name);
		this.setTotalParticipants(totalParticipants);
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalParticipants(Long totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

}
