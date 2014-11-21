package org.gujavasc.openetworking.mb;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Participant;

@Named
@RequestScoped
public class SearchParticipantMB{
	
	private String eventName;
	private List<Participant> participantsList;
	
	public void findParticipantsByEventName(){
		participantsList = Arrays.asList(new Participant("Participant 1"),new Participant("Participant 2"));
	}
	
	//TODO:
	public Boolean foundSomeParticipant(){
		return participantsList != null && !participantsList.isEmpty();
	}
	
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public List<Participant> getParticipantsList() {
		return participantsList;
	}


	public void setParticipantsList(List<Participant> participantsList) {
		this.participantsList = participantsList;
	}

	
	
}
