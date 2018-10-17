lexer grammar BusinessRuleLexer;

@header {
package org.joo.virgo.antlr.grammar;
}

import SqlLexerCommon;

SET:					('SET' | 'set') ;
IF: 					('IF' | 'if') ;
THEN: 					('THEN' | 'then') ;
ELIF:					('ELIF' | 'elif') ;
ELSE: 					('ELSE' | 'else') ;

SEMICOLON:				';' ;

WS: 					(' ' | '\t')+ -> channel(HIDDEN) ;
