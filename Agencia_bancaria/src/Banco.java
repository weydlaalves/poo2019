import java.util.TreeMap;

public class Banco {
	TreeMap<String,Cliente> clientes = new TreeMap<>();
	TreeMap<Integer,Conta>contas= new TreeMap<>();
	
	
	
	
	@Override
	public String toString() {
		return " " +clientes +  contas ;
	}




	public void addcli(Cliente c) {
		clientes.put("",c);
	
	
		return;
		
	}
	
	

}
