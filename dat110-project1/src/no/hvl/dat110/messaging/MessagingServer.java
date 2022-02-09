package no.hvl.dat110.messaging;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import no.hvl.dat110.TODO;

public class MessagingServer {

	private ServerSocket welcomeSocket;

	public MessagingServer(int port) {

		try {

			this.welcomeSocket = new ServerSocket(port);

		} catch (IOException ex) {

			System.out.println("Messaging server: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	// accept an incoming connection from a client
	public Connection accept() {

		Connection connection = null;
		Socket socket = null;

		// TODO - START
		// accept TCP connection on welcome socket and create connection
		
		try {
			socket = welcomeSocket.accept();
			connection = new Connection(socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

<<<<<<< HEAD
		//if (true)
			//throw new UnsupportedOperationException(TODO.method());
=======
		try {
			Socket socket = welcomeSocket.accept();
			connection = new Connection(socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
>>>>>>> branch 'master' of https://github.com/594623/dat110-project1-startcode.git
		
		// TODO - END
		
		return connection;

	}

	public void stop() {

		if (welcomeSocket != null) {

			try {
				welcomeSocket.close();
			} catch (IOException ex) {

				System.out.println("Messaging server: " + ex.getMessage());
				ex.printStackTrace();
			}
		}
	}

}
