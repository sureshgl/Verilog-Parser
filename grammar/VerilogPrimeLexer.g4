lexer grammar VerilogPrimeLexer;

@lexer::members {

    private boolean isPragma(){

        StringBuilder commentText = new StringBuilder();
        int ahead = 1;
        int next = _input.LA(ahead++);
        commentText.append((char)next);
        while(next != -1 && next != '\r' && next != '\n')
        {
            next = _input.LA(ahead++);
            commentText.append((char)next);
        }

        if(commentText.toString().trim().startsWith("pragma")) {
            return true;
        }
        else {
            // Let the lexer consume all the characters!
            for(int i = 0; i < commentText.length(); i++)
            {
                _input.consume();
            }
            return false;
        }
    }
}



PRAGMA_SPECIFIER : COMMENT_BEGIN 'pragma' ->mode(pragma_mode);
COMMENT_BEGIN : '//' { if(!isPragma()) skip(); };
ENDSTR : 'end';
PRIMITIVESTR : 'primitive';
CONFIGSTR : 'config';
DEASSIGNSTR : 'deassign';
STRINGSTR : 'string';
DOLLARFULLSKEWSTR : '$fullskew';
INTEGERSTR : 'integer';
REALTIMESTR : 'realtime';
COLONEQUALS : ':=';
SOLVESTR : 'solve';
TRANIF0STR : 'tranif0';
FORKSTR : 'fork';
THISSTR : 'this';
WITHSTR : 'with';
DOLLAEWIDTHSTR : '$width';
RETURNSTR : 'return';
REGSTR : 'reg';
PROTECTEDSTR : 'protected';
CHECKERSTR : 'checker';
STRONG0 : 'strong0';
STATICSTR : 'static';
DOLLARFATALSTR : '$fatal';
EXTENDSSTR : 'extends';
SCALAREDSTR : 'scalared';
ESCAPEQUOTE : '\'';
ANDEQUALS : '&=';
CASEXSTR : 'casex';
WAIT_ORDERSTR : 'wait_order';
REFSTR : 'ref';
BUFSTR : 'buf';
DEFAULTSTR : 'default';
LSHIFT_ASSIGN : '<<=';
ENDTASKSTR : 'endtask';
REALSTR : 'real';
ASSERTSTR : 'assert';
DISTSTR : 'dist';
TRIANDSTR : 'triand';
POSEDGESTR : 'posedge';
OREQUAL : '|=';
OUTPUTSTR : 'output';
ENDPROGRAMSTR : 'endprogram';
EXPECTSTR : 'expect';
ALWAYS_COMBSTR : 'always_comb';
ALIASSTR : 'alias';
EXPORT : 'export';
BINSOFSTR : 'binsof';
WITHINSTR : 'within';
MODULESTR : 'module';
IFFSTR : 'iff';
PULLDOWNSTR : 'pulldown';
SIGNEDSTR : 'signed';
VIRTUALSTR : 'virtual';
UNIONSTR : 'union';
DERIVEGT : '->>';
ASSIGNSTRSTR : 'assign';
ENDCASESTR : 'endcase';
FORKJOINSTR : 'forkjoin';
CROSSSTR : 'cross';
NOTIF1STR : 'notif1';
RPMOSSTR : 'rpmos';
DOLLARPERIODSTR : '$period';
TRANIF1STR : 'tranif1';
CONTINUESTR : 'continue';
ORSTR : 'or';
NOTIF0STR : 'notif0';
ENDCLOCKINGSTR : 'endclocking';
JOIN_ANYSTR : 'join_any';
BITSTR : 'bit';
INSTANCESTR : 'instance';
ENDCONFIGSTR : 'endconfig';
SLASHEQUALS : '/=';
INTERSECTSTR : 'intersect';
DOLLARNOCHANGESTR : '$nochange';
RELEASESTR : 'release';
SHORTINTSTR : 'shortint';
DESIGNSTR : 'design';
SPECIFYSTR : 'specify';
EXTERNSTR : 'extern';
FUNCTIONSTR : 'function';
RANDCSTR : 'randc';
BYTESTR : 'byte';
IMPORTSTR : 'import';
STRUCTSTR : 'struct';
LARGESTR : 'large';
RCMOSSTR : 'rcmos';
ELSESTR : 'else';
ILLEGAL_BINSSTR : 'illegal_bins';
PLUSEQUALS : '+=';
LETSTR : 'let';
BREAKSTR : 'break';
UNIQUESTR : 'unique';
UNTYPEDSTR : 'untyped';
QUESTINMARK : '?';
RTRANSTR : 'rtran';
DOLLARRECREMSTR : '$recrem';
WHILESTR : 'while';
INPUTSTR : 'input';
WIRESTR : 'wire';
DISABLESTR : 'disable';
FOREACHSTR : 'foreach';
LOCALCOLONCOLON : 'local::';
ENDCLASSSTR : 'endclass';
WEAK0STR : 'weak0';
BUFIF0STR : 'bufif0';
TRANSTR : 'tran';
ORIMPLIES : '|=>';
NMOSSTR : 'nmos';
CHANDLESTR : 'chandle';
HIGHZ0STR : 'highz0';
BEGINSTR : 'begin';
DOLLARSKEWSTR : '$skew';
NULLSTR : 'null';
ONESTEPSTR : '1step';
PLUSCOLON : '+:';
PURESTR : 'pure';
COVERPOINTSTR : 'coverpoint';
BINSSTR : 'bins';
GLOBALSTR : 'global';
CONSTRAINTSTR : 'constraint';
STDCOLONCOLON : 'std::';
ATTHERATE : '@';
MEDIUMSTR : 'medium';
AUTOMATICSTR : 'automatic';
COLONCOLON : '::';
ALWAYSSTR : 'always';
PULL0STR : 'pull0';
PARAMETERSTR : 'parameter';
GENERATESTR : 'generate';
INITIALSTR : 'initial';
USESTR : 'use';
BUFIF1STR : 'bufif1';
LOCALPARAMSTR : 'localparam';
WEAK1STR : 'weak1';
INOUTSTR : 'inout';
ATTHERATELPAREN : '@@(';
BINDSTR : 'bind';
HIGHZ1STR : 'highz1';
DOLLARSETUPHOLDSTR : '$setuphold';
UNIQUE0STR : 'unique0';
TAGGEDSTR : 'tagged';
THROUGHOUTSTR : 'throughout';
CLOCKINGSTR : 'clocking';
LOCALSTR : 'local';
ENDTABLESTR : 'endtable';
DOLLARUNITSTR : '$unit';
INTERFACESTR : 'interface';
DEFPARAMSTR : 'defparam';
PULL1STR : 'pull1';
TASKSTR : 'task';
DPI_SPEC_ING1STR : '"DPI"';
LONGINTSTR : 'longint';
SPECPARAMSTR : 'specparam';
SMALLSTR : 'small';
IFNONESTR : 'ifnone';
TYPESTR : 'type';
MODPORTSTR : 'modport';
EVENTSTR : 'event';
COVERGROUPSTR : 'covergroup';
CMOSSTR : 'cmos';
XNORSTR : 'xnor';
TYPEDEFSTR : 'typedef';
FORSTR : 'for';
STARRPAREN : '*)';
TRI0STR : 'tri0';
WANDSTR : 'wand';
IMPLIES : '=>';
LPARENSTAR : '(*';
RANDSEQUENCESTR : 'randsequence';
DOLLARSETUPSTR : '$setup';
UWIRESTR : 'uwire';
ANDSTR : 'and';
FIRST_MATCHSTR : 'first_match';
PACKAGESTR : 'package';
ANDANDAND : '&&&';
VARSTR : 'var';
ENDMODULESTR : 'endmodule';
LPARENSTARRPAREN : '(*)';
NOTSTR : 'not';
TRIREGSTR : 'trireg';
TRI1STR : 'tri1';
UNSIGNED_LSHIFT_ASSIGN : '<<<=';
EDGESTR : 'edge';
ENUMSTR : 'enum';
JOINSTR : 'join';
DOLLARERRORSTR : '$error';
DOLLARINFOSTR : '$info';
JOIN_NAMESTR : 'join_none';
NEWSTR : 'new';
SUPPLY0STR : 'supply0';
CONSTSTR : 'const';
DOTSTAR : '.*';
RANDCASESTR : 'randcase';
STARTCOLONCOLONSTAR : '*::*';
DPI_SPEC_ING2STR : '"DPI-C"';
CELLSTR : 'cell';
PRIORITYSTR : 'priority';
XORSTRSTR : 'xor';
NANDSTR : 'nand';
SUPERSTR : 'super';
DOLLARROOTSTR : '$root';
CASESTR : 'case';
ALWAYS_FFSTR : 'always_ff';
ENDPRIMITIVESTR : 'endprimitive';
DOLLARREMOVALSTR : '$removal';
ENDGENERATESTR : 'endgenerate';
SUPPLY1STR : 'supply1';
LIBLISTSTR : 'liblist';
DOLLARHOLDSTR : '$hold';
ATTHERATESTAR : '@*';
COVERSTR : 'cover';
DOLLARRECOVERYSTR : '$recovery';
FORCESTR : 'force';
PMOS : 'pmos';
NORSTR : 'nor';
RANDOMIZESTR : 'randomize';
ENDGROUPSTR : 'endgroup';
RNMOSSTR : 'rnmos';
NOSHOWCANCELLEDSTR : 'noshowcancelled';
SHOWCANCELLEDSTR : 'showcancelled';
TIMESTR : 'time';
PERCENTILEEQUAL : '%=';
TYPE_OPTIONDOT : 'type_option.';
PULSESTYLE_ONEVENTSTR : 'pulsestyle_onevent';
STRONG1 : 'strong1';
ESCAPELCURL : '\'{';
WORSTR : 'wor';
TRIORSTR : 'trior';
SCALAR_CONSTANT1 : '\'1';
DOLLARTIMESKEWSTR : '$timeskew';
SEQUENCESTR : 'sequence';
PROPERTYSTR : 'property';
WILDCARDSTR : 'wildcard';
ENDPACKAGESTR : 'endpackage';
FINALSTR : 'final';
COLONSLASH : ':/';
XOREQUAL : '^=';
GENVARSTR : 'genvar';
WAITSTR : 'wait';
ENDINTERFACESTR : 'endinterface';
RSHIFT_ASSIGN : '>>=';
UNSIGNED_RSHIFT_ASSIGN : '>>>=';
VOIDSTR : 'void';
RTRANIF1STR : 'rtranif1';
INTSTR : 'int';
PROGRAMSTR : 'program';
IFSTR : 'if';
ENDFUNCTIONSTR : 'endfunction';
STARGT : '*>';
FOREVERSTR : 'forever';
MACROMODULESTR : 'macromodule';
INSIDESTR : 'inside';
ASSUMESTR : 'assume';
MINUSEQUALS : '-=';
CONTEXTSTR : 'context';
SAMPLESTR : 'sample';
PATHPULSEDOLLAR : 'PATHPULSE$';
CLASSSTR : 'class';
ENDSEQUENCESTR : 'endsequence';
OPTIONDOT : 'option.';
RANDSTR : 'rand';
SHORTREAL : 'shortreal';
MATCHESSTR : 'matches';
RESTRICTSTR : 'restrict';
ENDPROPERTYSTR : 'endproperty';
TABLESTR : 'table';
IGNORE_BINSSTR : 'ignore_bins';
REPEATSTR : 'repeat';
ENDCHECKERSTR : 'endchecker';
RTRANIF0STR : 'rtranif0';
MINUSCOLON : '-:';
UNSIGNEDSTR : 'unsigned';
ENDSPECIFYSTR : 'endspecify';
STARTEQUALS : '*=';
VECTOREDSTR : 'vectored';
DOSTR : 'do';
LOGICSTR : 'logic';
ALWAYS_LATCHSTR : 'always_latch';
PULSESTYLE_ONDETECTSTR : 'pulsestyle_ondetect';
CASEZSTR : 'casez';
TRISTR : 'tri';
ORDERIVE : '|->';
PULLUPSTR : 'pullup';
BEFORESTR : 'before';
PACKEDSTR : 'packed';
DOLLARWARNINGSTR : '$warning';
NEGEDGESTR : 'negedge';
SCALAR_CONSTANT0 : '\'0';
TIMEUNIT
:   'timeunit'
;

