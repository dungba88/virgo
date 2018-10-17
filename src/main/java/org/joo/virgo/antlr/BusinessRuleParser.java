package org.joo.virgo.antlr;

import org.joo.libra.support.exceptions.MalformedSyntaxException;
import org.joo.virgo.node.ExecutionNode;

public interface BusinessRuleParser {

	public ExecutionNode parse(String predicate) throws MalformedSyntaxException;
}
