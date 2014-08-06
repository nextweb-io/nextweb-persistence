package io.nextweb.persistence.connections.callbacks;

import de.mxro.async.callbacks.FailureCallback;

public interface GetCallback extends FailureCallback {

	public void onSuccess(Object value);
	
	public void onDoesNotExist();
	
}
