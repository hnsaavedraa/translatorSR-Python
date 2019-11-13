grammar SRLanguage;

components: global EOF
          | resource_specification (components)? EOF
          | resource_body EOF
          ;

global : GLOBAL ID (constant | type) END
        ;

resource_specification: RESOURCE ID (IMPORT ID)? (declarations)* (spec_body)*
                      | RESOURCE ID LPARENT (parameters)? RPARENT (declarations)* (statements)* (INITIAL block END)? (proc)+ (FINAL block END)? END
                      ;

resource_body: BODY ID (declarations)? (INITIAL block END)? (proc)+ (FINAL block END)? END
             ;

spec_body:
        END
   |   BODY ID LPARENT (parameters)? RPARENT block (INITIAL block END)? (proc)* (FINAL block END)? END (ID)?
   |   RESOURCE ID LPARENT (parameters)? RPARENT SEPARATE
   ;

proc : PROC ID LPARENT (id_subs_lp)? RPARENT (RETURNS result_id)? block END
     ;

block: (block_items)?
   ;

block_items: block_item ((';')? block_items)?
   ;

block_item: declarations
   |   statements
   |   expression
   ;

declarations: constant (declarations)?
            | type (declarations)?
            | op_type (declarations)?
            | variable
            | operation (declarations)?
            ;

constant : CONST ID ASIGNACION expression
         ;

type: TYPE ID OPERADOR_COMPARACION t type_res
    ;

op_type: OPTYPE ID OPERADOR_COMPARACION LPARENT (parameters)?  RPARENT (RETURNS result_id)?
       ;

variable: VAR id_subs (COMA id_subs)* ':' t(ASIGNACION expression)?
        | VAR id_subs (COMA id_subs)* ASIGNACION expression
        ;

subscripts: LBRACKET id_list RBRACKET
          ;

id_subs_lp: id_subs
          | id_subs_lp COMA id_subs
          ;

id_subs: ID
       | ID subscripts
       ;

id_list: expression
        | (expression COMA id_list)?
        | (expression DOSPUNTOS id_list)?
        ;

operation: OP id_subs_lp op_prototype (RETURNS result_id)?
         | OP ((id_subs_lp)? ':' ID (COMA)? )*
         ;

statements: sequential
          | op_invocation
          | op_service
          | resource_control
          | explicit_call
          | write_expr
          ;

write_expr: WRITE LPARENT write_params RPARENT;

write_params: expression (COMA write_params)*
        ;

explicit_call: CALL invocation
        ;

invocation: expression LPARENT (actuals)? RPARENT
        ;

sequential: SKP
          | variable ASIGNACION expression
          | variable INCREMENTO
          | variable DECREMENTO
          | IF expr1 EJECUTA block (SEPARA)? FI
          | DO expr1 EJECUTA block (SEPARA)? OD
          | FA quantifier1 EJECUTA block AF
          | EXIT
          | NEXT
          ;

op_invocation: (CALL)? expression
             | SEND invocation
             | CO (quantifier)? (CALL)? operation (expression)? (EJECUTA block)? OC
             ;

op_service: IN (in_cmd)* NI
          | RECEIVE operation (variable)?
          | RETURN
          | REPLY
          ;

in_cmd: (quantifier)? qualified_id (subscripts)? LPARENT (id_list)? RPARENT ('&' expr1)? (BY expression)? (RETURNS result_id)? EJECUTA block (SEPARA)?
    ;

resource_control: ID ASIGNACION CREATE ID LPARENT (actuals)? RPARENT (ON ID)?
                | DESTROY expression
                ;

t: basic_type
   |   enum_def
   |   pointer_def
   |   record_def
   |   union_def
   |   capability_def (t)?
   |   qualified_id
   ;

basic_type:
       BOOL
   |   CHAR
   |   INT
   |   FILE
   |   REAL
   ;

enum_def:
       ENUM LPARENT id_list RPARENT
   ;

pointer_def:
       PTR type
   |   PTR ANY
   ;

record_def:
       REC LPARENT  id_subs_lp ':' t(ASIGNACION expression)? RPARENT
      | REC LPARENT id_subs_lp ASIGNACION expression RPARENT
   ;

union_def:
       UNION LPARENT id_subs_lp ':' t(ASIGNACION expression)? RPARENT
     | UNION LPARENT id_subs_lp ASIGNACION expression RPARENT
   ;

capability_def:
      CAP cap_for
   ;

cap_for:
       qualified_id
   |   op_prototype
   |   SEM
   |   VM
   ;

prototype: LPARENT parameters RPARENT (RETURNS result_id)?
    ;

op_prototype: prototype (LBRACE op_res RBRACE)?
    ;

op_res: CALL
    | SEND
    | CALL ',' SEND
    | SEND ',' CALL
    ;

result_id: t
        | (id_subs_lp ':' t)?
        ;

type_res: (LBRACE ID RBRACE)?
        ;

parameters: parameters2
        | parameters2 ';' parameters
        ;

parameters2: id_subs_lp ':' t
            ;

expression: expr1 op_log expression
          | EXCLAMACION expr1 //Negacion
          | expr1
          | expr1 ASIGNACION expression
          | (ID)? LPARENT (actuals)? RPARENT
          ;

op_log: '&' //AND
      | '||' //OR
      ;

expr1: expr2 OPERADOR_COMPARACION expr2
     | expr2
     ;

expr2: expr3 OPERADOR_ARITMETICO expr2
     | expr3 AUG expr2
     | expr3
     ;

expr3: ID
     | NUM
     | TRUE
     | FALSE
     | id_subs_lp
     | qualified_id
     | CADENA
     | NULL
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

step_opt: (BY expression)?
        ;

such_that_opt: (SUCHTHAT expression)?
            ;

actuals: expression
       | expression ',' actuals
       ;

qualified_id:
        ID
      | ID PUNTO ID
      | ID PUNTO ID LPARENT id_subs_lp RPARENT
      ;

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
LPARENT  : '(';
RPARENT  : ')';
LBRACKET : '[';
RBRACKET : ']';
COMA     : ',';
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
PTR      : 'ptr';
UNION    : 'union';
VM       : 'vm';
SEM      : 'sem';
XOR      : 'xor';
SKP     : 'skip';
FORWARD  : 'forward';
SEPARATE : 'separate';
WRITE    : 'write';
V        : 'V';
P        : 'P';
EJECUTA  : '->';
NUM      : ( '-'?[0-9]+ | '-'?[0-9]+( | [.][0-9]+) ) ;
SEPARA   : '[]';
LBRACE   : '{' ;
RBRACE   : '}' ;
ASIGNACION : ':=';
SWAP       : ':=:';
INCREMENTO : '++';
DECREMENTO : '--';
DESPLAZAR_IZQ : '<<';
DESPLAZAR_DER : '>>';
EXCLAMACION : '!';
PUNTO: '.';
DOSPUNTOS: ':';
AUG        : ( '+:=' | '-:=' | '*:=' | '/:=' | '%:=' | '+:=' | '**:=' );
OPERADOR_ARITMETICO    : ('+' | '-' | '*' | '/' | '%' | '**' );
OPERADOR_COMPARACION   : ( '=' | '>' | '<' | '<=' | '>=' | '!=' );
CADENA          : ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');
ESP      : [ \t\r\n]+ -> skip ;
LINE_COMMENT   : '#' ~[\r\n]* -> skip ;
ID       : [a-zA-Z][a-zA-Z0-9_]* ;