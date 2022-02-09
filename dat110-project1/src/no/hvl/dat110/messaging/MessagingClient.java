package no.hvl.dat110.messaging;


import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;

import no.hvl.dat110.TODO;

public class MessagingClient {
	
	private String server;
	private int port;
	
	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}
	
	// connect to messaging server
<<<<<<< HEAD
	public Connection connect () {
			
		Socket clientSocket = null;
=======
	public Connection connect() {
		
		Socket clientSocket;
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		Connection connection = null;
		
		// TODO - START
		// create TCP socket for client and connection
		
		try {
			clientSocket = new Socket(server, port);
			connection = new Connection(clientSocket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
<<<<<<< HEAD
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*try {
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//if (true)
			//throw new UnsupportedOperationException(TODO.method());
=======
		} catch (IOException e) {
			e.printStackTrace();
		}
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		
		// TODO - END
		return connection;
	}
}
