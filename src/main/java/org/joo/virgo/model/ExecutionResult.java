package org.joo.virgo.model;

import java.io.Serializable;
import java.util.Map;

import lombok.NonNull;

public interface ExecutionResult extends Serializable {

	public @NonNull Map<String, Object> getResults();
	
	public default Object getValue(String name) {
		if (name == null)
			return null;
		Map<String, Object> results = getResults();
		if (results == null)
			return null;
		return results.get(name);
	}

	public default Object getValue() {
		Map<String, Object> results = getResults();
		if (results == null || results.isEmpty())
			return null;
		return results.entrySet().iterator().next().getValue();
	}
}
