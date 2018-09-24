# Generated from Voyager.g4 by ANTLR 4.7.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 ")
        buf.write("\20\4\2\t\2\4\3\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3")
        buf.write("\3\3\3\3\3\2\2\4\2\4\2\3\3\2\3\7\2\16\2\7\3\2\2\2\4\r")
        buf.write("\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2")
        buf.write("\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\2\2\3\f\3\3\2\2\2\r")
        buf.write("\16\t\2\2\2\16\5\3\2\2\2\3\t")
        return buf.getvalue()


class VoyagerParser ( Parser ):

    grammarFileName = "Voyager.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", 
                      "ENTERO", "FLOTANTE", "TEXTO", "BOOL", "ABRE_PAREN", 
                      "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
                      "SEMI_COLON", "DOUBLE_DOT", "DOT", "SUMA", "RESTA", 
                      "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", "NO_IGUAL", 
                      "CTE_STRING", "CTE_E", "CTE_F", "ID", "NEWLINE", "TEXT" ]

    RULE_voyager = 0
    RULE_line = 1

    ruleNames =  [ "voyager", "line" ]

    EOF = Token.EOF
    FUNC=1
    VAR=2
    IMPRIMIR=3
    SI=4
    SINO=5
    ENTERO=6
    FLOTANTE=7
    TEXTO=8
    BOOL=9
    ABRE_PAREN=10
    CIERRA_PAREN=11
    ABRE_BRACKET=12
    CIERRA_BRACKET=13
    SEMI_COLON=14
    DOUBLE_DOT=15
    DOT=16
    SUMA=17
    RESTA=18
    DIV=19
    MULT=20
    IGUAL=21
    MAS_QUE=22
    MENOS_QUE=23
    NO_IGUAL=24
    CTE_STRING=25
    CTE_E=26
    CTE_F=27
    ID=28
    NEWLINE=29
    TEXT=30

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class VoyagerContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(VoyagerParser.EOF, 0)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(VoyagerParser.LineContext)
            else:
                return self.getTypedRuleContext(VoyagerParser.LineContext,i)


        def getRuleIndex(self):
            return VoyagerParser.RULE_voyager

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVoyager" ):
                listener.enterVoyager(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVoyager" ):
                listener.exitVoyager(self)




    def voyager(self):

        localctx = VoyagerParser.VoyagerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_voyager)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 4
                self.line()
                self.state = 7 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << VoyagerParser.FUNC) | (1 << VoyagerParser.VAR) | (1 << VoyagerParser.IMPRIMIR) | (1 << VoyagerParser.SI) | (1 << VoyagerParser.SINO))) != 0)):
                    break

            self.state = 9
            self.match(VoyagerParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LineContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNC(self):
            return self.getToken(VoyagerParser.FUNC, 0)

        def VAR(self):
            return self.getToken(VoyagerParser.VAR, 0)

        def IMPRIMIR(self):
            return self.getToken(VoyagerParser.IMPRIMIR, 0)

        def SI(self):
            return self.getToken(VoyagerParser.SI, 0)

        def SINO(self):
            return self.getToken(VoyagerParser.SINO, 0)

        def getRuleIndex(self):
            return VoyagerParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)




    def line(self):

        localctx = VoyagerParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << VoyagerParser.FUNC) | (1 << VoyagerParser.VAR) | (1 << VoyagerParser.IMPRIMIR) | (1 << VoyagerParser.SI) | (1 << VoyagerParser.SINO))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





