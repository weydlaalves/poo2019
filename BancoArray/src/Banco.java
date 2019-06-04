
import java.util.Map;
import java.util.TreeMap;

public class Banco {
	Map<String,Cliente>clientes; 
	Map<Integer,Conta>contas;
	public Banco() {
		clientes = new TreeMap<String,Cliente>();
		contas = new TreeMap<Integer,Conta>();
		
	}
	
	@Override
	public String toString() {
		String saida = "";
		for(Cliente cli : clientes.values()) {
			saida += cli + "\n";
		
		}return saida;
	}
	public void addcli (String id) {
		if(clientes.get(id) == null) {
		clientes.put(id,new Cliente(id));
	}
	
		
	}
}

