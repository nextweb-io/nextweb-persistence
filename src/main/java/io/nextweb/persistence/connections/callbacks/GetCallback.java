package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface GetCallback extends FailureCallback {

	public void onSuccess(Object value);
	
	public void onDoesNotExist();
	
}
