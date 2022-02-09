package no.hvl.dat110.messaging;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
		this.data = data;
		
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
