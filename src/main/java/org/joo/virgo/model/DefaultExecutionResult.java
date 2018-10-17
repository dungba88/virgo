package org.joo.virgo.model;

import java.util.Map;

public class DefaultExecutionResult implements ExecutionResult {
	
	private static final long serialVersionUID = -6136404921288441513L;
	
	private Map<String, Object> results;

	public DefaultExecutionResult(final Map<String, Object> results) {
		this.results = results;
	}

	@Override
	public Map<String, Object> getResults() {
		return results;
	}
}
