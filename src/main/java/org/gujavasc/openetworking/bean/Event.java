package org.gujavasc.openetworking.bean;

import java.util.Calendar;
import java.util.Date;

public class Event {

	private String name;

	private Integer totalParticipants;

	private Date initialDate;

	private Date finalDate;

	public Event() {
	}

	public Event(String name, Integer totalParticipants) {
		this.name = name;
		this.totalParticipants = totalParticipants;
		this.initialDate = Calendar.getInstance().getTime();
		this.finalDate   = Calendar.getInstance().getTime(); 
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
	
	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

}
