package org.gujavasc.openetworking.bean;

import java.util.ArrayList;
import java.util.List;

public class Participant {

	private String name;
	private String email;
	
	private List<String> listSkills;

	public Participant() {
	}
	
	public Participant(String name){
		this.name = name;
		this.listSkills = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getListSkills() {
		return listSkills;
	}

	public void setListSkills(List<String> listSkills) {
		this.listSkills = listSkills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
