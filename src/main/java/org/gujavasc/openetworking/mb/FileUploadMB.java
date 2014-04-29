package org.gujavasc.openetworking.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@ViewScoped
public class FileUploadMB implements Serializable{

	private static final long serialVersionUID = 1321262621433913266L;

	private Part file;
	
	public void saveFile(){
		System.out.println(file.getSubmittedFileName());
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
}
