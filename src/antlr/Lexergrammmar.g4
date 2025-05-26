lexer grammar Lexergrammmar;


// Keywords
IMPORTS        : 'imports';
FROM           : 'from';
EXPORT         : 'export';
IMPORT         : 'import';
CLASS          : 'class';
CONSTRUCTOR    : 'constructor';
RETURN         : 'return';
AT             : '@';
IMPLEMENTS     : 'implements';
NGONINIT       : 'ngOnInit';
SELECTOR       : 'selector';
TEMPLATEURL    : 'templateUrl';
STYLEURL       : 'styleUrl';
STYLEURLS      : 'styleUrls';
PROVIDEDIN     : 'providedIn';
VOIDTYPE       : 'void';
NULL           : 'null';
BOOLEAN        : 'true' | 'false';
TYPE           : 'any' |'number'| 'string' |'boolean';
STATIC         : 'let'|'var'|'static'|'const';
ACCESS         : 'private'|'public';
CROISNN        : 'RouterOutlet' | 'OnInit' | 'signal' | 'NgFor' | 'NgIf';
COMPONENT      :'Component' ;
INJECTABLE     :'Injectable';

// Punctuation
LBRACE         : '{';
RBRACE         : '}';
LPAREN         : '(';
RPAREN         : ')';
LBRACKET       : '[';
RBRACKET       : ']';
COLON          : ':';
COMMA          : ',';
SEMICOLON      : ';';
ASSIGN         : '=';
DOT            : '.';
THIS           : 'this';
HASH           : '#';
// Units
UNIT           : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw';
COLOR          : '#' [0-9a-fA-F]+;

PROPERTY_NAME
    : 'padding-block' | 'margin' | 'padding-inline' | 'display' | 'justify-content'
    | 'padding' | 'width' | 'height' | 'flex-direction' | 'align-items' | 'flex-wrap'
    | 'gap' | 'text-align' | 'border' | 'background-color' | 'background-image'
    | 'background-size' | 'object-fit' | 'position' | 'left' | 'top' | 'cursor'
    | 'z-index' | 'color' | 'outline' | 'border-right' | 'margin-bottom'|'margin-right'|'border-radius';

VALUE_KEYWORD
    : 'flex' | 'space-between' | 'column' | 'wrap' | 'center' | 'absolute' | 'pointer'
    | 'solid' | 'cover' | 'flex-end';

TAGSFORCSS
    : 'html' | 'head' | 'body' | 'div' | 'span' | 'p' | 'a' | 'ul' | 'ol' | 'li' | 'table' | 'thead'
    | 'tbody' | 'tr' | 'td' | 'th' | 'form' | 'input' | 'button' | 'label' | 'select' | 'option' | 'h1' | 'h2'
    | 'h3' | 'h4' | 'h5' | 'h6' | 'img' | 'script' | 'style' | 'link' | 'meta' | 'footer' | 'header' | 'nav'
    | 'article' | 'section' | 'aside' | 'main' | 'figure' | 'figcaption' | 'video' | 'audio' | 'source' | 'iframe'
    | 'canvas' | 'blockquote' | 'pre' | 'code' | 'small' | 'b' | 'u' | 'strong' | 'em' | 'br' | 'hr'
    ;

// Identifiers and Literals
IDENTIFIER     : [a-zA-Z_][a-zA-Z_0-9]* | [a-zA-Z_][a-zA-Z0-9_-]* | PROPERTY_NAME;
NUMBER         : [0-9]+;
STRING_LITERAL : '\'' ( ~[\r\n'] | '\\\'')* '\'';
STRING         : '"' .*? '"';


// Operators

PLUS           : '+';
MINUS          : '-';
STAR           : '*';
DIVIDE         : '/';
EQUALS         : '==';
NOT_EQUAL      : '!=';

// Whitespace and Comments
WS             : [ \t\r\n]+ -> skip;
LINE_COMMENT   : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT  : '/*' .*? '*/' -> skip;
INTERPOLATION
    : '{{' .*? '}}'
    ;



//***************************HTML**************************************************



HTML_COMMENT              : '<!--' .*? '-->';
HTML_CONDITIONAL_COMMENT  : '<![' .*? ']>';
XML                      : '<?xml' .*? '>';
CDATA                    : '<![CDATA[' .*? ']]>';
DTD                      : '<!' .*? '>';
SCRIPTLET                : '<?' .*? '?>' | '<%' .*? '%>';
TAG_OPEN_SLASH           : '</' -> pushMode(TAG);
TAG_OPEN                 : '<' -> pushMode(TAG);


/////////// Tag
mode TAG;
TAGS
    : 'html' | 'head' | 'body' | 'div' | 'span' | 'p' | 'a' | 'ul' | 'ol' | 'li' | 'table' | 'thead'
    | 'tbody' | 'tr' | 'td' | 'th' | 'form' | 'button' | 'label' | 'select' | 'option' | 'h1' | 'h2'
    | 'h3' | 'h4' | 'h5' | 'h6' | 'script' | 'style' | 'footer' | 'header' | 'nav'
    | 'article' | 'section' | 'aside' | 'main' | 'figure' | 'figcaption' | 'video' | 'audio' | 'iframe'
    | 'canvas' | 'blockquote' | 'pre' | 'code' | 'small' | 'b' | 'i' | 'u' | 'strong' | 'em' | 'br' |
    ;

TAGS_VOID:
                 'area'
               | 'base'
               | 'br'
               | 'col'
               | 'embed'
               | 'hr'
               | 'img'
               | 'input'
               | 'link'
               | 'meta'
               | 'param'
               | 'source'
               | 'track'
               | 'wbr';

HTML_TEXT : [^<]+ ;
TAG_CLOSE                : '>' -> popMode;
TAG_SLASH_CLOSE          : '/>' -> popMode;
TAG_EQUALS               : ASSIGN -> pushMode(ATTVALUE);
TAG_NAME                 : TAG_NameStartChar TAG_NameChar*;
STRUCTURAL_DIRECTIVE      : '*' TAG_NAME '=' DOUBLE_QUOTE_STRING;
ATTRIBUTE_BINDING        : LBRACKET TAG_NAME RBRACKET;
EVENT_BINDING            : LPAREN TAG_NAME RPAREN;
TAG_WHITESPACE           : [ \t\r\n] -> channel(HIDDEN);

TAG_NameChar
    : TAG_NameStartChar
    | MINUS
    | '_'
    | '.'
    | [0-9]
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040';

TAG_NameStartChar
    : [a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD';

// //////////Attribute value components
mode ATTVALUE;
METHOD_CALL_VALUE
    : '"' IDENTIFIER '(' IDENTIFIER? ')' '"' -> popMode
    ;

 ATTVALUE_VALUE
        : ' '* ATTRIBUTE -> popMode;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS;

ATTCHARS
    : ATTCHAR+ ' '?;

ATTCHAR
    : MINUS
    | '_'
    | DOT
    | DIVIDE
    | PLUS
    | COMMA
    | '?'
    | ASSIGN
    | COLON
    | SEMICOLON
    | HASH
    | [0-9a-zA-Z];

HEXCHARS
    : COLOR;

DECCHARS
    : [0-9]+ '%'?;

DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"';

SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\'';

