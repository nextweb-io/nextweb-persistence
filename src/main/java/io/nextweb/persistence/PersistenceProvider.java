package io.nextweb.persistence;

import de.mxro.async.map.AsyncMap;

public interface PersistenceProvider {

	public AsyncMap<String, Object> createMap(String id);

	public void removeMap(String id);

}
