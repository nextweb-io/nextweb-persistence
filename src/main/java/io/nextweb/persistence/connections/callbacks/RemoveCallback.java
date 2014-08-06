package io.nextweb.persistence.connections.callbacks;

import de.mxro.async.callbacks.FailureCallback;

public interface RemoveCallback extends FailureCallback {

	public void onSuccess();
	
}
