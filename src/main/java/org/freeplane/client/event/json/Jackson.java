package org.freeplane.plugin.collaboration.client.event.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class Jackson {
	public static ObjectMapper objectMapper = new ObjectMapper(); 
	static {
		objectMapper.registerModule(new Jdk8Module());
	}

}
