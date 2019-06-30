class Terc extends Funcionario {
	
	protected int horas_trabalhadas;
	protected boolean insalubre;
	
	
	public Terc(String nome, int horas_trabalhadas, boolean insalubre) {
		super(nome, 0);
		this.horas_trabalhadas = horas_trabalhadas;
		this.insalubre = true;
	}
	public String toString() {
		return "Terceirizado: "+super.toString()+ "\n horas trabalhadas : "+ horas_trabalhadas + " \n Insalubre :"+ insalubre + "\n salario: "+calc_salario();
	}
	public double calc_salario() {
		double salario = (4 * horas_trabalhadas );
		if (insalubre == true) {
			salario += 500;
			return salario;
		}
		return salario ; 
	}
	@Override
	
	public double setBonus() {
		 return calc_salario()+super.setBonus();
	}
}
