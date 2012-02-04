package br.com.insula.opes.json.serializer;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.ser.std.SerializerBase;

import br.com.insula.opes.InscricaoEstadual;

public class InscricaoEstadualJsonSerializer extends SerializerBase<InscricaoEstadual> {

	public InscricaoEstadualJsonSerializer() {
		super(InscricaoEstadual.class);
	}

	@Override
	public void serialize(InscricaoEstadual value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		jgen.writeString(value.toString());
	}

}