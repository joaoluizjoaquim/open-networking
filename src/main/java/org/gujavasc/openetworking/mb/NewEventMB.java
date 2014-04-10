package org.gujavasc.openetworking.mb;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("newEventFlow")
public class NewEventMB {

	private String eventName;
	private Date eventInitialDate;
	private Date eventFinalDate;
	private String eventCity;
	private String eventAddress;
	private String eventCountry;
	
	@PostConstruct
	public void init(){
		System.out.println("teste");
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventInitialDate() {
		return eventInitialDate;
	}
	public void setEventInitialDate(Date eventInitialDate) {
		this.eventInitialDate = eventInitialDate;
	}
	public Date getEventFinalDate() {
		return eventFinalDate;
	}
	public void setEventFinalDate(Date eventFinalDate) {
		this.eventFinalDate = eventFinalDate;
	}
	public String getEventCity() {
		return eventCity;
	}
	public void setEventCity(String eventCity) {
		this.eventCity = eventCity;
	}
	
	public String save(){
		System.out.println("Event name: "+eventName);
		System.out.println("Event initial date: "+eventInitialDate);
		System.out.println("Event final date: "+eventFinalDate);
		System.out.println("Event city: "+eventCity);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Evento salvo com sucesso.",null));
		return "/searchEvents";
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventCountry() {
		return eventCountry;
	}

	public void setEventCountry(String eventCountry) {
		this.eventCountry = eventCountry;
	}
}
