from Structs import func

class dirfunc:
    def __init__(self):
        dir = []
    
    def exists(self,val):
        for item in self.dir:
            if item.nombre == val:
                return True
        return False
            
            
    