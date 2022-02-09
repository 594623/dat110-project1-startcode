package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
		this.data = data; 
		
		if (data.length>127 || data == null)
			throw new UnsupportedOperationException(TODO.constructor("Feil data"));
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
