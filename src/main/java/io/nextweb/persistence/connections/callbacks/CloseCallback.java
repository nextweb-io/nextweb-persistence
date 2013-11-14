package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface CloseCallback extends FailureCallback {

	public void onSuccess();
	
}
