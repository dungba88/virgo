package org.joo.virgo.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.joo.libra.support.exceptions.MalformedSyntaxException;
import org.joo.virgo.antlr.grammar.BusinessRuleLexer;
import org.joo.virgo.antlr.grammar.BusinessRuleParser;
import org.joo.virgo.node.ExecutionNode;

public class AntlrBusinessRuleParser extends AbstractAntlrBusinessRuleParser<BusinessRuleLexer, BusinessRuleParser> {

	protected BusinessRuleLexer createLexer(final CharStream stream) {
		BusinessRuleLexer lexer = new BusinessRuleLexer(stream);
		lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
		lexer.addErrorListener(new BusinessRuleErrorListener());
		return lexer;
	}

	protected BusinessRuleParser createParser(final CommonTokenStream tokens) {
		BusinessRuleParser parser = new BusinessRuleParser(tokens);
		parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
		parser.addErrorListener(new BusinessRuleErrorListener());
		return parser;
	}

	protected ExecutionNode doParse(final BusinessRuleParser parser) {
		AntlrBusinessRuleVisitor visitor = new AntlrBusinessRuleVisitor();
		return visitor.visit(parser.businessRule());
	}
}

class BusinessRuleErrorListener extends BaseErrorListener {

	@Override
	public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
			final int charPositionInLine, final String msg, final RecognitionException e) {
		throw new MalformedSyntaxException(msg);
	}
}