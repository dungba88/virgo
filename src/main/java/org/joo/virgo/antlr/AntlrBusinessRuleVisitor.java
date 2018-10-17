package org.joo.virgo.antlr;

import org.joo.virgo.antlr.grammar.BusinessRuleParser;
import org.joo.virgo.antlr.grammar.BusinessRuleParserBaseVisitor;
import org.joo.virgo.node.AssignExecutionNode;
import org.joo.virgo.node.ElseExecutionNode;
import org.joo.virgo.node.ExecutionNode;
import org.joo.virgo.node.ExpressionExecutionNode;
import org.joo.virgo.node.IfExecutionNode;
import org.joo.virgo.node.MultiActionsExecutionNode;

public class AntlrBusinessRuleVisitor extends BusinessRuleParserBaseVisitor<ExecutionNode> {
	
	@Override
	public ExecutionNode visitMultiActionsCtx(BusinessRuleParser.MultiActionsCtxContext ctx) {
		ExecutionNode left = (ExecutionNode) visit(ctx.left);
		ExecutionNode right = null;
		if (ctx.right == null)
			return left;
		right = (ExecutionNode) visit(ctx.right);
		return new MultiActionsExecutionNode(left, right);
	}

	@Override
	public ExecutionNode visitExpression(BusinessRuleParser.ExpressionContext ctx) {
		String expression = ctx.getText();
		return new ExpressionExecutionNode(expression.substring(2, expression.length() - 2));
	}

	@Override
	public ExecutionNode visitIfCtx(BusinessRuleParser.IfCtxContext ctx) {
		ExpressionExecutionNode condition = (ExpressionExecutionNode) visit(ctx.condition);
		ExecutionNode action = (ExecutionNode) visit(ctx.impositions);
		return new IfExecutionNode(condition, action);
	}

	@Override
	public ExecutionNode visitElseCtx(BusinessRuleParser.ElseCtxContext ctx) {
		ExecutionNode leftPhrase = visit(ctx.left);
		ExecutionNode rightPhrase = visit(ctx.right != null ? ctx.right : ctx.impositions);
		return new ElseExecutionNode(leftPhrase, rightPhrase);
	}
	
	@Override
	public ExecutionNode visitAssignCtx(BusinessRuleParser.AssignCtxContext ctx) {
		String variableName = ctx.variable.getText();
		ExpressionExecutionNode expression = (ExpressionExecutionNode) visit(ctx.value);
		AssignExecutionNode node = new AssignExecutionNode(variableName, expression);
		return node;
	}
}
