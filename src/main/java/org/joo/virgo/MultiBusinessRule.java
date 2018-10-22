package org.joo.virgo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.joo.virgo.model.DefaultExecutionResult;
import org.joo.virgo.model.ExecutionResult;

import lombok.NonNull;

public class MultiBusinessRule implements BusinessRule {

	private BusinessRule[] rules;

	public MultiBusinessRule(final @NonNull BusinessRule... rules) {
		this.rules = rules;
	}

	@Override
	public Optional<ExecutionResult> execute(RuleContext context) {
		Map<String, Object> tmpResult = new HashMap<>();
		for (BusinessRule rule : rules) {
			ExecutionResult result = rule.execute(context).orElse(null);
			if (result != null)
				tmpResult.putAll(result.getResults());
		}
		return Optional.of(new DefaultExecutionResult(Collections.unmodifiableMap(tmpResult)));
	}
}
