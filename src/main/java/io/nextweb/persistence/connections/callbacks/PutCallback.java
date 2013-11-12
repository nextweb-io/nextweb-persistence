package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface PutCallback extends FailureCallback {

	public void onSuccess();
	
}
