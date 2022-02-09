package no.hvl.dat110.messaging;

public class Message {

	byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		
<<<<<<< HEAD
		this.data = data; 
		
		if (data.length>127 || data == null)
			throw new UnsupportedOperationException(TODO.constructor("Feil data"));
			
=======
		if (data == null) throw new IllegalArgumentException("Data cannot be null.");
		if (data.length > 127) throw new IllegalArgumentException("Data cannot be longer than 127 bytes.");
		
		this.data = data;
		
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
