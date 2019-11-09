grammar SLLanguage;


components: global
          | resource_specification
          | resource_body
          | proc
          | block
          ;


global : GLOBAL ID (constant | type) END
        ;

resource_specification: SPEC ID (IMPORT ID)? (constant|type|operation)?
                       |RESOURCE ID('(' (parameters)?')') (SEPARA)?
                       ;

resource_body: BODY ID  (declarations)? (INITIAL block END)? proc (FINAL block END)? END
             ;


proc : PROC ID (id_list)?  (RETURNS result_id)? block
     ;

block: (declarations)? statements
     ;

declarations: constant
            | type
            | op_type
            | variable
            | operation
            ;
constant : CONST ID EQUAL expression
         ;

type: TYPE ID EQUAL t type_res
    ;

op_type: OPTYPE ID EQUAL (parameters)? (RETURNS result_id)?
       ;

variable: VAR ID (subscripts)? ':' type(ASIGNACION expression)?
        ;

operation: OP ID (subscripts)?  (parameters)? (RETURNS result_id)?
         | OP ID (subscripts)? ID
         ;

statements: sequential
          | op_invocation
          | op_service
          | resource_control
          ;

sequential: SKP
          | variable ASIGNACION expression
          | variable INCREMENTO
          | variable DECREMENTO
          | IF expr1 EJECUTA block SEPARA FI
          | DO expr1 EJECUTA block SEPARA OD
          | FA quantifier2 EJECUTA block AF
          | EXIT
          | NEXT
          ;

op_invocation: (CALL)? operation (expression)?
             | SEND operation (expression)?
             | CO (quantifier)? (CALL)? operation '('(expression)?')' (EJECUTA block)? OC
             ;

op_service: IN (quantifier)? operation (id_list)? ('&' expr1)? (BY expression)? EJECUTA block SEPARA NI
          | RECEIVE operation (variable)?
          | RETURN
          | REPLY
          ;

resource_control: ID ASIGNACION CREATE ID (actuals)? (ON ID)?
                | DESTROY ID
                ;

t: ID
    | INT
    | BOOL
    ;

parameters: parameters2
        | parameters2 ';' parameters
        | /*epsilon*/
        ;

parameters2: id_list ':' t
            ;

id_list: ID
        | ID ',' id_list
        | /*epsilon*/
        ;

result_id: t
        | id_list ':' t
        | /*epsilon*/
        ;

type_res: LBRACE ID RBRACE
        | /*epsilon*/
        ;

subscripts: LBRACKET id_list RBRACKET
          | /*epsilon*/
          ;

expression: expr1 op_log expression
          | '!' expr1 //Negacion
          | expr1
          ;

op_log: '&' //AND
      | '|' //OR
      ;

expr1: expr2 OPERADOR_COMPARACION expr2
     | expr2
     ;

expr2: expr3 OPERADOR_ARITMETICO expr2
     | expr3
     ;

expr3: ID
     | NUM
     | TRUE
     | FALSE
     ;

quantifier: '(' quantifier1 ')'
          ;

quantifier1: quantifier2
           | quantifier2 ',' quantifier1
           ;

quantifier2: ID ASIGNACION expression direction expression step_opt such_that_opt
           ;

direction: TO
          | DOWNTO
          ;

step_opt: BY expression
        | /*epsilon*/
        ;

such_that_opt: SUCHTHAT expression
            | /*epsilon*/
            ;

actuals: expression
       | expression ',' actuals
       ;

ID       : [a-zA-Z][a-zA-Z0-9_]* ;
ESP      : [ \t\r\n]+ -> skip ;
LINE_COMMENT   : '#' ~[\r\n]* -> skip ;
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
LBRACKET : '(';
RBRACKET : ')';
INITIAL  : 'inital';
CONST    : 'const';
RETURNS  : 'returns';
RETURN   : 'return';
TO       : 'to';
DOWNTO   : 'downto';
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
SUCHTHAT : 'st';

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
SKP     : 'skip';
FORWARD  : 'forward';
V        : 'V';
P        : 'P';
EJECUTA  : '->';
NUM      : ( '-'?[0-9]+ | '-'?[0-9]+( | [.][0-9]+) ) ;
SEPARA   : '[]';
LBRACE   : '{' ;
RBRACE   : '}' ;
ASIGNACION : ':=';
EQUAL : '=';
SWAP       : ':=:';
INCREMENTO : '++';
DECREMENTO : '--';
DESPLAZAR_IZQ : '<<';
DESPLAZAR_DER : '>>';
AUG        : ( '+:=' | '-:=' | '*:=' | '/:=' | '%:=' | '+:=' | '**:=' );
OPERADOR_ARITMETICO    : ('+' | '-' | '*' | '/' | '%' | '**' );
OPERADOR_COMPARACION   : ( '=' | '>' | '<' | '<=' | '>=' | '!=' );
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');