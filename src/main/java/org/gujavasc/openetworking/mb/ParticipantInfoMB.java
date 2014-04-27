package org.gujavasc.openetworking.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.gujavasc.openetworking.bean.Participant;

@Named
@RequestScoped
public class ParticipantInfoMB{

	private Participant selectedParticipant;
	
	public void searchSelectedParticipantByName(String name){
		selectedParticipant = new Participant(name);
	}

	public Participant getSelectedParticipant() {
		return selectedParticipant;
	}

	public void setSelectedParticipant(Participant selectedParticipant) {
		this.selectedParticipant = selectedParticipant;
	}
	
}
