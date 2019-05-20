
public class ContaPoupanca extends Conta {
	double juros;

	public ContaPoupanca(int num, double saldo, double juros) {
		super(num, saldo);
		this.juros = juros;
	}
	public String toString() {
		return super.toString()+ "CP";
	}
}
