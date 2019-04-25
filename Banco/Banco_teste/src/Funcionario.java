import java.util.ArrayList;

public class Funcionario {
	 protected String nome;
     protected String cpf;
     protected double salario;
     ArrayList<Funcionario>fs;
     
     public Funcionario(String nome, String cpf, double salario) {
    	 this.nome =  nome;
    	 this.cpf = cpf;
    	 this.salario = salario;
    	 ArrayList<Funcionario> fs = new ArrayList<Funcionario>();
     }
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	public double getBonificacao() {
        return this.salario * 0.10;
    }
	public String contratado() {
		return "gostaria de ser contratado";
	}
}