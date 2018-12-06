package org.joo.virgo.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.joo.virgo.antlr.grammar.BusinessRuleParser;
import org.joo.virgo.antlr.grammar.BusinessRuleParserBaseVisitor;
import org.joo.virgo.node.ExecutionNode;
import org.joo.virgo.node.ExpressionExecutionNode;

public abstract class AbstractAntlrBusinessRuleVisitor extends BusinessRuleParserBaseVisitor<ExecutionNode> {

    @Override
    public ExecutionNode visitConditionalExpr(final BusinessRuleParser.ConditionalExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitFunctionExpr(final BusinessRuleParser.FunctionExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitWrapListExpr(final BusinessRuleParser.WrapListExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitListFactorExpr(final BusinessRuleParser.ListFactorExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitListCommaExpr(final BusinessRuleParser.ListCommaExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitParenExpr(final BusinessRuleParser.ParenExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitNotExpr(final BusinessRuleParser.NotExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitOrExpr(final BusinessRuleParser.OrExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitAndExpr(final BusinessRuleParser.AndExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitCompareExpr(final BusinessRuleParser.CompareExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitEqualExpr(final BusinessRuleParser.EqualExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitNotEqualExpr(final BusinessRuleParser.NotEqualExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitInExpr(BusinessRuleParser.InExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitContainsExpr(final BusinessRuleParser.ContainsExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitMatchesExpr(final BusinessRuleParser.MatchesExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitStringExpr(final BusinessRuleParser.StringExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitVariableExpr(final BusinessRuleParser.VariableExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitNullExpr(final BusinessRuleParser.NullExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitEmptyExpr(final BusinessRuleParser.EmptyExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitNumberExpr(final BusinessRuleParser.NumberExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitBooleanExpr(final BusinessRuleParser.BooleanExprContext ctx) {
        return createExpressionNode(ctx);
    }

    @Override
    public ExecutionNode visitMathExpr(final BusinessRuleParser.MathExprContext ctx) {
        return createExpressionNode(ctx);
    }

    protected ExecutionNode createExpressionNode(ParserRuleContext ctx) {
        CharStream cs = ctx.start.getTokenSource().getInputStream();
        int stopIndex = ctx.stop != null ? ctx.stop.getStopIndex() : -1;

        return new ExpressionExecutionNode(cs.getText(new Interval(ctx.start.getStartIndex(), stopIndex)));
    }
}