TIMEPRECISION
:   'timeprecision'
;

Zero_Or_One: [01];

EDGE_SPEC:
'01'|'10';

TIME_UNIT : 's' | 'ms' | 'us' | 'ns' | 'ps' | 'fs';

Real_number
:   Unsigned_number '.' Unsigned_number
|   Unsigned_number ( '.' Unsigned_number )? [eE] ( [+-] )? Unsigned_number
;

Decimal_number
:   Unsigned_number
| ( Size )? Decimal_base Unsigned_number
| ( Size )? Decimal_base X_digit ( '_' )*
| ( Size )? Decimal_base Z_digit ( '_' )*
;

Binary_number : ( Size )? Binary_base Binary_value ;

Octal_number : ( Size )? Octal_base Octal_value ;

Hex_number : ( Size )? Hex_base Hex_value ;

fragment
Sign : [+-] ;

fragment
Size : Non_zero_unsigned_number ;

fragment
Non_zero_unsigned_number : Non_zero_decimal_digit ( '_' | Decimal_digit )* ;

fragment
Unsigned_number : Decimal_digit ( '_' | Decimal_digit )* ;

fragment
Binary_value : Binary_digit ( '_' | Binary_digit )* ;

fragment
Octal_value : Octal_digit ( '_' | Octal_digit )* ;

