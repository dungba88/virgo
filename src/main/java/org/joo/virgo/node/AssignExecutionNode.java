package org.joo.virgo.node;

import org.joo.virgo.RuleContext;
import org.joo.virgo.model.ExecutionResult;

public class AssignExecutionNode implements ExecutionNode {

	private String variableName;
	private ExpressionExecutionNode expression;

	public AssignExecutionNode(String variableName, ExpressionExecutionNode expression) {
		this.variableName = variableName;
		this.expression = expression;
	}

	@Override
	public boolean execute(RuleContext context, ExecutionResult result) {
		Object literalValue = expression.getPredicate().calculateLiteralValue(context);
		result.getResults().put(variableName, literalValue);
		return true;
	}
}
