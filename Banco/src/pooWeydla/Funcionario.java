package pooWeydla;

public class Funcionario {
	 private String nome;
	 protected double salario;
	 protected char titulo; 
	    public Funcionario(String nome, double salario) {
	        this.nome = nome;
	        this.salario = salario;
	        this.titulo = 'F';
	    }
	    public String getNome(){
	        return nome;
	    }
	    public double getSalario() {
	    	return salario + getBonificacao();
	    }
	    public double getBonificacao() {
	        return this.salario * 0.10;
	    }
	    @Override
	    public String toString() {
	        return titulo + ":" + nome + ":" + salario;
	    }
}
