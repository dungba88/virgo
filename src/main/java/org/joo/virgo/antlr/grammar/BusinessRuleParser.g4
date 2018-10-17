parser grammar BusinessRuleParser;

@header {
package org.joo.virgo.antlr.grammar;
}

options {
	tokenVocab = BusinessRuleLexer;
}

import SqlParserCommon;

businessRule
:
	phrase
	| actions
;

phrase
:
	IF condition = term THEN impositions = actions # ifCtx
	| left = phrase ELSE right = phrase # elseCtx
	| left = phrase ELSE impositions = actions # elseCtx
;

actions
:
	SET variable = VARIABLE EQUALS value = expression # assignCtx
	| left = actions SEMICOLON right = actions # multiActionsCtx
	| left = actions SEMICOLON # multiActionsCtx
	| nested = phrase # nestedPhraseCtx
	| LBRACE nested = actions RBRACE # nestedActionCtx
;