package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface DeleteCallback extends FailureCallback {

	public void onSuccess();
	
}
