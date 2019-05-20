import java.util.ArrayList;

public class Banco {
	ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	ArrayList<Conta>contas = new ArrayList<Conta>(); ;
	
	@Override
	public String toString() {
		return " "  +clientes+contas;
	}
	public void addcli (Cliente c,Conta cc ,Conta cp) {
		clientes.add(c);
		contas.add(cc);
		contas.add(cp);
		
	}
	public void addcontas (Conta cb) {
		contas.add(cb);
		
	}
}

