
abstract class Conta {
	
	int num;
	double saldo;
	String id;
	public Conta(int num) {
		this.num = 0;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "\n " + id + saldo;
	}
	public void depositar(double valor) {
		
	}
	public void sacar(double valor) {
		
	}
	public void transferir(double valor,int num) {
		
	}
	///abstract void atualizacao_mensal() {
		
	///}
	///abstract void operacao() {
		
	///}
}
