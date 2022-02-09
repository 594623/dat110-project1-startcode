package no.hvl.dat110.messaging;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
		if (data == null) throw new IllegalArgumentException("Data cannot be null.");
		if (data.length > 127) throw new IllegalArgumentException("Data cannot be longer than 127 bytes.");
		
		this.data = data;
		
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
