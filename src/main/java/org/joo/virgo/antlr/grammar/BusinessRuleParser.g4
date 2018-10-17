parser grammar BusinessRuleParser;

@header {
package org.joo.virgo.antlr.grammar;
}

options {
	tokenVocab = BusinessRuleLexer;
}

businessRule
:
	phrase
	| actions
;

phrase
:
	IF condition = expression THEN impositions = actions # ifCtx
	| left = phrase ELSE right = phrase # elseCtx
	| left = phrase ELSE impositions = actions # elseCtx
;

actions
:
	SET variable = VARIABLE EQUALS value = expression # assignCtx
	| left = actions SEMICOLON right = actions # multiActionsCtx
	| left = actions SEMICOLON # multiActionsCtx
;

expression
:
	ANY
;