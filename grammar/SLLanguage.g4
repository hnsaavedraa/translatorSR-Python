grammar SLLanguage;



components: global
          | resource_specification
          | resource_body
          | proc
          | block
          ;


global : GLOBAL ID (constant | types)
        ;

resource_specification: ((spec ID)? (IMPORT COMPONENT_ID)? (constant|type|operation)?)?
                       |RESOURCE ID( (parameters)?) (SEPARA)?
                       ;

resource_body: (BODY ID)?  (declarations)? (INITIAL block END)? procs (FINAL block END)?
             ;


proc : proc ID ( (FORMAL_ID)? ) (RETURNS RESULT_ID)? block
     ;

block: (declarations)? statements
     ;

declarations: constant
            | type
            | op_type
            | variable
            | operation
            ;
constant : CONST ID ASIGNACION expression
         ;

type: TYPE ID ASIGNACION type_specification
    ;

op_type: OPTYPE ID ASIGNACION (parameters)? (RETURNS result)?
       ;

variable: VAR ID (subscripts)? ':' type(ASIGNACION expression)?
        ;

operation: OP ID (subscripts)? ':'  (parameters)? (RETURNS result)?
         | OP ID (subscripts)? OPTYPE_ID
         ;

statements: sequential
          | op_invocation
          | op_service
          | resource_control
          ;

sequential: SKIP
          | variable ASIGNACION expression
          | variable INCREMENTO
          | variable DECREMENTO
          | IF boolean_expression EJECUTA block SEPARA FI
          | DO boolean_expression EJECUTA block SEPARA OD
          | FA quantifier EJECUTA block AF
          | EXIT
          | NEXT
          ;

op_invocation: (CALL)? operation (actuals)?
             | SEND operation (actuals)?
             | CO (quantifier)? call_invocation (EJECUTA block)? OC
             ;

op_service: IN (quantifier)? operation (FORMAL_ID)? ('&' boolean_expression)? (BY expression)? EJECUTA block SEPARA NI
          | RECEIVE operation (variable)?
          | RETURN
          | REPLY
          ;

resource_control: capability ASIGNACION CREATE RESOURCE (actuals)? (ON machine)?
                | DESTROY capability
                ;






ID       : [a-zA-Z][a-zA-Z0-9_]* ;
ESP      : [ \t\r\n]+ -> skip ;
LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
GLOBAL   : 'global';
END      : 'end';
IMPORT   : 'import';
RESOURCE : 'resource';
INT      : 'int';
VAR      : 'var';
IF       : 'if';
FI       : 'fi';
ELSE     : 'else';
EXTEND   : 'extend';
BODY     : 'body';
IN       : 'in';
NI       : 'ni';
CALL     : 'call';
FA       : 'fa';
AF       : 'af';
INITIAL  : 'inital';
CONST    : 'const';
RETURNS  : 'returns';
RETURN   : 'return';
TO       : 'to';
FINAL    : 'final';
OP       : 'op';
DO       : 'do';
OD       : 'od';
PROC     : 'proc';
CO       : 'co';
OC       : 'oc';
CAP      : 'cap';
SEND     : 'send';
DESTROY  : 'destroy';
BEGIN    : 'begin';
RECEIVE  : 'receive';
CREATE   : 'create';
OPTYPE   : 'optype';
BY       : 'by';
TYPE     : 'type';
NULL     : 'null';
BOOL     : 'bool';
VAL      : 'val';
RES      : 'res';
REF      : 'ref';
EXIT     : 'exit';
NEXT     : 'next';
FILE     : 'file';
PRIVATE  : 'private';
OR       : 'or';
INDEX    : 'index';
WRITE    : 'write';
READ     : 'read';
MOD      : 'mod';
STOP     : 'stop';
PROCEDURE: 'procedure';
AND      : 'and';
REAL     : 'real';
ON       : 'on';
ROW      : 'row';
TRUE     : 'true';
SENDER   : 'sender';
LEFT     : 'left';
UP       : 'up';
ABORT    : 'abort';
REPLY    : 'reply';
PROCESS  : 'process';
CHAR     : 'char';
STRING   : 'string';
FALSE    : 'false';
LOW      : 'low';
HIGH     : 'high';
NEW      : 'new';
ENUM     : 'enum';
ANY      : 'any';
REC      : 'rec';
UNION    : 'union';
VM       : 'vm';
XOR      : 'xor';
SKIP     : 'skip';
FORWARD  : 'forward';
V        : 'V';
P        : 'P';
EJECUTA  : '->';
NUM      : ( '-'?[0-9]+ | '-'?[0-9]+( | [.][0-9]+) ) ;
SEPARA   : '[]';
ASIGNACION : ':=';
SWAP       : ':=:';
INCREMENTO : '++';
DECREMENTO : '--';
DESPLAZAR_IZQ : '<<';
DESPLAZAR_DER : '>>';
AUG        : ( '+:=' | '-:=' | '*:=' | '/:=' | '%:=' | '+:=' | '**:=' );
OPERADOR_ARITMETICO    : ('+' | '-' | '*' | '/' | '%' | '**' );
OPERADOR_COMPARACION   : ( '=' | '>' | '<' | '<=' | '>=' | '!=' );
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');

