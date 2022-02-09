package no.hvl.dat110.messaging;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static final int MESSAGINGPORT = 8080;
	public static final String MESSAGINGHOST = "localhost";
	
	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
<<<<<<< HEAD
		byte[] data = new byte[SEGMENTSIZE+1];
=======
		byte[] data;
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		
		// TODO - START
			
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		data = message.getData();
		
<<<<<<< HEAD
		segment[0]=(byte)data.length;
		
		for (int i = 1; i<data.length + 1; i++) {
			segment[i]=data[ i - 1];
		}
		
		
		//if (true)
			//throw new UnsupportedOperationException(TODO.method());
			
=======
		segment[0] = (byte) data.length;
		
		for (int i = 1; i < data.length + 1; i++) {
			segment[i] = data[i - 1];
		}
		
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		// TODO - END
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {
<<<<<<< HEAD

		//Message message = null;
		byte[] data = new byte[segment[0]];
=======
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		
		// TODO - START
		// decapsulate segment and put received data into a message
		
<<<<<<< HEAD
		
		for (int i = 0; i<segment[0]; i++) {
			data[i] = segment[i + 1];
		}
		Message message = new Message(data);
		
		//if (true)
			//throw new UnsupportedOperationException(TODO.method());
=======
		byte[] data = new byte[segment[0]];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = segment[i + 1];
		}
		
		Message message = new Message(data);
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		
		// TODO - END
		
		return message;
		
	}
	
}
