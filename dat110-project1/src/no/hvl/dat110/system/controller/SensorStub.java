package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class SensorStub extends RPCLocalStub {

	private byte RPCIDREAD = 1;
	
	public SensorStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public int read() {
		
		int temp = 0;
		
		// TODO - START
		// implement marshalling, call and unmarshalling for read RPC method
		
		byte [] send = RPCUtils.marshallInteger(temp);
		
		byte [] receive = rpcclient.call(RPCIDREAD, send);
		
		temp = RPCUtils.unmarshallInteger(receive);
		
		// TODO - END
		
		return temp;
	}
	
}
