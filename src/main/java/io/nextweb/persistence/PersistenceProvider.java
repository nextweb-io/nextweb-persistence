package io.nextweb.persistence;

import io.nextweb.persistence.connections.MapConnection;

public interface PersistenceProvider {

	public MapConnection createMap(String id);
	
	
	
}
