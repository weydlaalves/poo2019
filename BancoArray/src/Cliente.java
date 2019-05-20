import java.util.ArrayList;

public class Cliente {
	String id;
	ArrayList<Conta>contas;
	public Cliente(String id) {
		
		this.id = id;
		new ArrayList<Conta>();
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", contas=" + contas + "]";
	}
	

}
