package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {

	public static byte[] encapsulate(byte rpcid, byte[] payload) {

		byte[] rpcmsg = new byte[payload.length + 1];

		// TODO - START

		// Encapsulate the rpcid and payload in a byte array according to the RPC
		// message syntax

		rpcmsg[0] = rpcid;

		for (int i = 1; i < payload.length + 1; i++) {
			rpcmsg[i] = payload[i - 1];
		}

		// if (true)
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return rpcmsg;
	}

	public static byte[] decapsulate(byte[] rpcmsg) {

		byte[] payload = new byte[rpcmsg.length-1];
		byte rpcid = rpcmsg[0];

		// TODO - START

		// Decapsulate the rpcid and payload in a byte array according to the RPC
		// message syntax
		for (int i = 1; i < rpcmsg.length; i++) {
			payload[i - 1] = rpcmsg[i];
		}

		// if (true)
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return payload;

	}

	public static byte[] marshallString(String str) {

		byte[] encoded = null;

		encoded = str.getBytes();
		
		

		//if (true)
			//throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;
	}

	public static String unmarshallString(byte[] data) {

		String decoded = new String(data);

		return decoded;
	}

	public static byte[] marshallVoid() {

		byte[] encoded = null;

		encoded = new byte[0];

		return encoded;

	}

	public static void unmarshallVoid(byte[] data) {

		return;

	}

	public static byte[] marshallBoolean(boolean b) {

		byte[] encoded = new byte[1];

		if (b) {
			encoded[0] = 1;
		} else {
			encoded[0] = 0;
		}

		return encoded;
	}

	public static boolean unmarshallBoolean(byte[] data) {

		return (data[0] > 0);

	}

	public static byte[] marshallInteger(int x) {

		byte[] encoded = null;

		// TODO - START
		ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
		buffer.putInt(x);
		buffer.rewind();
		encoded = buffer.array();

		// TODO - END

		return encoded;
	}

	public static int unmarshallInteger(byte[] data) {

		int decoded = 0;

		// TODO - START
		
		ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
		buffer.put(data);
		buffer.rewind();
		decoded = buffer.getInt();

		// TODO - END

		return decoded;

	}

	public static void main(String[] args) {
		byte[] rpcrequest = { 0, 1, 2 };

		byte[] payload = RPCUtils.decapsulate(rpcrequest);
		for (int i = 0; i < 10; i++)
			System.out.println(payload[i]);
	}
}