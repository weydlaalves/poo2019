
public class ContaCorrente extends Conta {
	double taxad;

	public ContaCorrente(int num, double saldo, double taxad) {
		super(num, saldo);
		this.taxad = taxad;
	}
	public String toString() {
		return super.toString()+ " CC";
	}


}
