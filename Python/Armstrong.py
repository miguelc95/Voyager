import json
from Tablas.dirFunc import dirFunc
from Tablas.Structs.func import func
from Tablas.Structs.variable import variable
from VoyagerListener import VoyagerListener
from collections import deque



class Armstrong(VoyagerListener):
    listFunc = []
    tablaFunc = dirFunc()
    """pilaO operandos"""
    PilaO = []
    PTypes = []
    POper = []
    Quad = deque([])
    dirConst = {}
    dir = -1

    actualCtx = ""

    def __init__(self):
        pass

        

        

    def enterFunc(self, ctx):
        self.actualCtx = ctx.ID().getText()
        if self.tablaFunc.exists(ctx.ID().getText()):
            print ("Error ya existe una función con ese nombre")
        else:
            self.actualCtx = ctx.ID().getText();
            """reset locales y temporales"""
            funcObj = func(ctx.typefunc().getText(), ctx.ID().getText())
            self.actualCtx = ctx.ID().getText()
            for i, nombre in enumerate(ctx.parametros().ID()):
                varObj = variable(nombre.getText(), ctx.parametros().tipo()[i].getText())
                funcObj.addVariable(varObj)
                funcObj.addParamType(ctx.parametros().tipo()[i].getText())
                """print(ctx.parametros().tipo()[i].getText())
                print(nombre.getText())
                funcObj.printFunc()"""
            self.tablaFunc.addFunc(ctx.ID().getText(), funcObj)

    def exitFunc(self, ctx):
        """Hacer proceso cambiar contexto a global"""
        self.actualCtx = 'global'
        """RESETEAR LOCALES Y TEMPORALES DE ECHO"""
        pass

    def enterProgram(self, ctx):
        print(ctx.PROGRAMA())

    def enterVoyager(self, ctx):
        pass

    def enterImprimir(self, ctx):
        pass

    # Enter a parse tree produced by VoyagerParser#factor.
    def enterFactor(self, ctx):
        pass

    # Exit a parse tree produced by VoyagerParser#factor.
    def exitFactor(self, ctx):
        pass

    def enterOperando(self, ctx):
        if ctx.CTE_E() is not None:
            cteE = int(ctx.CTE_E().getText())

            if cteE in self.dirConst:
                self.dir = self.dirConst[cteE]
            else:
                """ insertar cte dirConst, asignandole una nueva dir
                dir = nueva dir
                self.dirConst[cteN] = dir
                """
            self.PilaO.append(self.dir)
            self.PTypes.append("entero")

        elif ctx.CTE_F() is not None:
            cteF = float(ctx.CTE_F().getText())

            if cteF in self.dirConst:
                self.dir = self.dirConst[cteF]
            else:
                """ insertar cte dirConst, asignandole una nueva dir
                dir = nueva dir
                self.dirConst[cteN] = dir
                """
            self.PilaO.append(self.dir)
            self.PTypes.append("flotante")

        elif ctx.CTE_C() is not None:
            cteC = ctx.CTE_C().getText()

            if cteC in self.dirConst:
                self.dir = self.dirConst[cteC]
            else:
                """ insertar cte dirConst, asignandole una nueva dir
                dir = nueva dir
                self.dirConst[cteN] = dir
                """
            self.PilaO.append(self.dir)
            self.PTypes.append("char")

        elif ctx.ID() is not None:
            id = ctx.ID().getText()
            var = self.tablaFunc.dir[self.actualCtx].getVarByName(id);

            if var is not None:
                self.PilaO.append(var.dir_virtual)
                self.PTypes.append(var.tipo)
                """elif checar con var globales"""
            else:
                print ("Error la variable no está declarada")
            """checar caso llamada y vector"""
        else:
            cteB = ctx.getText()

            """ tener ya definidas dir para true y false"""

            if cteB == "verdadero":
                """Meter dirección de verdadero a dir = """
                self.dir = self.dirConst["verdadero"]
            else:
                self.dir = self.dirConst["falso"]
            self.PilaO.append(self.dir)
            self.PTypes.append("bool")

        """checar caso llamada y vector"""


