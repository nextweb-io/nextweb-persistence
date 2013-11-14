package io.nextweb.persistence.connections;

import io.nextweb.persistence.connections.callbacks.CloseCallback;
import io.nextweb.persistence.connections.callbacks.CommitCallback;
import io.nextweb.persistence.connections.callbacks.DeleteCallback;
import io.nextweb.persistence.connections.callbacks.GetCallback;
import io.nextweb.persistence.connections.callbacks.PutCallback;

public interface MapConnection {

	public void put(String key, Object value, PutCallback callback);
	
	public Object get(String key, GetCallback callback);
	
	public void delete(String key, DeleteCallback callback);
	
	public void close(CloseCallback callback);
	
	public void commit(CommitCallback callback);
	
	public void clearCache();
	
}
