import java.util.ArrayList;

public class Banco {
	ArrayList<Cliente>clientes;
	ArrayList<Conta>contas;
	public Banco() {
		new ArrayList<Cliente>();
		new ArrayList<Conta>();
		
	}
	@Override
	public String toString() {
		return " " +clientes+contas;
	}
	public void addcli (Cliente c) {
		clientes.add(c);
	 	
	 	return;
	 	

	}
}

