package org.gujavasc.openetworking.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Classe criada para converter classe java.util.Date da tag input[type="date""].
 * */
@FacesConverter(value="org.gujavasc.openetworking.converter.DateTimeConverter")
public class DateTimeConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

}
