from Tablas import dirFunc
from VoyagerListener import VoyagerListener



class Armstrong(VoyagerListener):

    def __init__(self):
        print("Armstrong")
        listFunc = []
        tablaFunc = dirFunc

    def enterFunc(self, ctx):
       print(ctx.ID())

    def exitFunc(self, ctx):
       print(ctx.getText())

    def enterProgram(self, ctx):
        print(ctx.PROGRAMA())

    def enterVoyager(self, ctx):
        print(ctx.program())

    def enterImprimir(self, ctx):
        print(ctx.getText())

