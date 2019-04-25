package br.com.qx.trabalho1.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.qx.trabalho1.banco.Conta;

public class TestConta{

	private Conta conta;

	@Before
	public void inicializacao(){
		conta = new Conta(1001, 2000);
	}

	@Test
	public void criarConta(){
		assertEquals("O numero da conta deve igual ao informado na criacao", 1001, conta.getNumero());
		assertEquals("O valor do limite padrao de uma conta 100", 100, conta.getLimite(), 0.01);
		assertEquals("O saldo deve ser igual ao limite + o saldo",  2100, conta.getSaldo(), 0.01);
	}

	@Test
	public void verificarSaldo(){
		assertEquals("O saldo deve ser igual ao limite + o saldo", 2100, conta.getSaldo(), 0.01);
	}

	@Test
	public void usuarionNaoPodeRealizarSaquesNegativos(){
		assertFalse("Sacar valores negativos nao deve ser permitido", conta.sacar(-100));
		assertEquals("O saldo deve permanecer inalterado", 2100, conta.getSaldo(), 0.01);
	}

	@Test
	public void usuarioNaoPoderSacarQuantiasMaioresQueOSaldo(){
		assertFalse("Saldo da conta insuficiente", conta.sacar(5000));
		assertEquals("O saldo deve permanecer inalterado", 2100, conta.getSaldo(), 0.01);
	}

	@Test
	public void usuarioPodeSacarValoresUtilizandoOLimite(){
		assertTrue("Ao sacar um valor o limite da conta deve ser considerado", conta.sacar(2050));
		assertEquals("Valor sacado maior que o saldo", 50, conta.getSaldo(), 0.01);
		assertEquals("O limite foi utilizado na operacao", 50, conta.getLimite(), 0.01);
	}

	@Test
	public void usuarioPodeSacarValoresSemUtilizarLimite(){
		assertTrue("Ao sacar um valor o limite da conta deve ser considerado", conta.sacar(1000));
		assertEquals("Valor sacado maior que o saldo", 1100, conta.getSaldo(), 0.01);
		assertEquals("O limite nao foi utilizado na operacao", 100, conta.getLimite(), 0.01);
	}

	@Test
	public void usuarionNaoDepositarValoresNegativos(){
		assertFalse("Depositar valores negativos nao deve ser permitido", conta.depositar(-100));
		assertEquals("O saldo deve permanecer inalterado", 2100, conta.getSaldo(), 0.01);
	}

	@Test
	public void usuarioPodeDepositarValoresPositivos(){
		assertTrue("Depositar valores nao negativos deve ser permitido", conta.depositar(900));
		assertEquals("O saldo nao atualizado corretamente", 3000, conta.getSaldo(), 0.01);
	}

	@Test
	public void depositosEmContasComLimiteUtilizadoDevemRestaurarOLimite(){
		conta.sacar(2100);
		assertTrue("Depositar valores positivos sao permitidos", conta.depositar(50));
		assertEquals("O saldo nao atualizado corretamente", 50, conta.getSaldo(), 0.01);
		assertEquals("Limite nao restaurado", 50, conta.getLimite(), 0.01);

		assertTrue("Depositar valores positivos sao permitidos", conta.depositar(100));
		assertEquals("O saldo nao atualizado corretamente", 150, conta.getSaldo(), 0.01);
		assertEquals("Limite nao restaurado", 100, conta.getLimite(), 0.01);

	}

	@Test
	public void usuarioNaoPodeTransferirQuantiasNegativas(){
		Conta destino = new Conta(10, 0);
		assertFalse("Transferir valores negativos nao e permitido", conta.transferir(destino, -50));
	}

	@Test
	public void usuarioNaoPodeTransferirQuantiasMaioresQueOSaldo(){
		Conta destino = new Conta(10, 0);
		assertFalse("Transferir valores negativos nao e permitido", conta.transferir(destino, 3000));
		assertEquals("O saldo deve permanecer inalterado", 2100, conta.getSaldo(), 0.01);
		assertEquals("O saldo deve permanecer inalterado", 100, destino.getSaldo(), 0.01);
	}

	@Test
	public void usuarioPodeTransferirQuantiasUtilizandoLimite(){
		Conta destino = new Conta(10, 0);
		assertTrue("Transferir valores negativos nao e permitido", conta.transferir(destino, 2050));
		assertEquals("Valor sacado maior que o saldo", 50, conta.getSaldo(), 0.01);
		assertEquals("O limite foi utilizado na operacao", 50, conta.getLimite(), 0.01);
		assertEquals("O saldo deve permanecer inalterado", 2150, destino.getSaldo(), 0.01);
	}

	@Test
	public void usuarioPodeTransferirQuantiasSemUsarLimite(){
		Conta destino = new Conta(10, 0);
		assertTrue("Transferir valores negativos nao e permitido", conta.transferir(destino, 1000));
		assertEquals("Valor sacado maior que o saldo", 1100, conta.getSaldo(), 0.01);
		assertEquals("O limite nao foi utilizado na operacao", 100, conta.getLimite(), 0.01);
		assertEquals("O saldo deve permanecer inalterado", 1100, destino.getSaldo(), 0.01);
	}

	@Test
	public void verificaExtrato(){
		Conta destino = new Conta(10, 0);
		conta.sacar(200);
		conta.depositar(500);
		conta.transferir(destino, 400);

		double[] extratoCorreto = {-200, 500, -400};
		double[] extrato = conta.verExtrato();
		boolean igual = true;
		for(int i = 0; i < extratoCorreto.length; i++){
			igual &= extrato[i] == extratoCorreto[i];

		}

		assertTrue("O extrato nao confere", igual);

	}



}
