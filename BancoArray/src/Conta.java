
public class Conta {
	int num;
	double saldo;
	public Conta(int num, double saldo) {
		this.num = num;
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [num=" + num + ", saldo=" + saldo + "]";
	}
public class ContaP extends Conta{
	double juros;

	public ContaP(int num, double saldo, double juros) {
		super(num, saldo);
		this.juros = juros;
	}
	public String toString() {
		return super.toString()+ "CP";
	}
public class ContaC extends Conta{
	double taxad;

	public ContaC(int num, double saldo, double taxad) {
		super(num, saldo);
		this.taxad = taxad;
	}
	public String toString() {
		return super.toString()+ " CC";
	}
}
}
	
}
