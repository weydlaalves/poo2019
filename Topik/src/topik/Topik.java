package topik;
import java.util.ArrayList;
import java.util.Scanner;

class Topik {
	 ArrayList<Passageiro> assentos ; 
	 int qtd_prioridade;
	 
	 public Topik(int capacidade, int qtd_prioridade) {
		assentos = new ArrayList<Passageiro>();
		for(int i = 0; i < capacidade; i++) {
				assentos.add(null);
		}
		this.qtd_prioridade = qtd_prioridade;
	}
	@Override
	public String toString() {
		String saida = "[";
		for(int i = 0; i< this.assentos.size() ; i++) {
			if(i < this.qtd_prioridade) {	
				saida += (" @");
			}else {
				saida += (" ="); 
			}if (assentos.get(i) != null) {
				saida += assentos.get(i);
			}	
		}
		return saida + " ]";
	}
	
	public boolean embarcar(int inicio,int fim, Passageiro pass) {
		for(int i = inicio ; i< fim ; i++) {
			if (this.assentos.get(i) == null) {
				this.assentos.set(i,pass);
				return true;
				
			}
		}return false;
	}
	
	public void embarcar (Passageiro p) {
		if(p.preferencial()){
			embarcar(0,this.assentos.size(),p);
					
		}else {
			if(!embarcar(this.qtd_prioridade,this.assentos.size(),p)){
				embarcar(0,this.assentos.size(),p);
				
							
			}
		}
	}	
	public boolean remover(String id) {
		for(int i =0; i < this.assentos.size(); i++) {
			if(this.assentos.get(i) != null) {	
				if(this.assentos.get(i).id.equals(id)) {
					this.assentos.set(i,null);
					return true;
				}
			}
				
		}return false;	
	}
}
	class Passageiro {
	  public String id ;
	  public int idade;
	 
	public Passageiro (String id,int idade) {
		this.id = id;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return this.id + ":" + this.idade;
	}
	public boolean preferencial() {
		return(idade >= 60);
		
	}
 }
 
	  

 
