import variable
class func:

    def __init__(self,tipo,nombre):
        self.tipo = tipo
        self.nombre = nombre
        self.arrVariable = []
        self.parameterTable = []

    def addVariable(self,var):
        self.arrVariable.append(var)

    def addParamType(self, tipo):
        self.parameterTable.append(tipo)

    def printFunc(self):
        print(self.tipo)
        print(self.nombre)
        print(self.arrVariable)
        print(self.parameterTable)

    """def checkVar(self, nombre):
        for val in self.arrVariable:
            if val.nombre == nombre:
                return True
        return False"""


    def getVarByName(self, nombre):
        for val in self.arrVariable:
            if val.nombre == nombre:
                return val
        return None