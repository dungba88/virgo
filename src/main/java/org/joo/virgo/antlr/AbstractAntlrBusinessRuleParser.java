package org.joo.virgo.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.joo.virgo.node.ExecutionNode;

public abstract class AbstractAntlrBusinessRuleParser<L extends Lexer, P extends Parser> implements BusinessRuleParser {

	@Override
	public ExecutionNode parse(final String predicate) {
		CharStream stream = CharStreams.fromString(predicate);

		Lexer lexer = createLexer(stream);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		P parser = createParser(tokens);

		return doParse(parser);
	}

	protected abstract L createLexer(CharStream stream);

	protected abstract P createParser(CommonTokenStream tokens);

	protected abstract ExecutionNode doParse(P parser);
}