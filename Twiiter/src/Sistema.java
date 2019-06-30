import java.util.Map;
import java.util.TreeMap;

public class Sistema {

	Map<String,Usuario> usuarios;
	
	public Sistema () {
		usuarios = new TreeMap<String,Usuario>();
	}
	public void addUsuario(String id) {
		Usuario user = usuarios.get(id);
		if(user == null) {
			usuarios.put(id, new Usuario(id));
		}
	}
	public Usuario getUsuario(String id) {
		Usuario user = usuarios.get(id);
		if(user == null)
			throw new RuntimeException("Usuario : " + id + " nao encontrado");
		return user;
	}
	@Override
	public String toString() {
		String saida = "";
		for(Usuario user : usuarios.values())
			saida += user + "\n";
		return saida;
		
	}
}