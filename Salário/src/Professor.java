import java.util.ArrayList;

class Professor extends Funcionario {
	
	char classe;
	
	public Professor(String nome,char classe) {
		super(nome, 2);
		this.classe = classe;
		
	}

	public String toString() {
		return "Professor: "+ super.toString() + "\nclasse: " + classe + "\nsalario: "+this.calc_salario();
	}
	public double calc_salario() {
		 return (classe - 'A')* 2000 + 3000;
	 } 
	public void add_diaria() {

	}
	
	public double setBonus() {
		 return this.calc_salario() + super.bonus;
	}

}
