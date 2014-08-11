package io.nextweb.persistence.connections;

import de.mxro.async.callbacks.SimpleCallback;
import io.nextweb.persistence.connections.callbacks.CommitCallback;
import io.nextweb.persistence.connections.callbacks.GetCallback;
import io.nextweb.persistence.connections.callbacks.PutCallback;

public interface MapConnection {

	public void put(String key, Object value, PutCallback callback);
	
	public void get(String key, GetCallback callback);
	
	public Object getSync(String key);
	
	public void remove(String key, SimpleCallback callback);
	
	public void close(SimpleCallback callback);
	
	public void commit(CommitCallback callback);
	
	public void clearCache();
	
}
