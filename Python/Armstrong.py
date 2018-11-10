import json
from Tablas.dirFunc import dirFunc
from Tablas.Structs.func import func
from VoyagerListener import VoyagerListener



class Armstrong(VoyagerListener):
    listFunc = []
    tablaFunc = dirFunc()

    def __init__(self):
        pass

        

        

    def enterFunc(self, ctx):
        print(ctx.ID().getText())
        if self.tablaFunc.exists(ctx.ID().getText()):
            print ("Error ya existe una función con ese nombre")
        else:
            funcObj = func(ctx.typefunc().getText(), ctx.ID().getText())
            funcTemp = funcObj
            self.tablaFunc.addFunc(funcTemp)

    def exitFunc(self, ctx):
        pass

    def enterProgram(self, ctx):
        print(ctx.PROGRAMA())

    def enterVoyager(self, ctx):
        pass

    def enterImprimir(self, ctx):
        pass

