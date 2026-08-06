parser grammar PythonParser;

@header {}


options { tokenVocab=PythonLexer; }

prog
    : NEWLINE* (statement)* EOF         # Program
    ;

statement
    : compound_stmt+                          # SimpleStatement
    ;

suite
    : compound_stmt+                          # SimpleSuite
    | NEWLINE INDENT compound_stmt+ DEDENT    # CompoundSuite
    | NEWLINE INDENT PASS DEDENT              # PassSuite
    ;

compound_stmt
    : if_stmt      NEWLINE?      # IfStatement
    | assign_stmt  NEWLINE?      # AssignmentStatement
    | atom_expr    NEWLINE?      # AtomExpression
    | simple_expr  NEWLINE?      # SimpleExpression
    | for_loop     NEWLINE?      # ForLoopStatement
    | python_expr  NEWLINE?      # PythonExpression
    | func_def     NEWLINE?      # FunctionDefinition
    | class_def    NEWLINE?      # ClassDefinition
    | return_stmt  NEWLINE?      # ReturnStatement
    | import_stmt  NEWLINE?      # ImportStatement
    | import_from  NEWLINE?      # ImportFromStatement
    | global_stmt  NEWLINE?      # GlobalStatement
    | del_stmt     NEWLINE?      # DeleteStatement
    | try_stmt     NEWLINE?      # TryStatement
    | PASS         NEWLINE?      # PassStatement
    | NEWLINE                    # BlankStatement
    ;

import_stmt
    : IMPORT NAME (DOT NAME)* (AS NAME)?   # ImportDef
    ;

del_stmt
    : DEL atom_expr                        # DelDef
    ;

try_stmt
    : TRY COLON suite except_clause+ (ELSE COLON suite)? (FINALLY COLON suite)?  # TryExceptDef
    ;

except_clause
    : EXCEPT (atom (AS NAME)?)? COLON suite  # ExceptClauseDef
    ;

class_def
    : CLASS (NAME | CLASS_NAME) (LP arglist? RP)? COLON suite
    ;

return_stmt
    : RETURN condition        # ConditionReturn
    | RETURN python_expr      # ComplexReturn
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*    # GlobalStatementDef
    ;

import_from
    : FROM NAME (DOT NAME)* IMPORT imptd (COMMA imptd)* # ImportFromDef
    ;

imptd
    : (NAME | CLASS_NAME) (AS (NAME | CLASS_NAME))?   # Imported
    ;

if_stmt
    : IF condition COLON suite
     ( ELIF condition COLON suite )*
     ( ELSE COLON suite )? # IfStatementDef
    ;

condition
    : NOT condition                        # NotExpression
    | condition AND condition              # AndCondition
    | condition OR condition               # OrCondition
    | bool_exp                             # BooleanCondition
    | python_expr (comp_op python_expr)*   # ComparisonExpression
    ;

python_expr
    : atom_expr                  # AtomComplexExpression
    | complex_expr               # ComplexExpression
    ;

atom_expr
    : atom                                          # SimpleVar
    | atom_expr LP arglist? RP                      # FunctionCall
    | atom_expr DOT atom_expr                       # MethodAccess
    | atom_expr LBRACK python_expr RBRACK           # Subscript
    | atom_expr LBRACK python_expr? COLON python_expr? (COLON python_expr?)? RBRACK  # Slice
    ;

complex_expr
    : LP for_loop RP               # Generator
    | LBRACK for_loop RBRACK       # ListComprehension
    | LKBRACE dict_maker? RKBRACE  # DictionaryLiteral
    | LKBRACE NEWLINE* atom_expr (COMMA NEWLINE* atom_expr)* COMMA? NEWLINE* RKBRACE  # SetLiteral
    | LBRACK list_items? RBRACK    # ListLiteral
    ;

comp_op
    : LT       # LessThanOperator
    | GT       # GreaterThanOperator
    | EQ       # EqualOperator
    | GTE      # GreaterEqualOperator
    | LTE      # LessEqualOperator
    | NEQ      # NotEqualOperator
    | OR       # OrOperator
    | IN       # InOperator
    | NOT IN   # NotInOperator
    | IS       # IsOperator
    | IS NOT   # IsNotOperator
    ;


assign_stmt
    : python_expr ASSIGN python_expr NEWLINE?       # PythonExpressionAssignStmt
    | python_expr ASSIGN condition NEWLINE?          # ComparisonAssignStmt
    | python_expr ASSIGN arithmetic_expr NEWLINE?    # ArithmeticAssignStmt
    | python_expr ASSIGN template_literal NEWLINE?    # TemplateLiteralAssignStmt
    | python_expr PLUS_ASSIGN python_expr NEWLINE?   # AugmentedAddStmt
    | python_expr MINUS_ASSIGN python_expr NEWLINE?  # AugmentedSubStmt
    | python_expr STAR_ASSIGN python_expr NEWLINE?   # AugmentedMulStmt
    | python_expr SLASH_ASSIGN python_expr NEWLINE?  # AugmentedDivStmt
    ;

template_literal
    : TRIPLE_QUOTE_STRING  # TemplateLiteral;

for_loop
    : FOR atom IN python_expr COLON? suite                  # SimpleForLoop
    | atom FOR atom IN python_expr (IF condition)?       # ComplexForLoop
    ;

func_def
    : dec? DEF NAME parameters COLON suite      # FunctionDefDef
    ;

dec
    : AT NAME (DOT NAME)* ( LP arglist? RP )? NEWLINE       # Decorator
    ;

parameters
    : LP fun_params? RP  # FunctionParameters
    ;

fun_params
    : NAME (COMMA NAME)* (COMMA NAME ASSIGN atom)*  # MixedParams
    | NAME ASSIGN atom (COMMA NAME ASSIGN atom)*     # KeywordParams
    ;

atom
    : NAME   # NameAtom
    | CLASS_NAME  # ClassAtom
    | NUMBER # NumberAtom
    | STRING # StringAtom
    | TRIPLE_QUOTE_STRING # TripleQuoteStringAtom
    | FSTRING # FStringAtom
    | NONE   # NoneAtom
    | bool_exp # BooleanAtom
    ;

bool_exp:
    TRUE   # TrueAtom
    | FALSE  # FalseAtom
    ;

list_items
    : NEWLINE* atom_expr (COMMA NEWLINE* atom_expr)* COMMA? NEWLINE* # ListItems
    ;

dict_maker
   : NEWLINE* key_value ( COMMA NEWLINE* key_value )* COMMA? NEWLINE* # KeyValuePairs
   ;

key_value
   : atom COLON atom        # AtomKeyValue
   | atom COLON simple_expr # SimpleKeyValue
   | python_expr COLON python_expr  # ExprKeyValue
   ;

simple_expr
    : arithmetic_expr                           # ArithmeticExpression
    | condition                                 # SimpleComparisonExpression
    ;

arithmetic_expr
    : python_expr (PLUS python_expr)+           # Addition
    | python_expr (MINUS python_expr)+          # Subtraction
    | python_expr (SLASH python_expr)+          # Division
    | python_expr (STAR python_expr)+          # Multiplication
    ;

arglist
    : NEWLINE* atom (COMMA NEWLINE* atom)* COMMA? NEWLINE*            # AtomArgs
    | NEWLINE* argument (COMMA NEWLINE* argument)* COMMA? NEWLINE*    # ComplexArgs
    ;

argument
    : python_expr                 # PositionalArgument
    | NAME ASSIGN python_expr     # KeywordArgument
    ;
