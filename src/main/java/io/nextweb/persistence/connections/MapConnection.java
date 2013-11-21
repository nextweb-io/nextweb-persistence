package io.nextweb.persistence.connections;

import io.nextweb.persistence.connections.callbacks.CloseCallback;
import io.nextweb.persistence.connections.callbacks.CommitCallback;
import io.nextweb.persistence.connections.callbacks.RemoveCallback;
import io.nextweb.persistence.connections.callbacks.GetCallback;
import io.nextweb.persistence.connections.callbacks.PutCallback;

public interface MapConnection {

	public void put(String key, Object value, PutCallback callback);
	
	public void get(String key, GetCallback callback);
	
	public Object getSync(String key);
	
	public void remove(String key, RemoveCallback callback);
	
	public void close(CloseCallback callback);
	
	public void commit(CommitCallback callback);
	
	public void clearCache();
	
}
