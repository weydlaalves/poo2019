
public class Conta_P extends Conta{
	double juros;
	
	public Conta_P(int numerador, double saldo) {
		super(numerador, saldo);
	}
	
	@Override
	public String toString() {
		return  super.toString()+juros;
	}
	

	

	
}
