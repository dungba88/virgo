package org.joo.virgo;

import java.util.Optional;

import org.joo.virgo.model.ExecutionResult;

public interface BusinessRule {

	public Optional<ExecutionResult> execute(RuleContext context);
}
