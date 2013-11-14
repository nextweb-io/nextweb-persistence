package io.nextweb.persistence.connections.callbacks;

import io.nextweb.fn.callbacks.FailureCallback;

public interface CommitCallback extends FailureCallback {

	public void onSuccess();
	
}
