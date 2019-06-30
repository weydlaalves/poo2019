class Professor extends Funcionario {
	
	char classe;
	
	public Professor(String nome,char classe) {
		super(nome,0);
		this.classe = classe;
	}

	public String toString() {
		return "Professor: "+ super.toString() + "\nclasse: " + classe + "\nsalario: "+this.calc_salario();
	}
	public double calc_salario() {
		double salario =(classe - 'A')* 2000 + 3000;
		if(max_diarias <= 2) {
			qtd_diarias +=100;
			System.out.println(" ajajaj");
		}
		return salario;
	 } 
		
	
	
	public double setBonus() {
		 return this.calc_salario() + super.bonus;
	}

}
