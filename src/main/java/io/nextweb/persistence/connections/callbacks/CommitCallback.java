package io.nextweb.persistence.connections.callbacks;

import de.mxro.async.callbacks.FailureCallback;

public interface CommitCallback extends FailureCallback {

	public void onSuccess();
	
}
