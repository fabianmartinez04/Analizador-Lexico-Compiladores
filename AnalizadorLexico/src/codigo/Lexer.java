/* The following code was generated by JFlex 1.4.3 on 4/16/21, 10:12 PM */

package codigo;
import static codigo.TipoToken.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/16/21, 10:12 PM from the specification file
 * <tt>D:/Desktop/CI/Proyectos/Etapa 1/Analizador-Lexico-Compiladores/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\5\2\0\1\5\22\0\1\5\1\44\3\0\1\44"+
    "\1\45\1\0\1\37\1\37\1\44\1\40\1\5\1\36\1\37\1\6"+
    "\1\2\1\2\6\2\2\2\1\37\1\37\1\43\1\41\1\42\1\37"+
    "\1\0\6\1\24\1\1\37\1\0\1\37\1\44\1\1\1\0\1\7"+
    "\1\13\1\17\1\24\1\15\1\25\1\30\1\21\1\23\1\1\1\16"+
    "\1\26\1\27\1\22\1\12\1\34\1\1\1\14\1\20\1\11\1\10"+
    "\1\35\1\32\1\3\1\33\1\31\1\37\1\4\1\37\1\37\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\17\2"+
    "\7\4\1\5\17\2\2\6\65\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a"+
    "\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\46"+
    "\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\46\0\u0428\0\u044e"+
    "\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558\0\u057e"+
    "\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\114\0\u0662\0\u0688"+
    "\0\u06ae\0\u06d4\0\u06fa\0\u0720\0\u0746\0\u076c\0\u0792\0\u07b8"+
    "\0\u07de\0\u0804\0\u082a\0\u0850\0\u0876\0\u089c\0\u08c2\0\u08e8"+
    "\0\u090e\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18"+
    "\0\u0a3e\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc\0\u0b22\0\u0b48"+
    "\0\u0b6e\0\u0b94\0\u0bba\0\u0be0\0\u0c06\0\u0c2c\0\u0c52\0\u0c78"+
    "\0\u0c9e\0\u0cc4\0\u0cea\0\u0d10\0\u0d36\0\u0d5c\0\u0d82\0\u0da8"+
    "\0\u0dce\0\u0df4\0\u0e1a\0\u0e40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\1\15\1\3\1\16"+
    "\1\17\2\3\1\20\1\21\1\22\1\23\1\3\1\24"+
    "\1\3\1\25\2\3\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\32\1\35\47\0\3\3\3\0\27\3"+
    "\12\0\1\4\47\0\1\30\34\0\1\30\11\0\1\6"+
    "\46\0\1\36\32\0\1\30\5\0\3\3\3\0\1\3"+
    "\1\37\25\3\11\0\3\3\3\0\13\3\1\40\13\3"+
    "\11\0\3\3\3\0\24\3\1\41\2\3\11\0\3\3"+
    "\3\0\5\3\1\42\21\3\11\0\3\3\3\0\6\3"+
    "\1\43\20\3\11\0\2\3\1\44\3\0\13\3\1\45"+
    "\3\3\1\46\7\3\11\0\3\3\3\0\1\46\2\3"+
    "\1\47\6\3\1\50\14\3\11\0\3\3\3\0\2\3"+
    "\1\51\7\3\1\52\1\3\1\53\6\3\1\54\3\3"+
    "\11\0\3\3\3\0\13\3\1\55\2\3\1\56\10\3"+
    "\11\0\3\3\3\0\3\3\1\57\2\3\1\60\20\3"+
    "\11\0\3\3\3\0\3\3\1\61\13\3\1\62\7\3"+
    "\11\0\3\3\3\0\3\3\1\63\23\3\11\0\3\3"+
    "\3\0\3\3\1\37\23\3\11\0\3\3\3\0\12\3"+
    "\1\64\14\3\11\0\3\3\3\0\3\3\1\65\23\3"+
    "\12\0\1\4\33\0\1\30\2\0\2\30\43\0\2\30"+
    "\45\0\1\30\45\0\1\30\1\32\44\0\1\30\1\0"+
    "\1\32\43\0\1\30\3\0\1\30\1\0\3\3\3\0"+
    "\2\3\1\66\24\3\11\0\3\3\3\0\11\3\1\67"+
    "\2\3\1\70\12\3\11\0\3\3\3\0\25\3\1\71"+
    "\1\3\11\0\3\3\3\0\6\3\1\72\20\3\11\0"+
    "\3\3\3\0\2\3\1\73\16\3\1\74\5\3\11\0"+
    "\3\3\3\0\2\3\1\75\24\3\11\0\3\3\3\0"+
    "\1\3\1\76\25\3\11\0\3\3\3\0\11\3\1\77"+
    "\15\3\11\0\3\3\3\0\13\3\1\100\13\3\11\0"+
    "\3\3\3\0\1\61\26\3\11\0\3\3\3\0\1\101"+
    "\4\3\1\102\21\3\11\0\3\3\3\0\3\3\1\103"+
    "\23\3\11\0\3\3\3\0\21\3\1\104\1\105\4\3"+
    "\11\0\3\3\3\0\14\3\1\106\12\3\11\0\3\3"+
    "\3\0\2\3\1\56\24\3\11\0\3\3\3\0\1\3"+
    "\1\107\25\3\11\0\3\3\3\0\16\3\1\110\10\3"+
    "\11\0\3\3\3\0\5\3\1\56\21\3\11\0\3\3"+
    "\3\0\3\3\1\111\23\3\11\0\3\3\3\0\13\3"+
    "\1\112\13\3\11\0\3\3\3\0\14\3\1\113\12\3"+
    "\11\0\3\3\3\0\14\3\1\114\2\3\1\115\7\3"+
    "\11\0\3\3\3\0\3\3\1\56\23\3\11\0\3\3"+
    "\3\0\14\3\1\116\12\3\11\0\3\3\3\0\3\3"+
    "\1\117\23\3\11\0\3\3\3\0\6\3\1\120\20\3"+
    "\11\0\3\3\3\0\1\121\26\3\11\0\3\3\3\0"+
    "\1\3\1\122\25\3\11\0\3\3\3\0\14\3\1\123"+
    "\12\3\11\0\3\3\3\0\6\3\1\122\20\3\11\0"+
    "\3\3\3\0\20\3\1\56\6\3\11\0\3\3\3\0"+
    "\6\3\1\56\20\3\11\0\3\3\3\0\2\3\1\124"+
    "\6\3\1\55\15\3\11\0\3\3\3\0\2\3\1\125"+
    "\24\3\11\0\3\3\3\0\1\3\1\126\25\3\11\0"+
    "\3\3\3\0\5\3\1\55\21\3\11\0\3\3\3\0"+
    "\13\3\1\127\13\3\11\0\3\3\3\0\6\3\1\130"+
    "\20\3\11\0\3\3\3\0\2\3\1\131\24\3\11\0"+
    "\3\3\3\0\4\3\1\113\22\3\11\0\3\3\3\0"+
    "\1\132\26\3\11\0\3\3\3\0\1\55\26\3\11\0"+
    "\3\3\3\0\21\3\1\56\5\3\11\0\3\3\3\0"+
    "\17\3\1\77\7\3\11\0\3\3\3\0\15\3\1\56"+
    "\11\3\11\0\3\3\3\0\1\133\26\3\11\0\3\3"+
    "\3\0\21\3\1\104\5\3\11\0\3\3\3\0\13\3"+
    "\1\56\13\3\11\0\3\3\3\0\15\3\1\134\11\3"+
    "\11\0\3\3\3\0\7\3\1\56\17\3\11\0\3\3"+
    "\3\0\5\3\1\117\21\3\11\0\3\3\3\0\11\3"+
    "\1\135\15\3\11\0\3\3\3\0\14\3\1\136\12\3"+
    "\11\0\3\3\3\0\14\3\1\137\12\3\11\0\3\3"+
    "\3\0\10\3\1\55\16\3\11\0\3\3\3\0\6\3"+
    "\1\114\20\3\11\0\3\3\3\0\3\3\1\140\23\3"+
    "\11\0\3\3\3\0\10\3\1\141\16\3\11\0\3\3"+
    "\3\0\1\3\1\142\25\3\11\0\3\3\3\0\2\3"+
    "\1\64\24\3\11\0\3\3\3\0\6\3\1\140\20\3"+
    "\11\0\3\3\3\0\2\3\1\143\24\3\11\0\3\3"+
    "\3\0\13\3\1\144\13\3\11\0\3\3\3\0\10\3"+
    "\1\56\16\3\11\0\3\3\3\0\16\3\1\56\10\3"+
    "\11\0\3\3\3\0\12\3\1\56\14\3\11\0\3\3"+
    "\3\0\17\3\1\55\7\3\11\0\3\3\3\0\6\3"+
    "\1\61\20\3\11\0\3\3\3\0\1\3\1\77\25\3"+
    "\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3686];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\1\11\5\1\1\11\106\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[100];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public Integer row;
    public Integer column;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public TipoToken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { /*Ignore*/
          }
        case 7: break;
        case 2: 
          { lexeme = yytext(); row = yyline; column = yycolumn; return Identifier;
          }
        case 8: break;
        case 3: 
          { lexeme = yytext(); row = yyline; column = yycolumn; return Number;
          }
        case 9: break;
        case 1: 
          { return ERROR;
          }
        case 10: break;
        case 6: 
          { lexeme = yytext(); row = yyline; column = yycolumn; return Keyword;
          }
        case 11: break;
        case 4: 
          { lexeme = yytext(); row = yyline; column = yycolumn; return Operator;
          }
        case 12: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
