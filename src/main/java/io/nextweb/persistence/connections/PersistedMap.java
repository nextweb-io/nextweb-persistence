package io.nextweb.persistence.connections;

import de.mxro.async.callbacks.SimpleCallback;

public interface PersistedMap {

	public void init(SimpleCallback callback);
	
	public void close(SimpleCallback callback);

	public void commit(SimpleCallback callback);

	public void clearCache();
	
}
