package br.com.qx.trabalho1.banco;

/**
 * @author bruno
 *
 */
public class Conta {
	/*
	 * Representa uma conta bancaria;
	 */

	

	/**
	 * Inicializa os atributos de uma conta.Os valores iniciais do limite e
	 * extrato devem ser respectivamente 100 e uma lista vazia
	 * 
	 * @param numero Numero da conta
	 * @param saldo Saldo da inicial da conta
	 */
	public Conta(int numero, double saldo) {
		
	}
	
	

	/**
	 * @return Retorna o numero da conta
	 */
	public int getNumero() {
		return 0;
	}

	/**
	 * @return o saldo da conta que é igual ao limite + o saldo
	 */
	public double getSaldo() {
		return 0;
	}
	
	
	/**
	 * @return o valor do limite da conta
	 */
	public double getLimite() {
		return 0;
	}

	/**
	 * Realiza a operacao de saque da conta.
	 * 
	 * @param valor O valor a ser retirado. Esse valor não pode ser negativo.
	 * @return false Se o valor e negativo ou nao houver saldo suficiente; true
	 *         Se valor e positivo e houver saldo suficiente;
	 */
	public boolean sacar(double valor) {
		return false;
	}

	/**
	 * Realiza o deposito na conta bancaria
	 * 
	 * @param valor O valor que deve ser depositado na conta.
	 * @return true Caso o valor seja um número positivo. Caso contrário false
	 */
	public boolean depositar(double valor) {
		return true;
	}

	/**
	 * Realiza a transferencia de uma conta para outra
	 * 
	 * @param destino Conta que deve receber o valor informado
	 * @param valor O valor que deve ser transferido para a conta de destino
	 * @return true caso a conta de origem possua saldo e o valor não for um
	 *         número negativo. false, caso a conta de origem não possua saldo
	 *         suficiente.
	 */
	public boolean transferir(Conta destino, double valor) {
		return false;
	}

	/**
	 * 
	 * Retorna a lista de operacoes realizados.
	 * 
	 * Depositos sao representados por valores positivos.
	 * Saques e transferencias sao representados por valores negativos.
	 * <br/><br/>
	 * conta = new Conta(1, 100); <br/>
	 * conta.depositar(15); <br/>
	 * conta.sacar(50); <br/>
	 * conta.verExtrato(); <br/>
	 * [15, -50] <br/>
	 * conta.transferir(conta2, 100); <br/> 
	 * conta.verExtrato(); <br/>
	 * [15, -50, -100]; 
	 * 
	 * @return um array contendo as operações realizadas na conta bancaria
	 */
	public double[] verExtrato() {

		return null;
	}
}
