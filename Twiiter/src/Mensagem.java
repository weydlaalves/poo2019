public class Mensagem {
	int numero;
	String nome;
	String msg;
	
	
	public Mensagem(String msg) {
		
		this.numero = 0;
		this.nome = nome;
		this.msg = msg;
	}
	//public void darlike(String nome) {
		//if(this.nome != null) {
			//return;
		 //}
	//}
	@Override
	public String toString() {
		String saida = numero + ":"+ nome + ":"+"("+ msg+")";
		return saida;
	}

}
