import java.util.ArrayList;

public class Transacoes {
	int id;
	String nome;
	float valor;
	
	public Transacoes(int id,float valor,String nome) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;	
	}
	@Override
	public String toString() {
		return "Transacoes [id=" + id + ", nome=" + nome + ", valor=" + valor + "]";
	}

}