public class Calc {
	
	 int bateria = 0;
	 int bateria_max ;
	 
	 public Calc(int bateria_max) {
		 this.bateria = 0;
		 this.bateria_max = bateria_max;
	 }	 
	public int getBateria() {
		return bateria;
	}
	public int getBateria_max() {
		return bateria_max;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public void setBateria_max(int bateria_max) {
		this.bateria_max = bateria_max;
	}
public boolean gastar_bateria() {
	if (this.bateria == 0) { 
		System.out.println("bateria insuficiente");
	return false;
	}
	this.bateria -=1;
	return true;
}
@Override
public String toString() {
	return "Calc [bateria = " + this.bateria + "]";
}

public void carregar(int valor) {
	if(valor < 0) {
		return;
	}
	this.bateria += valor;
	if(this.bateria > this.bateria_max) {
			this.bateria = bateria_max;	
	}
}
public String soma (int v1,int v2) {
	if (gastar_bateria()) {
	return ""+(v1+v2);
}
	return " ";
}
public  String divisao (int v1, int v2) {
	if (!gastar_bateria()) {
		return "";
	}
	if(v2 == 0) {
		System.out.println("valor nao pode ser dividido");
		return "";
	}
	return ""+(v1/v2);		
}
}


