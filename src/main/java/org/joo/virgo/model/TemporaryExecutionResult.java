package org.joo.virgo.model;

import java.util.HashMap;
import java.util.Map;

public class TemporaryExecutionResult implements ExecutionResult {
	
	private static final long serialVersionUID = -5838012323794261778L;

	private Map<String, Object> results = new HashMap<>();

	@Override
	public Map<String, Object> getResults() {
		return results;
	}
}
