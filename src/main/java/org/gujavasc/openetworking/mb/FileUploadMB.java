package org.gujavasc.openetworking.mb;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@ViewScoped
public class FileUploadMB {

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
