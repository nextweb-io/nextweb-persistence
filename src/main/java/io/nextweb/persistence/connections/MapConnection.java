package io.nextweb.persistence.connections;

import io.nextweb.persistence.connections.callbacks.DeleteCallback;
import io.nextweb.persistence.connections.callbacks.GetCallback;
import io.nextweb.persistence.connections.callbacks.PutCallback;

public interface MapConnection {

	public void put(String key, Object value, PutCallback callback);
	
	public void get(String key, GetCallback callback);
	
	public void delete(String key, DeleteCallback callback);
	
}
