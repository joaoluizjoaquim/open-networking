package org.gujavasc.openetworking.service;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.gujavasc.openetworking.bean.Event;

@Provider
@Consumes(value = MediaType.APPLICATION_JSON)
public class EventReader implements MessageBodyReader<List<Event>> {

	@Override
	public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2,
			MediaType arg3) {
		return true;
	}

	@Override
	public List<Event> readFrom(Class<List<Event>> arg0, Type arg1,
			Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream arg5)
			throws IOException, WebApplicationException {

		List<Event> events = new ArrayList<>();;
		JsonParser parser = Json.createParser(arg5);
		while (parser.hasNext()) {
//			switch (parser.next()) {
//			case KEY_NAME:
//				String key = parser.getString();
//				parser.next();
//				switch (key) {
//				case "name":
//					mo.setName(parser.getString());
//					break;
//				case "age":
//					mo.setAge(parser.getIntValue());
//					break;
//				default:
//					break;
//				}
//				break;
//			default:
//				break;
//			}
		}
		return events;
	}

}
