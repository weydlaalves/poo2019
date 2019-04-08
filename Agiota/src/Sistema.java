import java.util.ArrayList;


public class Sistema {
	ArrayList<Cliente> clientes;
	ArrayList<Cliente> transacoes;
	float saldo;
	int count = 0;
	
	public Sistema(float saldo) {
		this.saldo = saldo;
		this.clientes = new ArrayList<Cliente>();
		this.transacoes = new ArrayList<Cliente>();
	}
	public String toString() {
		String saida = " ";
		for (Cliente cliente : clientes)
			saida +=cliente+"\n";
			saida +="Saldo: "+ this.saldo;	
		
		return saida;
	}
	public void cadastrar(Cliente cli) {
		if(this.encontrarClientes(cli.id) != null) {
			System.out.println("Id nao existe");
			return;
			}
			clientes.add(cli);
	}	
	public Cliente encontrarClientes(String id){
		for(Cliente cli : clientes) {
			if(cli.id.equals(id)) {
				return cli;
			}
		}
		return null;
	}
	public void emprestar(String id, float valor) {
		Cliente cli = encontrarClientes(id);
		
		if(cli == null) {
			System.out.println("cilente não existente");
			return;
		
		}
		if(this.saldo < valor) {
			System.out.println(" valor indisponível ");
			return;
		}
		this.saldo -= valor;
		cli.saldo += valor;
		transacoes.add(cli);
	}	
	public void historico() {
		
		for(int i = 0; i < transacoes.size(); i++) { 
			System.out.println("Id: "+i+" "+ transacoes.get(i));
		 }
	  }
	public void mostrarCliente(String id) {
		for(Cliente c : transacoes){
			if(c.id.equals(id)) {
				transacoes.add(c);
				System.out.println(transacoes);
				
			
			}
			System.out.println("cliente náo cadastrado");
			return;
		}
	
	}	//public void receber(String id, int valor) {
			//Cliente cli =  encontrarCliente(id);
			//if(cli == null) {
				//System.out.println("cliente não existente");
			//}
			//else if(valor > cli.saldo) {
				//	System.out.println(" fail: valor maior que a divida");
					//return;
			//}
				
			// cli.saldo -= valor;
		//}
			
}					

	  

