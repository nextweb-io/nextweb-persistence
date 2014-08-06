package io.nextweb.persistence.connections.callbacks;

import de.mxro.async.callbacks.FailureCallback;

public interface PutCallback extends FailureCallback {

	public void onSuccess();
	
}
