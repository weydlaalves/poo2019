import java.util.ArrayList;

public class Empresa {
	ArrayList<Funcionario> fs ;
	
	public Empresa() {
		fs = new ArrayList<Funcionario>();
	}
	public void addFuncionario(Funcionario f) {
		fs.add(f);
	}
	public double calcFolha() {
		double folha = 0.0;
		for(Funcionario f : fs)
			folha += f.getSalario();
		return folha;
	}
	public void removerFuncionario(String nome) {
		for(Funcionario fun : fs) {
			if(fun.getNome().equals(nome)) {
				fs.remove(fun);
			}
		}	
	}
	@Override
	public String toString() {
		String saida = " ";
		for(Funcionario f : fs) 
			saida += f +"\n"; 
		return saida;
	}
	
			

}
