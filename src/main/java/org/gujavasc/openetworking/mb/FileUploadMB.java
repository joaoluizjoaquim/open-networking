package org.gujavasc.openetworking.mb;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@ViewScoped
public class FileUploadMB {

	private Part arquivo;

	public Part getArquivo() {
		return arquivo;
	}

	public void setArquivo(Part arquivo) {
		this.arquivo = arquivo;
	}
	
}
