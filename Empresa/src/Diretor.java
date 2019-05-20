package pooWeydla;

public class Diretor extends Gerente {
	double gratificacao;
	
	public Diretor(String nome, double salario,double gratificacao) {
		super(nome, salario, nome);
		this.gratificacao = gratificacao;
		this.titulo = 'D';
		
	}  public double getBonificacao() {
        return super.getBonificacao() * 2;
    }
	@Override
	public double getSalario(){
    	return super.getSalario() + gratificacao;
    }
	@Override
	public String toString() {
		return super.toString() + ":" + gratificacao;
	}

}
