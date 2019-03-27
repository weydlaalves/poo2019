class Calc:

    def __init__(self,M):
        self.bateria = 0
        self.bateria_max = max

    def __str__(self):
        return("bateria inicial: ,"+  str(self.bateria) +"bateria max:"+ str(self.bateria_max))

    def recarregar_bateria(self,carga):
        self.bateria =+ carga
        if self.bateria > self.bateria_max:
            self.bateria = self.bateria_max

    def gastar_bateria(self):
        if (self.bateria == 0):
            print("erro:bateria insuficiente")
            return False

         else:
            self.bateria -= 1:
            return True
    def soma(self,v1,v2):
         if(self.gastar_bateria()):
		print(a + b)

    def divisao(self,v1,v2):
        d=v1/v2

cal = Calc(0)


print("Digite :  init,show,recarregar,somar v1 e v2 ou dividir v1 e v2")

while True:

    ui = input().split(" ")
    if ui[0] == "end":
        break
    elif ui[0] == "init":
        cal = Calc(int(ui[1]))
    elif ui[0] == "show":
        print(cal)
    elif ui[0] == "recarregar":
        cal.recarregar(int(ui[1]))
    elif ui[0]=="somar v1 e v2":
        print(cal.soma)
    elif ui[0] == "dividir v1 e v2":
        print(cal.divisao)