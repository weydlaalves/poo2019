
public class Conta {
	
	int num;
	double saldo;
	String id;
	public Conta(int num, double saldo) {
		this.num = 0;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\n " + id + saldo;
	}
}
