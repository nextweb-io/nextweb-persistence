package io.nextweb.persistence;

import io.nextweb.fn.Result;
import io.nextweb.persistence.connections.MapConnection;

public interface PersistenceProvider {

	public Result<MapConnection> createMap(String id);
	
	
	
}
