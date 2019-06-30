public class Gerente extends Funcionario {
	String pass; 
	public Gerente(String nome, double salario,String pass) {
	        super(nome, salario);
	        this.pass = pass;
	        this.titulo = 'G';
	    }

	    String contratar(){
	        return "contratei um funcionario";
	    } 
	    public double getBonificacao() {
	        return this.salario * 0.15;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ":"+ pass;
	    }

}
