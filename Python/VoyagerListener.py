# Generated from Voyager.g4 by ANTLR 4.7.1
from antlr4 import *
from Python import Armstrong

if __name__ is not None and "." in __name__:
    from .VoyagerParser import VoyagerParser
else:
    from VoyagerParser import VoyagerParser

# This class defines a complete listener for a parse tree produced by VoyagerParser.
class VoyagerListener(ParseTreeListener):

    # Enter a parse tree produced by VoyagerParser#voyager.
    def enterVoyager(self, ctx:VoyagerParser.VoyagerContext):
        pass

    # Exit a parse tree produced by VoyagerParser#voyager.
    def exitVoyager(self, ctx:VoyagerParser.VoyagerContext):
        pass


    # Enter a parse tree produced by VoyagerParser#program.
    def enterProgram(self, ctx:VoyagerParser.ProgramContext):
        pass

    # Exit a parse tree produced by VoyagerParser#program.
    def exitProgram(self, ctx:VoyagerParser.ProgramContext):
        pass


    # Enter a parse tree produced by VoyagerParser#bloqueprogram.
    def enterBloqueprogram(self, ctx:VoyagerParser.BloqueprogramContext):
        pass

    # Exit a parse tree produced by VoyagerParser#bloqueprogram.
    def exitBloqueprogram(self, ctx:VoyagerParser.BloqueprogramContext):
        pass


    # Enter a parse tree produced by VoyagerParser#bloque1.
    def enterBloque1(self, ctx:VoyagerParser.Bloque1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#bloque1.
    def exitBloque1(self, ctx:VoyagerParser.Bloque1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#bloque2.
    def enterBloque2(self, ctx:VoyagerParser.Bloque2Context):
        pass

    # Exit a parse tree produced by VoyagerParser#bloque2.
    def exitBloque2(self, ctx:VoyagerParser.Bloque2Context):
        pass


    # Enter a parse tree produced by VoyagerParser#bloque3.
    def enterBloque3(self, ctx:VoyagerParser.Bloque3Context):
        pass

    # Exit a parse tree produced by VoyagerParser#bloque3.
    def exitBloque3(self, ctx:VoyagerParser.Bloque3Context):
        pass


    # Enter a parse tree produced by VoyagerParser#func.
    def enterFunc(self, ctx:VoyagerParser.FuncContext):
        pass

    # Exit a parse tree produced by VoyagerParser#func.
    def exitFunc(self, ctx:VoyagerParser.FuncContext):
        pass


    # Enter a parse tree produced by VoyagerParser#typeid.
    def enterTypeid(self, ctx:VoyagerParser.TypeidContext):
        pass

    # Exit a parse tree produced by VoyagerParser#typeid.
    def exitTypeid(self, ctx:VoyagerParser.TypeidContext):
        pass


    # Enter a parse tree produced by VoyagerParser#func1.
    def enterFunc1(self, ctx:VoyagerParser.Func1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#func1.
    def exitFunc1(self, ctx:VoyagerParser.Func1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#func2.
    def enterFunc2(self, ctx:VoyagerParser.Func2Context):
        pass

    # Exit a parse tree produced by VoyagerParser#func2.
    def exitFunc2(self, ctx:VoyagerParser.Func2Context):
        pass


    # Enter a parse tree produced by VoyagerParser#bloquefunc1.
    def enterBloquefunc1(self, ctx:VoyagerParser.Bloquefunc1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#bloquefunc1.
    def exitBloquefunc1(self, ctx:VoyagerParser.Bloquefunc1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#typefunc.
    def enterTypefunc(self, ctx:VoyagerParser.TypefuncContext):
        pass

    # Exit a parse tree produced by VoyagerParser#typefunc.
    def exitTypefunc(self, ctx:VoyagerParser.TypefuncContext):
        pass


    # Enter a parse tree produced by VoyagerParser#bloquefunc.
    def enterBloquefunc(self, ctx:VoyagerParser.BloquefuncContext):
        pass

    # Exit a parse tree produced by VoyagerParser#bloquefunc.
    def exitBloquefunc(self, ctx:VoyagerParser.BloquefuncContext):
        pass


    # Enter a parse tree produced by VoyagerParser#bloque.
    def enterBloque(self, ctx:VoyagerParser.BloqueContext):
        pass

    # Exit a parse tree produced by VoyagerParser#bloque.
    def exitBloque(self, ctx:VoyagerParser.BloqueContext):
        pass


    # Enter a parse tree produced by VoyagerParser#vector.
    def enterVector(self, ctx:VoyagerParser.VectorContext):
        pass

    # Exit a parse tree produced by VoyagerParser#vector.
    def exitVector(self, ctx:VoyagerParser.VectorContext):
        pass


    # Enter a parse tree produced by VoyagerParser#vector1.
    def enterVector1(self, ctx:VoyagerParser.Vector1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#vector1.
    def exitVector1(self, ctx:VoyagerParser.Vector1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#estatuto.
    def enterEstatuto(self, ctx:VoyagerParser.EstatutoContext):
        pass

    # Exit a parse tree produced by VoyagerParser#estatuto.
    def exitEstatuto(self, ctx:VoyagerParser.EstatutoContext):
        pass


    # Enter a parse tree produced by VoyagerParser#asignacion.
    def enterAsignacion(self, ctx:VoyagerParser.AsignacionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#asignacion.
    def exitAsignacion(self, ctx:VoyagerParser.AsignacionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#condicion.
    def enterCondicion(self, ctx:VoyagerParser.CondicionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#condicion.
    def exitCondicion(self, ctx:VoyagerParser.CondicionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#condicion1.
    def enterCondicion1(self, ctx:VoyagerParser.Condicion1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#condicion1.
    def exitCondicion1(self, ctx:VoyagerParser.Condicion1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#declaracion.
    def enterDeclaracion(self, ctx:VoyagerParser.DeclaracionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#declaracion.
    def exitDeclaracion(self, ctx:VoyagerParser.DeclaracionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#imprimir.
    def enterImprimir(self, ctx:VoyagerParser.ImprimirContext):
        pass

    # Exit a parse tree produced by VoyagerParser#imprimir.
    def exitImprimir(self, ctx:VoyagerParser.ImprimirContext):
        pass


    # Enter a parse tree produced by VoyagerParser#imprimir1.
    def enterImprimir1(self, ctx:VoyagerParser.Imprimir1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#imprimir1.
    def exitImprimir1(self, ctx:VoyagerParser.Imprimir1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#ciclo.
    def enterCiclo(self, ctx:VoyagerParser.CicloContext):
        pass

    # Exit a parse tree produced by VoyagerParser#ciclo.
    def exitCiclo(self, ctx:VoyagerParser.CicloContext):
        pass


    # Enter a parse tree produced by VoyagerParser#llamada.
    def enterLlamada(self, ctx:VoyagerParser.LlamadaContext):
        pass

    # Exit a parse tree produced by VoyagerParser#llamada.
    def exitLlamada(self, ctx:VoyagerParser.LlamadaContext):
        pass


    # Enter a parse tree produced by VoyagerParser#parametros.
    def enterParametros(self, ctx:VoyagerParser.ParametrosContext):
        pass

    # Exit a parse tree produced by VoyagerParser#parametros.
    def exitParametros(self, ctx:VoyagerParser.ParametrosContext):
        pass


    # Enter a parse tree produced by VoyagerParser#parametros1.
    def enterParametros1(self, ctx:VoyagerParser.Parametros1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#parametros1.
    def exitParametros1(self, ctx:VoyagerParser.Parametros1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#expresion.
    def enterExpresion(self, ctx:VoyagerParser.ExpresionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#expresion.
    def exitExpresion(self, ctx:VoyagerParser.ExpresionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#expresion1.
    def enterExpresion1(self, ctx:VoyagerParser.Expresion1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#expresion1.
    def exitExpresion1(self, ctx:VoyagerParser.Expresion1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#expbool.
    def enterExpbool(self, ctx:VoyagerParser.ExpboolContext):
        pass

    # Exit a parse tree produced by VoyagerParser#expbool.
    def exitExpbool(self, ctx:VoyagerParser.ExpboolContext):
        pass


    # Enter a parse tree produced by VoyagerParser#expbool1.
    def enterExpbool1(self, ctx:VoyagerParser.Expbool1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#expbool1.
    def exitExpbool1(self, ctx:VoyagerParser.Expbool1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#exp.
    def enterExp(self, ctx:VoyagerParser.ExpContext):
        pass

    # Exit a parse tree produced by VoyagerParser#exp.
    def exitExp(self, ctx:VoyagerParser.ExpContext):
        pass


    # Enter a parse tree produced by VoyagerParser#exp1.
    def enterExp1(self, ctx:VoyagerParser.Exp1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#exp1.
    def exitExp1(self, ctx:VoyagerParser.Exp1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#termino.
    def enterTermino(self, ctx:VoyagerParser.TerminoContext):
        pass

    # Exit a parse tree produced by VoyagerParser#termino.
    def exitTermino(self, ctx:VoyagerParser.TerminoContext):
        pass


    # Enter a parse tree produced by VoyagerParser#termino2.
    def enterTermino2(self, ctx:VoyagerParser.Termino2Context):
        pass

    # Exit a parse tree produced by VoyagerParser#termino2.
    def exitTermino2(self, ctx:VoyagerParser.Termino2Context):
        pass


    # Enter a parse tree produced by VoyagerParser#factor.
    def enterFactor(self, ctx:VoyagerParser.FactorContext):
        pass

    # Exit a parse tree produced by VoyagerParser#factor.
    def exitFactor(self, ctx:VoyagerParser.FactorContext):
        pass


    # Enter a parse tree produced by VoyagerParser#factor2.
    def enterFactor2(self, ctx:VoyagerParser.Factor2Context):
        pass

    # Exit a parse tree produced by VoyagerParser#factor2.
    def exitFactor2(self, ctx:VoyagerParser.Factor2Context):
        pass


    # Enter a parse tree produced by VoyagerParser#operando.
    def enterOperando(self, ctx:VoyagerParser.OperandoContext):
        pass

    # Exit a parse tree produced by VoyagerParser#operando.
    def exitOperando(self, ctx:VoyagerParser.OperandoContext):
        pass


    # Enter a parse tree produced by VoyagerParser#cte_var.
    def enterCte_var(self, ctx:VoyagerParser.Cte_varContext):
        pass

    # Exit a parse tree produced by VoyagerParser#cte_var.
    def exitCte_var(self, ctx:VoyagerParser.Cte_varContext):
        pass


    # Enter a parse tree produced by VoyagerParser#variable1.
    def enterVariable1(self, ctx:VoyagerParser.Variable1Context):
        pass

    # Exit a parse tree produced by VoyagerParser#variable1.
    def exitVariable1(self, ctx:VoyagerParser.Variable1Context):
        pass


    # Enter a parse tree produced by VoyagerParser#variable2.
    def enterVariable2(self, ctx:VoyagerParser.Variable2Context):
        pass

    # Exit a parse tree produced by VoyagerParser#variable2.
    def exitVariable2(self, ctx:VoyagerParser.Variable2Context):
        pass


    # Enter a parse tree produced by VoyagerParser#tipo.
    def enterTipo(self, ctx:VoyagerParser.TipoContext):
        pass

    # Exit a parse tree produced by VoyagerParser#tipo.
    def exitTipo(self, ctx:VoyagerParser.TipoContext):
        pass


    # Enter a parse tree produced by VoyagerParser#lee_condicion.
    def enterLee_condicion(self, ctx:VoyagerParser.Lee_condicionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#lee_condicion.
    def exitLee_condicion(self, ctx:VoyagerParser.Lee_condicionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#termina_condicion.
    def enterTermina_condicion(self, ctx:VoyagerParser.Termina_condicionContext):
        pass

    # Exit a parse tree produced by VoyagerParser#termina_condicion.
    def exitTermina_condicion(self, ctx:VoyagerParser.Termina_condicionContext):
        pass


    # Enter a parse tree produced by VoyagerParser#entra_sino.
    def enterEntra_sino(self, ctx:VoyagerParser.Entra_sinoContext):
        pass

    # Exit a parse tree produced by VoyagerParser#entra_sino.
    def exitEntra_sino(self, ctx:VoyagerParser.Entra_sinoContext):
        pass


    # Enter a parse tree produced by VoyagerParser#entra_ciclo.
    def enterEntra_ciclo(self, ctx:VoyagerParser.Entra_cicloContext):
        pass

    # Exit a parse tree produced by VoyagerParser#entra_ciclo.
    def exitEntra_ciclo(self, ctx:VoyagerParser.Entra_cicloContext):
        pass


    # Enter a parse tree produced by VoyagerParser#termina_ciclo.
    def enterTermina_ciclo(self, ctx:VoyagerParser.Termina_cicloContext):
        pass

    # Exit a parse tree produced by VoyagerParser#termina_ciclo.
    def exitTermina_ciclo(self, ctx:VoyagerParser.Termina_cicloContext):
        pass


