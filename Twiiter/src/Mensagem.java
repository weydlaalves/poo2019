import java.util.ArrayList;

public class Mensagem {
	int numero;
	String nome;
	String msg;
	ArrayList<String>nomes;
	
	
	public Mensagem(int numero,String nome, String msg) {
		
		this.numero = numero;
		this.nome = nome;
		this.msg = msg;
		nomes= new ArrayList<String>();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero += numero;
	}
	public void like(String nome) {
		if(nome != null)
		nomes.add(nome);
		 
	}
	@Override
	public String toString() {
		String saida = numero + ":"+ nome + ":"+"("+ msg+")";
		return saida;
	}

}
