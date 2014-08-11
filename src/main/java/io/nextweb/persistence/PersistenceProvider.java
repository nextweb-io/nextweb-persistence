package io.nextweb.persistence;

import de.mxro.async.map.MapConnection;

public interface PersistenceProvider {

	public MapConnection createMap(String id);
	
	public void removeMap(String id);
	
}