fragment
Hex_value : Hex_digit ( '_' | Hex_digit )* ;

fragment
Decimal_base : '\'' [sS]? [dD] ;

fragment
Binary_base : '\'' [sS]? [bB] ;

fragment
Octal_base : '\'' [sS]? [oO] ;

fragment
Hex_base : '\'' [sS]? [hH] ;

fragment
Non_zero_decimal_digit : [1-9] ;

fragment
Decimal_digit : [0-9] ;

fragment
Binary_digit : X_digit | Z_digit | [01] ;

fragment
Octal_digit : X_digit | Z_digit | [0-7] ;

fragment
Hex_digit : X_digit | Z_digit | [0-9a-fA-F] ;

fragment
X_digit : [xX] ;

fragment
Z_digit : [zZ?] ;

Z_or_X: X_digit|Z_digit;

TF_ID  :   '$' [a-zA-Z0-9_$] [a-zA-Z0-9_$]*;

ID  :  [a-zA-Z_] [a-zA-Z0-9_$]*
;

ESCAPED_IDENTIFIER : 
'\\'~(' '| '\t'| '\r'| '\n')*;

COMMENT
:   ( '/*' .*? '*/' )-> channel(HIDDEN)
;

WS  :   [ \t\n\r]+ -> channel(HIDDEN)
    ;

