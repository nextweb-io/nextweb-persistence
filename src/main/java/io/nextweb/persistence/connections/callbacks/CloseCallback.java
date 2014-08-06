package io.nextweb.persistence.connections.callbacks;

import de.mxro.async.callbacks.FailureCallback;

public interface CloseCallback extends FailureCallback {

	public void onSuccess();
	
}
