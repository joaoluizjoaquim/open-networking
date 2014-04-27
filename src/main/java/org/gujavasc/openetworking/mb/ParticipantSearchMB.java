package org.gujavasc.openetworking.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Participant;

@Named
@ViewScoped
public class ParticipantSearchMB implements Serializable {
	
	private static final long serialVersionUID = -8329958748594670442L;
	
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
