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
		for(int i = 0; i< assentos.size() ; i++) {
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
	public void embarcar (Passageiro p) {
		if(p.preferencial()){
			for(int i = 0; i < qtd_prioridade; i++ ) {
				if(assentos.get(i) == null) {
					assentos.set(i,p);
			 		return;
				}
			}
			for(int i = qtd_prioridade; i< assentos.size(); i++) {
				if(assentos.get(i) == null) {
					assentos.set(i,p);
					return;	
				}
			}
			
		}else {
			for (int i = qtd_prioridade; i< assentos.size(); i++) {
				if(assentos.get(i) == null){
					assentos.set(i, p);
					return;
				}
			}
		}
		
	}
		void remover(String id) {
			for(int i =0; i < assentos.size(); i++) {
				Passageiro p = this.assentos.get(i);
				if((p!= null) && (p.id.equals(id))) {
				this.assentos.set(i,null);
				return;
			}
				
			System.out.println(" passageiro nao esta na topik ");		
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
 
}
	  

 
