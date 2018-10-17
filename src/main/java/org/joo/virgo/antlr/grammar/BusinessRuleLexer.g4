lexer grammar BusinessRuleLexer;

@header {
package org.joo.virgo.antlr.grammar;
}

fragment Digit: 		'0'..'9' ;
fragment Alpha: 		'.' | '_' | 'A'..'Z' | 'a'..'z' ;

SET:					('SET' | 'set') ;
IF: 					('IF' | 'if') ;
THEN: 					('THEN' | 'then') ;
ELIF:					('ELIF' | 'elif') ;
ELSE: 					('ELSE' | 'else') ;

EQUALS:					'=' ;
SEMICOLON:				';' ;

VARIABLE:				Alpha+ (Alpha | Digit)* ;
ANY:					'<<' .+? '>>' ;
WS: 					(' ' | '\t')+ -> channel(HIDDEN) ;
