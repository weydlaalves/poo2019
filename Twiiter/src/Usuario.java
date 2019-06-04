import java.util.ArrayList;

public class Usuario {
	String id;
	ArrayList<Usuario>seguidores;
	ArrayList<Usuario>seguidos;
	public Usuario(String id) {
		this.id = id;
		seguidores = new ArrayList<Usuario>();
		seguidos = new ArrayList<Usuario>();
		
		
	}
	public void seguir(Usuario other){
        for(Usuario user : seguidos)
            if(user.id.equals(other.id))
                return;
        this.seguidos.add(other);
        other.seguidores.add(this);
    }
	public void deseguir(Usuario other){
        for(Usuario user : seguidos)
            if(user.id.equals(other.id))
                return;
        this.seguidos.remove(other);
        other.seguidores.remove(this);
    }
	public String toString() {
		String saida = "[";
		return saida;
	}

}
