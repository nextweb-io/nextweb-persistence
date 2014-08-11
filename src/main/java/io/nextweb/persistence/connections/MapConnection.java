package io.nextweb.persistence.connections;

import de.mxro.async.callbacks.SimpleCallback;

public interface MapConnection<T> extends AsyncMap<T> {

	public void close(SimpleCallback callback);

	public void commit(SimpleCallback callback);

	public void clearCache();

	public T getSync(String key);

}
