package org.joo.virgo.node;

import org.joo.virgo.RuleContext;
import org.joo.virgo.model.ExecutionResult;

public class MultiActionsExecutionNode implements ExecutionNode {

	private ExecutionNode left;
	
	private ExecutionNode right;

	public MultiActionsExecutionNode(ExecutionNode left, ExecutionNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean execute(RuleContext context, ExecutionResult result) {
		left.execute(context, result);
		right.execute(context, result);
		return true;
	}

}
