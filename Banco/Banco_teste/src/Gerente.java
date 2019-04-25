class Gerente extends Funcionario {
	
	protected int senha;
    protected int numeroDeFuncionariosGerenciados;
	
    public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		
    	super(nome, cpf,salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	@Override
	public String toString() {
		return "Gerente :" + nome +","+ "salario: " + salario;
	}
	public double getBonificacao() {
        return  super.salario + 1.000;
    }
	public String contratar() {
		return " Estamos Contratando!";
	}
	public void cadastrarNovoFuncionario(String nome,String cpf,double salario) {
		Funcionario f = new Funcionario(nome,cpf,salario);
		fs.add(f);
	}
	
	public Funcionario encontrarFuncionario(String nome){
		for(Funcionario fun : fs) {
			if(fun.nome.equals(nome)) {
				return fun;
			}
	}
		return null;	
		}
}
