package io.nextweb.persistence.connections;

import de.mxro.async.callbacks.SimpleCallback;
import de.mxro.async.map.AsyncMap;
import de.mxro.async.map.PersistedMap;
import de.mxro.async.map.SyncMap;

public interface MapConnection<T> extends AsyncMap<T>, SyncMap<T>, PersistedMap {

	

	

}