STRING : '"' ( ~[\n\r"] )* '"' ;

PLUS    :   '+';

MINUS   :   '-';

NOT :   '!';

COMPLIMENT
:   '~';

AND
:   '&';

NAND
:   '~&';

OR: '|';

NOR
:   '~|';

XOR
:   '^';

XORN
:   '~^';

XNOR
:   '^~';

STAR    :   '*';

DIV :   '/';

MODULO  :   '%';

EQUALS  :   '==';

NOT_EQUALS
:   '!=';

CASE_EQUALITY
:   '===';

CASE_INEQUALITY
:   '!==';

CASE_Q  :   '==?';

NOT_CASE_Q
:   '!=?';

LOG_AND :   '&&';

LOG_OR  :   '||';

LT  :   '<';

LE  :   '<=';

GT  :   '>';

GE  :   '>=';

RSHIFT  :   '>>';

LSHIFT  :   '<<';

ARSHIFT :   '>>>';

ALSHIFT :   '<<<';

DERIVE  :   '->';

DDERIVE :   '<->';

LBRACK
:   '['
;

RBRACK
:   ']'
;

LPAREN
:   '('
;

RPAREN
:   ')'
;

STARSTAR
:   '**'
;

ASSIGN
:   '='
;

LCURL
:   '{'
;

RCURL
:   '}'
;

DOT :   '.';

COMMA   :   ',';

SEMI    :   ';';

COLON   :   ':';

HASH
:   '#'
;

DOUBLE_HASH
:   '##'
;

HASH_ZERO
:   '#0'
;

DOLLAR:
'$';


mode pragma_mode;
PRAGMA_ID  :  [a-zA-Z_] [a-zA-Z0-9_$]*;
PRAGMA_DOT : '.';
PRAGMA_WS  :   [ \t]+ -> channel(HIDDEN);
MODE_TEXT : ~('\r'|'\n'|'.'|' '|'\t')*;
NEW_LINE : ('\n' | '\r') ->mode(DEFAULT_MODE);
