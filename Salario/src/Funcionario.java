abstract class Funcionario {
	 
	 protected String nome;
	 public int qtd_diarias;
	 public int max_diarias;
	 protected double bonus;
	
	 abstract double calc_salario();
	
	 
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
	 public void add_diarias() {
		 if(qtd_diarias <= 2) {
			 qtd_diarias += 1;
			 max_diarias += 100;
			 
		 }
	 }
	
}
