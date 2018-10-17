package org.joo.virgo.node;

import org.joo.virgo.RuleContext;
import org.joo.virgo.model.ExecutionResult;

public class IfExecutionNode implements ExecutionNode {

	private ExpressionExecutionNode condition;
	private ExecutionNode action;

	public IfExecutionNode(ExpressionExecutionNode condition, ExecutionNode action) {
		this.condition = condition;
		this.action = action;
	}

	@Override
	public boolean execute(RuleContext context, ExecutionResult result) {
		boolean conditionSatisfied = condition.execute(context, result);
		if (!conditionSatisfied)
			return false;
		action.execute(context, result);
		return true;
	}
}
