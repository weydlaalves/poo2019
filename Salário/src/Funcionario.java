abstract class Funcionario {
	 
	 protected String nome;
	 public int qtd_diarias;
	 public int max_diarias;
	 protected double bonus;
	
	 abstract double calc_salario();
	 abstract double add_diaria();
	 public Funcionario(String nome,int max_diarias) {
		 
		 this.nome = nome;
		 this.max_diarias = max_diarias;
		 this.qtd_diarias = qtd_diarias;
		 this.bonus = bonus;
	}
	 public String toString() {
		 return  nome;
	 }
	
	 
	 public double setBonus() {
		 return this.bonus/3;
		 
	 }
	 
			 
}
