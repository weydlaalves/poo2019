public class Pet {

    private int energia;
    private int saciedade;
    private int limpeza;
    private int energia_max ;
    private int saciedade_max ;
    private int limpeza_max ;
    private int diamantes;
    private int idade;
    private boolean vivo;
    private String nome;
   
    public Pet( String nome,int energia, int saciedade, int limpeza) {

        this.energia = energia;
        this.saciedade = saciedade;
        this.limpeza = limpeza;
        this.energia_max = energia;
        this.saciedade_max = saciedade;
        this.limpeza_max = limpeza;
        this.nome = nome;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getSaciedade() {
        return saciedade;
    }
    public void setSaciedade(int saciedade){
        this.saciedade = saciedade;
    }
    public int getSaciedade_max() {
        return saciedade_max;
    }
    public int getLimpeza(){
        return limpeza;
    }
    public void setLimpeza(int limpeza){
        this.limpeza = limpeza;
    }
    public int getLimpeza_max() {
            return limpeza_max;
    }
    public int getDiamantes() {
        return diamantes;
    }
    public void setDiamantes(int diamantes) {
        this.diamantes = diamantes;
    }
    public int getEnergia_max() {
        return energia_max;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public boolean getVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public void play () {   
    	
    	this.energia -= 2;
        this.saciedade -= 1;
        this.limpeza -= 3;
        this.diamantes +=1;
        this.idade += 1;
        
        if (getEnergia() <= 0 || getSaciedade() <= 0 || getLimpeza() <= 0) {
           setVivo(false);
           System.out.print(" seu pet está morto\n");
           System.out.println(toString());
        }
    }
    public void comer() {
    	
    		this.energia -= 1;
    		this.saciedade += 4;
    		this.limpeza -=2;
    		this.diamantes +=0;
    		this.idade +=1;
    		
    		if (this.saciedade >= this.saciedade_max) {
    			this.saciedade = this.saciedade_max;
    	}
    	if (getEnergia() <= 0 || getSaciedade() <= 0 || getLimpeza() <= 0) {
             setVivo(false);
             System.out.print(" seu pet está morto\n");
             System.out.println(toString());
    	 }
    }
    public void dormir() {
    /*__case dormir
    	O Comando "dormir()" aumenta energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
    	Os outros atributos permanecem inalterados.
     _case dormir sem sono
		Para dormir, precisa ter perdido pelo menos 5 unidades de energia
     */
    	if(this.energia < this.energia_max) {
    		
    		this.idade = (this.energia_max - this.energia );
    		this.idade =+ this.idade;
    		this.energia = this.energia_max;
    	}
    	if (getEnergia() <= 0 || getSaciedade() <= 0 || getLimpeza() <= 0) {
            setVivo(false);
            System.out.print(" seu pet está morto\n");
            System.out.println(toString());
    	}
    } 	
    public void banho() {
    	
    	this.energia -= 3;
    	this.saciedade -= 1;
    	this.limpeza = this.limpeza_max;
    	this.diamantes +=0;
    	this.idade +=2;
    	if (getEnergia() <= 0 || getSaciedade() <= 0 || getLimpeza() <= 0) {
            setVivo(false);
            System.out.print(" seu pet está morto\n");
            System.out.println(toString());
    	}
    }
    public String toString() {
        return "***" + this.nome + "****"+
        		" E " + this.energia + "/"+this.energia_max+
                " S " + this.saciedade + "/"+this.saciedade_max+
                " L " + this.limpeza + "/"+this.limpeza_max+
                " D " + this.diamantes +
                " I " + this.idade;
    }
}