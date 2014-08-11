package io.nextweb.persistence.connections;

import de.mxro.async.callbacks.SimpleCallback;
import de.mxro.async.callbacks.ValueCallback;

public interface MapConnection<T> {

	public void put(String key, T value, SimpleCallback callback);
	
	public void get(String key, ValueCallback<T> callback);
	
	public T getSync(String key);
	
	public void remove(String key, SimpleCallback callback);
	
	public void close(SimpleCallback callback);
	
	public void commit(SimpleCallback callback);
	
	public void clearCache();
	
}
