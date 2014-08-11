package io.nextweb.persistence.connections;

public interface SyncMap<T> {

	public T getSync(String key);

	public void putSync(String key, T value);

	public void removeSync(String key, T value);

}
