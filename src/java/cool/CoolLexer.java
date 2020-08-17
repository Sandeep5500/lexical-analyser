// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, WHITESPACE=43, NULL_STR=44, 
		ESC_NULL_STR=45, UNTERM_STR=46, BSLASH_EOF_STR=47, EOF_STR=48, DASH_COMMENT=49, 
		OPEN_COMMENT=50, EOF_COMMENT=51, STAR_COMMENT=52, INVALD=53, EOF_NEST_COMMENT=54, 
		EOF_ERROR=55, END_COMMENT=56, NEST_COMMENT=57, CHAR_COMMENT=58, EOF_ERROR_2=59, 
		EOF_NEST_COMMENT_2=60, EOF_ERROR_3=61, NEST_COMMENT_2=62, END_COMMENT_2=63, 
		CHAR_COMMENT_2=64;
	public static final int OUTER_COMMENT = 1;
	public static final int INNER_COMMENT = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "OUTER_COMMENT", "INNER_COMMENT"
	};

	public static final String[] ruleNames = {
		"SEMICOLON", "DARROW", "LPAREN", "RPAREN", "COLON", "ATSYM", "COMMA", 
		"PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", 
		"DOT", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", 
		"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "FALSE", "TRUE", "BOOL_CONST", "INT_CONST", "TYPEID", "OBJECTID", 
		"WHITESPACE", "STR_VALID", "NULL_STR", "ESC_NULL_STR", "STR_CONST", "UNTERM_STR", 
		"BSLASH_EOF_STR", "EOF_STR", "DASH_COMMENT", "OPEN_COMMENT", "EOF_COMMENT", 
		"STAR_COMMENT", "INVALD", "EOF_NEST_COMMENT", "EOF_ERROR", "END_COMMENT", 
		"NEST_COMMENT", "CHAR_COMMENT", "EOF_ERROR_2", "EOF_NEST_COMMENT_2", "EOF_ERROR_3", 
		"NEST_COMMENT_2", "END_COMMENT_2", "CHAR_COMMENT_2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "WHITESPACE", "NULL_STR", "ESC_NULL_STR", "UNTERM_STR", "BSLASH_EOF_STR", 
		"EOF_STR", "DASH_COMMENT", "OPEN_COMMENT", "EOF_COMMENT", "STAR_COMMENT", 
		"INVALD", "EOF_NEST_COMMENT", "EOF_ERROR", "END_COMMENT", "NEST_COMMENT", 
		"CHAR_COMMENT", "EOF_ERROR_2", "EOF_NEST_COMMENT_2", "EOF_ERROR_3", "NEST_COMMENT_2", 
		"END_COMMENT_2", "CHAR_COMMENT_2"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}




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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 44:
			NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			ESC_NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			UNTERM_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			BSLASH_EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			OPEN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			EOF_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			INVALD_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			EOF_NEST_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			EOF_ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			EOF_ERROR_2_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			EOF_NEST_COMMENT_2_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			EOF_ERROR_3_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NULL_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("String contains null character");
			break;
		}
	}
	private void ESC_NULL_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("String contains escaped null character");
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			processString();
			break;
		}
	}
	private void UNTERM_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void BSLASH_EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			reportError("backslash at end of file");
			break;
		}
	}
	private void EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("EOF in string constant" );
			break;
		}
	}
	private void OPEN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("Unmatched *)");
			break;
		}
	}
	private void EOF_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			reportError("EOF in comment");
			break;
		}
	}
	private void INVALD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			invalidChar();
			break;
		}
	}
	private void EOF_NEST_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_ERROR_2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			 reportError("EOF in comment");
			break;
		}
	}
	private void EOF_NEST_COMMENT_2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_ERROR_3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			 reportError("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u01c7\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\5("+
		"\u0112\n(\3)\6)\u0115\n)\r)\16)\u0116\3*\3*\7*\u011b\n*\f*\16*\u011e\13"+
		"*\3+\3+\7+\u0122\n+\f+\16+\u0125\13+\3,\6,\u0128\n,\r,\16,\u0129\3,\3"+
		",\3-\3-\3-\7-\u0131\n-\f-\16-\u0134\13-\3.\3.\3.\3.\3.\3.\7.\u013c\n."+
		"\f.\16.\u013f\13.\3.\5.\u0142\n.\3.\3.\3/\3/\3/\3/\3/\3/\3/\7/\u014d\n"+
		"/\f/\16/\u0150\13/\3/\5/\u0153\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\7\64\u0170\n\64\f\64\16\64\u0173\13\64\3\64"+
		"\5\64\u0176\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3C\3C\3C\3C\2\2D\5\r\7\31\t\t\13\n\r\13\17\f\21\16\23\17\25\20\27"+
		"\21\31\22\33\23\35\24\37\25!\26#\27%\30\'\32)\33+\34-\35/\36\61\37\63"+
		" \65!\67\"9#;$=%?&A\'C(E)G*I+K,M\2O\2Q\6S\7U\4W\5Y-[\2]._/a\bc\60e\61"+
		"g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\u0087B"+
		"\5\2\3\4\36\4\2EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4"+
		"\2PPpp\4\2JJjj\4\2TTtt\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFf"+
		"f\4\2WWww\3\2\62;\3\2C\\\6\2\62;C\\aac|\3\2c|\6\2\13\f\16\17\"\"\u2b81"+
		"\u2b81\3\2\2\2\6\2\2\2\f\f$$^^\5\2\f\f$$^^\4\3\f\f$$\3\2\f\f\3\3\f\f\u01cd"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\3u\3\2\2\2"+
		"\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\4}\3\2\2\2\4\177\3\2\2\2\4\u0081\3\2"+
		"\2\2\4\u0083\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2\2\5\u0089\3\2\2\2\7"+
		"\u008b\3\2\2\2\t\u008e\3\2\2\2\13\u0090\3\2\2\2\r\u0092\3\2\2\2\17\u0094"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u0098\3\2\2\2\25\u009a\3\2\2\2\27\u009c\3"+
		"\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2\37\u00a4\3\2"+
		"\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00af"+
		"\3\2\2\2+\u00b2\3\2\2\2-\u00b8\3\2\2\2/\u00bd\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67\u00cf\3\2\2\29\u00d3\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00dd\3\2\2\2?\u00e2\3\2\2\2A\u00e8\3\2\2\2C\u00ed\3\2\2\2E"+
		"\u00f2\3\2\2\2G\u00f5\3\2\2\2I\u00f9\3\2\2\2K\u0100\3\2\2\2M\u0104\3\2"+
		"\2\2O\u010a\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0118\3\2\2\2W\u011f"+
		"\3\2\2\2Y\u0127\3\2\2\2[\u0132\3\2\2\2]\u0135\3\2\2\2_\u0145\3\2\2\2a"+
		"\u0156\3\2\2\2c\u015b\3\2\2\2e\u0160\3\2\2\2g\u0166\3\2\2\2i\u016b\3\2"+
		"\2\2k\u0179\3\2\2\2m\u017e\3\2\2\2o\u0184\3\2\2\2q\u018a\3\2\2\2s\u018d"+
		"\3\2\2\2u\u0193\3\2\2\2w\u0197\3\2\2\2y\u019d\3\2\2\2{\u01a3\3\2\2\2}"+
		"\u01a7\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01b1\3\2\2\2\u0083\u01b7\3\2\2"+
		"\2\u0085\u01bd\3\2\2\2\u0087\u01c3\3\2\2\2\u0089\u008a\7=\2\2\u008a\6"+
		"\3\2\2\2\u008b\u008c\7?\2\2\u008c\u008d\7@\2\2\u008d\b\3\2\2\2\u008e\u008f"+
		"\7*\2\2\u008f\n\3\2\2\2\u0090\u0091\7+\2\2\u0091\f\3\2\2\2\u0092\u0093"+
		"\7<\2\2\u0093\16\3\2\2\2\u0094\u0095\7B\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\7.\2\2\u0097\22\3\2\2\2\u0098\u0099\7-\2\2\u0099\24\3\2\2\2\u009a\u009b"+
		"\7/\2\2\u009b\26\3\2\2\2\u009c\u009d\7,\2\2\u009d\30\3\2\2\2\u009e\u009f"+
		"\7\61\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7\u0080\2\2\u00a1\34\3\2\2\2\u00a2"+
		"\u00a3\7>\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5 \3\2\2\2\u00a6"+
		"\u00a7\7}\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9$\3\2\2\2\u00aa"+
		"\u00ab\7\60\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		"(\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7/\2\2\u00b1*\3\2\2\2\u00b2\u00b3"+
		"\t\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\u00b5\t\4\2\2\u00b5\u00b6\t\5\2\2\u00b6"+
		"\u00b7\t\5\2\2\u00b7,\3\2\2\2\u00b8\u00b9\t\6\2\2\u00b9\u00ba\t\3\2\2"+
		"\u00ba\u00bb\t\5\2\2\u00bb\u00bc\t\6\2\2\u00bc.\3\2\2\2\u00bd\u00be\t"+
		"\7\2\2\u00be\u00bf\t\b\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\t\b\2\2\u00c1"+
		"\u00c2\t\7\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\t\b\2\2\u00c4\u00c5\t\t\2"+
		"\2\u00c5\64\3\2\2\2\u00c6\u00c7\t\b\2\2\u00c7\u00c8\t\t\2\2\u00c8\u00c9"+
		"\t\n\2\2\u00c9\u00ca\t\6\2\2\u00ca\u00cb\t\13\2\2\u00cb\u00cc\t\b\2\2"+
		"\u00cc\u00cd\t\f\2\2\u00cd\u00ce\t\5\2\2\u00ce\66\3\2\2\2\u00cf\u00d0"+
		"\t\3\2\2\u00d0\u00d1\t\6\2\2\u00d1\u00d2\t\f\2\2\u00d28\3\2\2\2\u00d3"+
		"\u00d4\t\3\2\2\u00d4\u00d5\t\r\2\2\u00d5\u00d6\t\r\2\2\u00d6\u00d7\t\16"+
		"\2\2\u00d7:\3\2\2\2\u00d8\u00d9\t\16\2\2\u00d9\u00da\t\r\2\2\u00da\u00db"+
		"\t\r\2\2\u00db\u00dc\t\3\2\2\u00dc<\3\2\2\2\u00dd\u00de\t\f\2\2\u00de"+
		"\u00df\t\n\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e1\t\t\2\2\u00e1>\3\2\2\2"+
		"\u00e2\u00e3\t\17\2\2\u00e3\u00e4\t\n\2\2\u00e4\u00e5\t\b\2\2\u00e5\u00e6"+
		"\t\3\2\2\u00e6\u00e7\t\6\2\2\u00e7@\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9"+
		"\u00ea\t\4\2\2\u00ea\u00eb\t\5\2\2\u00eb\u00ec\t\6\2\2\u00ecB\3\2\2\2"+
		"\u00ed\u00ee\t\6\2\2\u00ee\u00ef\t\5\2\2\u00ef\u00f0\t\4\2\2\u00f0\u00f1"+
		"\t\2\2\2\u00f1D\3\2\2\2\u00f2\u00f3\t\r\2\2\u00f3\u00f4\t\7\2\2\u00f4"+
		"F\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6\u00f7\t\6\2\2\u00f7\u00f8\t\17\2\2"+
		"\u00f8H\3\2\2\2\u00f9\u00fa\t\b\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc\t"+
		"\20\2\2\u00fc\u00fd\t\r\2\2\u00fd\u00fe\t\b\2\2\u00fe\u00ff\t\21\2\2\u00ff"+
		"J\3\2\2\2\u0100\u0101\t\t\2\2\u0101\u0102\t\r\2\2\u0102\u0103\t\f\2\2"+
		"\u0103L\3\2\2\2\u0104\u0105\7h\2\2\u0105\u0106\t\4\2\2\u0106\u0107\t\3"+
		"\2\2\u0107\u0108\t\5\2\2\u0108\u0109\t\6\2\2\u0109N\3\2\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\t\13\2\2\u010c\u010d\t\22\2\2\u010d\u010e\t\6\2\2"+
		"\u010eP\3\2\2\2\u010f\u0112\5M&\2\u0110\u0112\5O\'\2\u0111\u010f\3\2\2"+
		"\2\u0111\u0110\3\2\2\2\u0112R\3\2\2\2\u0113\u0115\t\23\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"T\3\2\2\2\u0118\u011c\t\24\2\2\u0119\u011b\t\25\2\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dV"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\t\26\2\2\u0120\u0122\t\25\2\2"+
		"\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124X\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\t\27\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b,\2\2\u012cZ\3\2\2\2\u012d\u012e"+
		"\7^\2\2\u012e\u0131\n\30\2\2\u012f\u0131\n\31\2\2\u0130\u012d\3\2\2\2"+
		"\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\\\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7$\2\2\u0136"+
		"\u0137\5[-\2\u0137\u013d\7\2\2\2\u0138\u0139\7^\2\2\u0139\u013c\13\2\2"+
		"\2\u013a\u013c\n\32\2\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0142\t\33\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\b.\3\2\u0144^\3\2\2\2\u0145\u0146\7$\2\2\u0146"+
		"\u0147\5[-\2\u0147\u0148\7^\2\2\u0148\u014e\7\2\2\2\u0149\u014a\7^\2\2"+
		"\u014a\u014d\13\2\2\2\u014b\u014d\n\32\2\2\u014c\u0149\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\t\33\2\2\u0152\u0151\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b/\4\2\u0155`\3\2\2\2\u0156\u0157"+
		"\7$\2\2\u0157\u0158\5[-\2\u0158\u0159\7$\2\2\u0159\u015a\b\60\5\2\u015a"+
		"b\3\2\2\2\u015b\u015c\7$\2\2\u015c\u015d\5[-\2\u015d\u015e\7\f\2\2\u015e"+
		"\u015f\b\61\6\2\u015fd\3\2\2\2\u0160\u0161\7$\2\2\u0161\u0162\5[-\2\u0162"+
		"\u0163\7^\2\2\u0163\u0164\7\2\2\3\u0164\u0165\b\62\7\2\u0165f\3\2\2\2"+
		"\u0166\u0167\7$\2\2\u0167\u0168\5[-\2\u0168\u0169\7\2\2\3\u0169\u016a"+
		"\b\63\b\2\u016ah\3\2\2\2\u016b\u016c\7/\2\2\u016c\u016d\7/\2\2\u016d\u0171"+
		"\3\2\2\2\u016e\u0170\n\34\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0176\t\35\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0178\b\64\2\2\u0178j\3\2\2\2\u0179\u017a\7,\2\2\u017a\u017b\7"+
		"+\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b\65\t\2\u017dl\3\2\2\2\u017e\u017f"+
		"\7*\2\2\u017f\u0180\7,\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\2\2\3\u0182"+
		"\u0183\b\66\n\2\u0183n\3\2\2\2\u0184\u0185\7*\2\2\u0185\u0186\7,\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\b\67\13\2\u0188\u0189\b\67\2\2\u0189p\3\2\2"+
		"\2\u018a\u018b\13\2\2\2\u018b\u018c\b8\f\2\u018cr\3\2\2\2\u018d\u018e"+
		"\7*\2\2\u018e\u018f\7,\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\2\2\3\u0191"+
		"\u0192\b9\r\2\u0192t\3\2\2\2\u0193\u0194\13\2\2\2\u0194\u0195\7\2\2\3"+
		"\u0195\u0196\b:\16\2\u0196v\3\2\2\2\u0197\u0198\7,\2\2\u0198\u0199\7+"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\b;\17\2\u019b\u019c\b;\2\2\u019c"+
		"x\3\2\2\2\u019d\u019e\7*\2\2\u019e\u019f\7,\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\b<\20\2\u01a1\u01a2\b<\2\2\u01a2z\3\2\2\2\u01a3\u01a4\13\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a6\b=\2\2\u01a6|\3\2\2\2\u01a7\u01a8\13"+
		"\2\2\2\u01a8\u01a9\7\2\2\3\u01a9\u01aa\b>\21\2\u01aa~\3\2\2\2\u01ab\u01ac"+
		"\7*\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\2\2\3\u01af"+
		"\u01b0\b?\22\2\u01b0\u0080\3\2\2\2\u01b1\u01b2\7,\2\2\u01b2\u01b3\7+\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7\2\2\3\u01b5\u01b6\b@\23\2\u01b6\u0082"+
		"\3\2\2\2\u01b7\u01b8\7*\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\bA\20\2\u01bb\u01bc\bA\2\2\u01bc\u0084\3\2\2\2\u01bd\u01be\7,\2"+
		"\2\u01be\u01bf\7+\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\bB\17\2\u01c1\u01c2"+
		"\bB\2\2\u01c2\u0086\3\2\2\2\u01c3\u01c4\13\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\bC\2\2\u01c6\u0088\3\2\2\2\24\2\3\4\u0111\u0116\u011c\u0123\u0129"+
		"\u0130\u0132\u013b\u013d\u0141\u014c\u014e\u0152\u0171\u0175\24\b\2\2"+
		"\3.\2\3/\3\3\60\4\3\61\5\3\62\6\3\63\7\3\65\b\3\66\t\7\3\2\38\n\39\13"+
		"\3:\f\6\2\2\7\4\2\3>\r\3?\16\3@\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}