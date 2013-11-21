package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface RemoveCallback extends FailureCallback {

	public void onSuccess();
	
}
