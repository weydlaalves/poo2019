class Car:
    def __init__(self):
        self.passa = 0
        self.lim_passa = 2
	self.km = 0
        self.gasolina = 0
        self.lim_gasolina = 10
    
    def entrar(self):
        if self.passa < self.lim_passa:
            self.passa += 1
        else:
            print("fail: limite de pessoas atingido")

    def remover(self):
        if self.passa > 0:
            self.passa -= 1
        else:
            print("fail: nao tem ninguem no carro")
    
    def abastecer(self, qtd):
	self.gasolina += qtd        
	
	if(self.gasolina > self.lim_gasolina):
            self.gasolina = self.lim_gasolina
        
    def digirir(self, distancia):
        
	if self.passa == 0:
            print("fail: nao tem ninguem no carro")
            return

        tank = distancia / 10
        if(self.gasolina >= tank):
            self.km += distancia
            self.gasolina -= tank
        else:
            print("fail: gasolina insuficiente")


    def __str__(self):
        return "Passageiro: " + str(self.passa) + ", Gasolina: " + \
                str(self.gasolina) + ", km: " + str(self.km)

carro = Car()
line = ""
print("Digite show, in, out, gasolina _qtd, dirigir _dist, end")
while(line != "end"):
    line = input()
    ui = line.split(" ")

    if ui[0] == "end":
        break
    elif ui[0] == "show":
        print(carro)
    elif ui[0] == "in":
        carro.entrar()
    elif ui[0] == "out":
        carro.remover()
    elif ui[0] == "gasolina":
        carro.abastecer(int(ui[1]))
    elif ui[0] == "dirigir":
        carro.drive(int(ui[1])) 
    else:
        print("fail: comando invalido")