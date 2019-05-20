abstract public class Conta {
	int numerador;
	double saldo;
	
	
	public Conta( int numerador, double saldo) {
		this.saldo = 0.00;
		this.numerador= 0;
		
	}
	@Override
	public String toString() {
		return "" + numerador+ saldo ;
	}

	
	

}

