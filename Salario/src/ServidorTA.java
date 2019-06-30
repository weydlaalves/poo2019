class ServidorTA extends Funcionario {
	
	private int nivel;
	
	public ServidorTA(String nome, int max_diarias) {
		super(nome, max_diarias);
		this.nivel = nivel;
	}

	public String toString() {
		return "Sta:"+  super.toString()+ "\n nivel : " + nivel+ "\n salario : "+ calc_salario();
	}
	
	@Override
	public double calc_salario() {
		return (300 * nivel) + 3000;
	}
	public double setBonus() {
		 return calc_salario()+super.setBonus();
	}

	

}
