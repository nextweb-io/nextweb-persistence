package io.nextweb.persistence.connections;

import io.nextweb.persistence.connections.callbacks.GetCallback;
import de.mxro.async.callbacks.SimpleCallback;

public interface MapConnection {

	public void put(String key, Object value, SimpleCallback callback);
	
	public void get(String key, GetCallback callback);
	
	public Object getSync(String key);
	
	public void remove(String key, SimpleCallback callback);
	
	public void close(SimpleCallback callback);
	
	public void commit(SimpleCallback callback);
	
	public void clearCache();
	
}
