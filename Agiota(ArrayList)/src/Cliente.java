
public class Cliente {
	
	String id;
	String fullname;
	float saldo;

	public Cliente(String id, String fullname) {
		this.id = id;
		this.fullname = fullname;
		this.saldo = 0;
	}
	public String toString() {

		return this.id + ":"+ this.fullname +":" + this.saldo;
	}
}
