import java.util.ArrayList;

public class Maquina {
	private int qtdMax;
	private double saldo;
	private ArrayList<Molinha> molinhas;
	
	public Maquina(int nMolinhas, int qtdMax) {
		molinhas = new ArrayList<Molinha>();
		for(int i = 0; i < nMolinhas;i++) {
			molinhas.add(new Molinha ("Vazio",0,0));
		}
		this.qtdMax = qtdMax;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setMolinhas(int ind,String nome,int qtd, double preco) {
		for(int i = 0; i < molinhas.size(); i++)
		molinhas.set(ind, new Molinha(nome,qtd,preco));	
		qtdMax+=1;	
	}
	public void comprar(int ind) {
		for(int i = 0; i < molinhas.size(); i++) {
			if(molinhas.get(i) != null) {
				if(this.qtdMax != 0) {
					
				}
			}
		}
			
	}
	public boolean inserirDinheiro(double cedula){
			setSaldo(cedula);
		return true;
	}
	
	public String toString(){
        String saida = "";
        for(int i = 0; i < molinhas.size(); i++){
            saida += i + " " + molinhas.get(i) + "\n"+"Saldo: "+getSaldo();
        }
        return saida;
    }

}
