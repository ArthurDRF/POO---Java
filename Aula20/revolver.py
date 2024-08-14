class Revolver:
    qtmunicao = 0
    qtMaxima = 0

    def Atirar(self):
        if self.qtMunicao > 0:
            self.qtMunicao -= 1

    def Atirar(self):
        if self.qtMunicao < self.qtMaxima:
            self.qtMunicao += 1

    def mostrar (self):
        print(self.qtMunicao)

    


