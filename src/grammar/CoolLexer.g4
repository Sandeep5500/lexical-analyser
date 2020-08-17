lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{


	/**
	* Function to report errors.
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}
	public void invalidChar() //Function to pass illegal characters on to reportError()
	{
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		reportError(text);
	}

	public void processString() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		StringBuilder buf = new StringBuilder(0);
		
		if(text.length() > 1026)  // 1024 + 2 because of the extra double quotes
		{    reportError("String constant too long");
			return;
		}
		int i = 1;
		while(i < text.length()-1) //The while loop fills up buf with the string with all escape sequences converted
		{
			if( text.charAt(i) == '\\') //Any special escape sequences are taken care of here.
			{
				switch(text.charAt(i+1)) 
				{
					case 'n':
					buf.append('\n');
					break;
					case 't':
					buf.append('\t');
					break;
					case 'b':
					buf.append('\b');
					break;
					case 'f':
					buf.append('\f');
					break;
					case '\\':
					buf.append('\\');
					break;
					default:
					buf.append(text.charAt(i+1)); //If none of the above match, simply add the next character to the buffer				
				}
				i+=2;
			}
			else //No escape sequence
			{
				buf.append(text.charAt(i));
				i++;
			}
		}
		text = buf.toString();
		setText(text);

	}
}

SEMICOLON   : ';' ;
DARROW      : '=>';
LPAREN      : '(' ;
RPAREN      : ')' ;
COLON       : ':' ;
ATSYM       : '@' ;  
COMMA       : ',' ;
PLUS        : '+' ;
MINUS       : '-' ;
STAR        : '*' ;
SLASH       : '/' ;
TILDE       : '~' ;
LT          : '<' ;
EQUALS      : '=' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
DOT         : '.' ;
LE          : '<=' ;                      
ASSIGN      : '<-' ;                
CLASS       : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s') ;               
ELSE        : ('E'|'e')('L'|'l')('S'|'s')('E'|'e') ;              
FI          : ('F'|'f')('I'|'i') ;            
IF          : ('I'|'i')('F'|'f') ;
IN          : ('I'|'i')('N'|'n') ;            
INHERITS    : ('I'|'i')('N'|'n')('H'|'h')('E'|'e')('R'|'r')('I'|'i')('T'|'t')('S'|'s') ;                  
LET         : ('L'|'l')('E'|'e')('T'|'t');             
LOOP        : ('L'|'l')('O'|'o')('O'|'o')('P'|'p');              
POOL        : ('P'|'p')('O'|'o')('O'|'o')('L'|'l');              
THEN        : ('T'|'t')('H'|'h')('E'|'e')('N'|'n') ;              
WHILE       : ('W'|'w')('H'|'h')('I'|'i')('L'|'l')('E'|'e');               
CASE        : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');              
ESAC        : ('E'|'e')('S'|'s')('A'|'a')('C'|'c');              
OF          : ('O'|'o')('F'|'f');            
NEW         : ('N'|'n')('E'|'e')('W'|'w');             
ISVOID      : ('I'|'i')('S'|'s')('V'|'v')('O'|'o')('I'|'i')('D'|'d');                
NOT         : ('N'|'n')('O'|'o')('T'|'t'); 

fragment FALSE: 'f'('A'|'a')('L'|'l')('S'|'s')('E'|'e');
fragment TRUE:  't'('R'|'r')('U'|'u')('E'|'e');
BOOL_CONST: FALSE | TRUE;
INT_CONST: [0-9]+;
TYPEID: [A-Z][_A-Za-z0-9]*;
OBJECTID: [a-z][_A-Za-z0-9]*;	


WHITESPACE: [\n\f\r\t\u2B7F ]+ -> skip ;

//Strings
fragment STR_VALID : ('\\'~('\u0000')|~('\n'|'\u0000'|'\\'|'"'))*;
					// Gives us every valid string permutation. It ensures that backslashes are only used as escape sequences and not used singularly.
NULL_STR        : '"'STR_VALID'\u0000'('\\'.|~('\n'|'\\'|'"'))*('\n'| EOF |'"') {reportError("String contains null character");};
					//Strings with one or more null characters are matched to this token
ESC_NULL_STR    : '"'STR_VALID'\\''\u0000'('\\'.|~('\n'|'\\'|'"'))*('\n'| EOF |'"') {reportError("String contains escaped null character");};
					//Strings with one or more escaped null characters are matched to this token
STR_CONST       : '"'STR_VALID'"' {processString();}; 		// Valid Strings
UNTERM_STR      : '"'STR_VALID'\n' {reportError("Unterminated string constant");}; 		// If there is an unescaped newline character in the string and none of the above tokens matched, this error is passed
BSLASH_EOF_STR  : '"'STR_VALID '\\' (EOF) {reportError("backslash at end of file");}; 		//Takes care of instances where the string encounters EOF but has its last character as a backslash
EOF_STR			: '"'STR_VALID(EOF) {reportError("EOF in string constant" );}; //End of file encountered by a string
 
//Commments 
DASH_COMMENT    : '--'~('\n')*('\n'|(EOF)) ->skip;
OPEN_COMMENT    : '*)'{reportError("Unmatched *)");};
EOF_COMMENT     : '(*'(EOF){reportError("EOF in comment");}; //Takes care of files ending with (*
STAR_COMMENT    : '(*'-> pushMode(OUTER_COMMENT),skip; // A (* which isn't followed by EOF leads to the OUTER_COMMENT mode.
INVALD          : . {invalidChar();}; //Any character that doesn't match any of the above tokens 

mode OUTER_COMMENT;
EOF_NEST_COMMENT: '(*'(EOF){reportError("EOF in comment");}; // EOF right after start of a nested comment. 
EOF_ERROR		: .(EOF) {reportError("EOF in comment");};  
END_COMMENT		: '*)' -> popMode,skip; 		//End of comment
NEST_COMMENT	: '(*' -> pushMode(INNER_COMMENT),skip; //Proceed to mode for nested comment 
CHAR_COMMENT	: . -> skip ;		//skips anything else

mode INNER_COMMENT;
EOF_ERROR_2		: .(EOF) { reportError("EOF in comment");}; 
EOF_NEST_COMMENT_2: '(*'(EOF){reportError("EOF in comment");}; //EOF right after the start of a multi-nested comment
EOF_ERROR_3		: '*)' (EOF) { reportError("EOF in comment");};
NEST_COMMENT_2	: '(*' -> pushMode(INNER_COMMENT),skip; // Proceed to INNER_COMMENT mode for a multi-nested comment
END_COMMENT_2	: '*)' -> popMode,skip; //End of the the inner comment
CHAR_COMMENT_2	: . ->skip;