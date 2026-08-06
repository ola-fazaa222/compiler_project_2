parser grammar HtmlParser;



options { tokenVocab=HtmlLexer; }

html_content
    : html_content_item* # HtmlContent
    ;

html_content_item
    : htmlElement     # HtmlElementItem
    | HTML_TEXT       # HtmlTextItem
    | jinjaStatementBlock  # JinjaStmtItem
    | jinjaExpressionBlock # JinjaExprItem
    ;

htmlElement
    : TAG_OPEN tag_content*? (TAG_SLASH_CLOSE | TAG_CLOSE)  # TagElement
    | STYLE_OPEN style_sheet STYLE_CLOSE                    # StyleElement
    | SCRIPT_OPEN SCRIPT_CONTENT? SCRIPT_CLOSE               # ScriptElement
    ;

tag_content
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)? # HtmlAttribute
    | TAG_SLASH                             # ClosingMarker
    ;

//===============CSS RULE======================

style_sheet
    : (ruleSet | css_at_rule)* # StyleSheet
    ;

ruleSet
    : selector_decl CSS_LBRACE declarationList CSS_RBRACE   # CssRule
    ;

selector_decl
    : css_selector_list (CSS_COMMA css_selector_list)* # CssSelectorDeclaration
    ;

css_selector_list
    : css_selector (CSS_GT  css_selector )* # CssSelectorList
    | css_selector css_selector+            # CssDescendantSelector
    ;

css_selector
    : CSS_ID ( CSS_DOT CSS_ID )* (CSS_COLON CSS_ID)* (CSS_COLON CSS_COLON CSS_ID)*    # QualifiedSelector
    | ( CSS_DOT CSS_ID CSS_ID? )+ (CSS_COLON CSS_ID)* (CSS_COLON CSS_COLON CSS_ID)*   # StandaloneSimpleSelector
    | CSS_ID (CSS_HASH CSS_ID)* (CSS_COLON CSS_ID)* (CSS_COLON CSS_COLON CSS_ID)*     # TypeAndIdSelector
    | CSS_UNIVERSAL (CSS_COLON CSS_ID)? (CSS_COLON CSS_COLON CSS_ID)?                 # UniversalSelector
    | CSS_ID (CSS_COLON CSS_ID)* (CSS_COLON CSS_COLON CSS_ID)?                        # TypeSelector
    ;

declarationList
    : declaration* # DeclarationBlock
    ;

declaration
    : CSS_ID  CSS_COLON  css_value  CSS_IMPORTANT? CSS_SEMI # CssDeclaration
    ;

css_value
    : cssterm+ (CSS_COMMA cssterm+)*
    ;

css_function_args
    : cssterm+ (  CSS_COMMA  cssterm+ )* # FunctionArguments
    ;


css_function_call
    : CSS_ID CSS_LPAREN  css_function_args?  CSS_RPAREN # CssFunctionCall
    ;

cssterm
    : css_function_call         # FunctionTerm
    | CSS_STRING                # StringTerm
    | CSS_HEX_COLOR             # ColorTerm
    | CSS_MINUS? CSS_NUMBER CSS_UNIT # UnitNumberTerm
    | CSS_MINUS? CSS_NUMBER     # NumberTerm
    | CSS_ID                    # IdentifierTerm
    ;

css_at_rule
    : CSS_AT CSS_ID CSS_ID? CSS_LBRACE css_at_rule_body* CSS_RBRACE # CssAtKeyframes
    ;

css_at_rule_body
    : CSS_ID CSS_LBRACE declarationList CSS_RBRACE # CssAtKeyframeBlock
    ;

//=================jinja rules======================
jinjaStatementBlock
   : JINJA_STMT_START jStatement                    # JinjaStmtBlock
   ;

jinjaExpressionBlock
    : JINJA_EXPR_START j_expression JINJA_EXPR_END  # JinjaExprBlock
    ;

jStatement
    : j_extends_stmt # JinjaExtendsStmt
    | j_block_stmt   # JinjaBlockStmt
    | j_for_stmt     # JinjaForStmt
    | j_if_stmt      # JinjaIfStmt
    | j_with_stmt    # JinjaWithStmt
    ;

j_with_stmt
    : J_WITH J_NAME J_ASSIGN j_expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDWITH JINJA_STMT_END  # JinjaWithStmtDef
    ;

j_extends_stmt
    : J_EXTENDS J_STRING JINJA_STMT_END # JinjaExtendsStmtDef
    ;

j_block_stmt
    : J_BLOCK J_NAME JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDBLOCK ( J_NAME )? JINJA_STMT_END # JinjaBlockStmtDef
    ;

j_for_stmt
    : J_FOR J_NAME (J_COMMA J_NAME)* J_IN j_expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDFOR JINJA_STMT_END  # JinjaForStmtDef
    ;

j_if_stmt
    : J_IF j_expression JINJA_STMT_END
      html_content
      ( JINJA_STMT_START J_ELIF j_expression JINJA_STMT_END
        html_content )*
      ( JINJA_STMT_START J_ELSE JINJA_STMT_END
        html_content )?
      JINJA_STMT_START J_ENDIF JINJA_STMT_END   # JinjaIfStmtDef
    ;

j_expression
    : j_call_expr ( J_EQ | J_NEQ | J_GT | J_LT ) j_call_expr # JinjaBinaryExpr
    | j_call_expr # JinjaSimpleExpr
    ;

j_call_expr
    : j_call_expr J_PIPE j_call_expr                    # JinjaFilteredExpr
    | j_var_access J_LPAREN j_argument_list? J_RPAREN   # JinjaMethodCall
    | J_NAME J_LPAREN j_argument_list? J_RPAREN         # JinjaFunctionCall
    | j_call_expr J_LBRACK j_slice? J_RBRACK            # JinjaSliceAccess
    | j_var_access                                      # JinjaVarAccessOnly
    | j_atom                                            # JinjaAtomOnly
    ;

j_slice
    : j_expression ( J_COLON j_expression? )?
    | J_COLON j_expression?
    ;

j_var_access
    : (J_NAME | J_LENGTH) ( J_DOT (J_NAME | J_LENGTH) )*  # JinjaVarAccessOnlyDef
    ;

j_argument_list
    : j_argument ( J_COMMA j_argument )* # JinjaArgListDef
    ;

j_argument
    : j_expression                 # JinjaPosArg
    | J_NAME J_ASSIGN j_expression # JinjaKwArg
    ;

j_atom
    : J_NUMBER # JinjaNumberAtom
    | J_STRING # JinjaStringAtom
    | J_TRUE   # JinjaTrueAtom
    | J_FALSE  # JinjaFalseAtom
    | J_NONE   # JinjaNoneAtom
    | J_NAME   # JinjaNameAtom
    | J_LENGTH # JinjaLengthAtom
    ;