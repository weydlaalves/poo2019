public class Cliente  {
	String nome;
	int contap;
	int contac;
	public Cliente(String nome) {
		this.nome = nome;
		this.contap = contap;
		this.contac = contac;
	}
	@Override
	public String toString() {
		return nome + ":" + contap + "\n" + nome + contac;
	}
	
	
}
