parser grammar Parsergrammar;

options { tokenVocab = Lexergrammmar; }

ast:
tsDocument htmlDocument cssDocument;

tsDocument:
(importStatement+ (componentDecorator | injectableDecorator)? classDeclaration);

classDeclaration:
EXPORT CLASS IDENTIFIER implementsClause? LBRACE classBody RBRACE ;

implementsClause:
IMPLEMENTS (IDENTIFIER | CROISNN) (COMMA (IDENTIFIER | CROISNN))*;

classBody:
classBodyStatement*;

classBodyStatement
  : variableAssign              #VariableAssignmentStatement
  | methodvoid                  #VoidMethodDeclarationStatement
  | variableDeclaration         #VariableDeclarationStatement
  | arrayExpression1            #ArrayExprOneStatement
  | arrayExpression2            #ArrayExprTwoStatement
  | methodDeclaration           #TypedMethodDeclarationStatement
  | constructorDeclaration      #ConstructorDeclarationStatement
  | signalDeclaration           #SignalDeclarationStatement
  | ngOnInitMETHOD              #NgOnInitMethodStatement
  ;

//mod
importStatement:
IMPORT LBRACE importBody (COMMA importBody)*RBRACE FROM(STRING_LITERAL) SEMICOLON;

//mod

importBody:
IDENTIFIER
|CROISNN
|COMPONENT
|INJECTABLE
;

//mod
componentDecorator:
AT COMPONENT LPAREN LBRACE componentProperties? RBRACE RPAREN ;

//mod
componentProperties:
(selector COMMA)? (imports COMMA)? templateurl styleurl?;

selector:
SELECTOR COLON STRING_LITERAL ;

imports:
IMPORTS COLON LBRACKET (IDENTIFIER |CROISNN)?(COMMA (IDENTIFIER | CROISNN))*? RBRACKET;

styleurl:
STYLEURL COLON STRING_LITERAL;

templateurl:
TEMPLATEURL COLON STRING_LITERAL COMMA;



injectableDecorator:
AT INJECTABLE LPAREN LBRACE providedin? RBRACE RPAREN;

providedin:
PROVIDEDIN COLON STRING_LITERAL (COMMA)?;

signature:
ACCESS? STATIC? IDENTIFIER;

values:
NULL | NUMBER | STRING_LITERAL | BOOLEAN;

parameters:
IDENTIFIER COLON TYPE (COMMA IDENTIFIER COLON TYPE)*;
//mod12
methodDeclaration:
signature LPAREN parameters? RPAREN LBRACE methodBody RBRACE;

methodBody:
RETURN ((THIS DOT)? IDENTIFIER|values)SEMICOLON ;

objectExpression:
LBRACE (IDENTIFIER COLON values COMMA?)* RBRACE COMMA?;

arrayExpression1:
signature ASSIGN LBRACKET arraybody1* RBRACKET SEMICOLON? ;

arraybody1:
objectExpression | NUMBER COMMA? | STRING_LITERAL COMMA?;

arrayExpression2:
signature COLON TYPE LBRACKET RBRACKET ASSIGN LBRACKET arraybody2* RBRACKET SEMICOLON;

arraybody2:
objectExpression COMMA NUMBER COMMA STRING_LITERAL;

constructorDeclaration:
CONSTRUCTOR LPAREN (ACCESS? IDENTIFIER COLON IDENTIFIER)? RPAREN LBRACE RBRACE;

variableDeclaration:
signature COLON TYPE ASSIGN values SEMICOLON;

variableAssign:
IDENTIFIER ASSIGN values SEMICOLON ;

methodvoid:
signature LPAREN parameters? RPAREN COLON VOIDTYPE LBRACE methodvoidbody RBRACE ;

methodvoidbody:
(THIS DOT)? IDENTIFIER ASSIGN (THIS DOT)? IDENTIFIER (DOT methodcall)? SEMICOLON;

//////no mod
methodcall:
IDENTIFIER LPAREN IDENTIFIER? RPAREN ;

ngOnInitMETHOD:
ACCESS? NGONINIT LPAREN  RPAREN COLON VOIDTYPE LBRACE methodvoidbody RBRACE ;

signalDeclaration:
IDENTIFIER ASSIGN CROISNN LPAREN STRING_LITERAL RPAREN SEMICOLON ;



///////////////////////////////////////////////// قواعد الـ CSS /////////////////////////////////////////////


cssDocument:
ruleSet*;
//mod

selectorincss
    : (DOT | HASH) IDENTIFIER
    | TAGSFORCSS
    ;
ruleSetStart:
first=selectorincss(WS* TAGSFORCSS)*;
//mod
ruleSet:
ruleSetStart LBRACE declarationList RBRACE;

declarationList:
declaration (SEMICOLON declaration)* SEMICOLON?;

declaration:
PROPERTY_NAME COLON value (value*)?;

value:
     NUMBER UNIT?
    | COLOR
    | STRING
    | VALUE_KEYWORD
    | IDENTIFIER;

/////////////////////////////////////////////////////قواعد ال html/////////////////////////////////////////////////////////////



htmlDocument:
scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*;

scriptletOrSeaWs:
SCRIPTLET |WS;

htmlElements:
htmlComment* htmlElement htmlComment*;

//modi
htmlElement
    : tsTag            #TsTagElement
    | noEndTag         #NoEndTagElement
    | normalTag        #NormalTagElement
    | SCRIPTLET        #ScriptletElement
    | INTERPOLATION    #InterpolationElement
    ;

//mod
tsTag:
TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE ;
//mod
noEndTag:
TAG_OPEN TAGS_VOID htmlAttribute* TAG_CLOSE ;
//mod
normalTag:
TAG_OPEN TAGS htmlAttribute* TAG_CLOSE htmlContent? TAG_OPEN_SLASH TAGS TAG_CLOSE ;
//modi
htmlContent
    : htmlContentStatement*
    ;

htmlContentStatement:
      htmlChardata      #HtmlCharDataStatement
    | htmlElement       #HtmlElementStatement
    | CDATA             #HtmlCDataStatement
    | htmlComment       #HtmlCommentStatement
    | SCRIPTLET         #HtmlScriptletStatement
    | IDENTIFIER        #HtmlIdentifierStatement
    | COLON             #HtmlColonStatement
    ;

htmlChardata:
     HTML_TEXT
    | WS;

//mod
tagAtt:
TAG_EQUALS (METHOD_CALL_VALUE| ATTVALUE_VALUE);
//mod
htmlAttribute
    : STRUCTURAL_DIRECTIVE tagAtt?  # StructuralDirectiveAttribute
    | ATTRIBUTE_BINDING tagAtt?     # AttributeBinding
    | EVENT_BINDING tagAtt?         # EventBinding
    | TAG_NAME tagAtt?              # TagNameAttribute
    ;

htmlMisc:
     htmlComment
    | WS;

htmlComment:
     HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT;


