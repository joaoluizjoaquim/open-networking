package org.gujavasc.openetworking.flow;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class NewEventFlow implements Serializable{

	private static final long serialVersionUID = 2600307917894908515L;
	
	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
		String flowId = "newEventFlow";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId, "/"+flowId+"/"+flowId+".xhtml").markAsStartNode();
		flowBuilder.viewNode(flowId+"Location", "/"+flowId+"/"+flowId+"Location.xhtml");
		flowBuilder.viewNode(flowId+"-return", "/"+flowId+"-return");
		flowBuilder.returnNode(flowId+"-return");
		return flowBuilder.getFlow();
	}
	
}
