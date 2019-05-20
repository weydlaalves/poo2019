
public class Conta_C extends Conta {
	int taxaAd;
	public Conta_C(int numerador, double saldo) {
		super(numerador,saldo);
	}
	@Override
	public String toString() {
		return super.toString()+taxaAd;
	}

}
