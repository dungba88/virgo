// Generated from BusinessRuleParser.g4 by ANTLR 4.7.1

package org.joo.virgo.antlr.grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BusinessRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BusinessRuleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BusinessRuleParser#businessRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBusinessRule(BusinessRuleParser.BusinessRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseCtx}
	 * labeled alternative in {@link BusinessRuleParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCtx(BusinessRuleParser.ElseCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCtx}
	 * labeled alternative in {@link BusinessRuleParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCtx(BusinessRuleParser.IfCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignCtx}
	 * labeled alternative in {@link BusinessRuleParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCtx(BusinessRuleParser.AssignCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedActionCtx}
	 * labeled alternative in {@link BusinessRuleParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedActionCtx(BusinessRuleParser.NestedActionCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedPhraseCtx}
	 * labeled alternative in {@link BusinessRuleParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedPhraseCtx(BusinessRuleParser.NestedPhraseCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiActionsCtx}
	 * labeled alternative in {@link BusinessRuleParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiActionsCtx(BusinessRuleParser.MultiActionsCtxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionExpr}
	 * labeled alternative in {@link BusinessRuleParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpr(BusinessRuleParser.ExpressionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(BusinessRuleParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(BusinessRuleParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listMatchingExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListMatchingExpr(BusinessRuleParser.ListMatchingExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(BusinessRuleParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(BusinessRuleParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link BusinessRuleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(BusinessRuleParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(BusinessRuleParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(BusinessRuleParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(BusinessRuleParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExpr(BusinessRuleParser.EmptyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsExpr(BusinessRuleParser.ContainsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchesExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchesExpr(BusinessRuleParser.MatchesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(BusinessRuleParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpr}
	 * labeled alternative in {@link BusinessRuleParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(BusinessRuleParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(BusinessRuleParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(BusinessRuleParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(BusinessRuleParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(BusinessRuleParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrapListExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapListExpr(BusinessRuleParser.WrapListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(BusinessRuleParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(BusinessRuleParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BusinessRuleParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link BusinessRuleParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(BusinessRuleParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listFactorExpr}
	 * labeled alternative in {@link BusinessRuleParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFactorExpr(BusinessRuleParser.ListFactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listCommaExpr}
	 * labeled alternative in {@link BusinessRuleParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCommaExpr(BusinessRuleParser.ListCommaExprContext ctx);
}