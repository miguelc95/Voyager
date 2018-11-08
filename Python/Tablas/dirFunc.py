import Tablas.Structs.func
class dirFunc:
    dir = []

    def __init__(self):  # this method creates the class object.
        pass

    def exists(self, val):
        for item in self.dir:
            if item.nombre == val:
                return True
        return False

    def addFunc(self, val):
        self.dir.append(val)
            
            
    