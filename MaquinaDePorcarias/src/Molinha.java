public class Molinha {
	
	private String pNome;
	private double pPreco;
	private int qtd;
	public Molinha(String pNome,int qtd, double preco) {
		
		this.pNome = pNome;
		this.pPreco = pPreco;
		this.qtd = qtd;
	}
	public String toString(){
        return "[ " + this.pNome + " : " + this.qtd + " U : " + this.pPreco +" RS "+ " ]";
    }
}
