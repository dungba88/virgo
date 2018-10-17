package org.joo.virgo.node;

import org.joo.libra.sql.SqlPredicate;
import org.joo.virgo.RuleContext;
import org.joo.virgo.model.ExecutionResult;

import lombok.Getter;

public class ExpressionExecutionNode implements ExecutionNode {

	@Getter
	private SqlPredicate predicate;

	public ExpressionExecutionNode(String predicate) {
		this.predicate = new SqlPredicate(predicate);
		this.predicate.checkForErrorAndThrow();
	}

	@Override
	public boolean execute(RuleContext context, ExecutionResult result) {
		return predicate.satisfiedBy(context);
	}
}
