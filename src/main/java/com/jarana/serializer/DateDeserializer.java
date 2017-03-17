//package com.jarana.serializer;
//
//import java.io.IOException;
//import java.util.Date;
//
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//
//public class DateDeserializer extends StdDeserializer<Date> {
//	
//	public DateDeserializer() {
//		super(Date.class);
//	}
//
//	@Override
//	public Date deserialize(JsonParser paramJsonParser, DeserializationContext paramDeserializationContext)
//			throws IOException, JsonProcessingException {
//		return paramDeserializationContext.parseDate(paramJsonParser.getValueAsString());
//		
//	}
//	
//
//}
