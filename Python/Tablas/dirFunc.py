import Tablas.Structs.func
class dirFunc:
    dir = {}

    def __init__(self):  # this method creates the class object.
        pass

    def exists(self, val):
        if val in self.dir:
            return True
        return False

    def addFunc(self, nom, val):
        self.dir[nom] = val
            
            
    