import java.util.Map;
import java.util.TreeMap;

public class Sistema {
	String id;
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
			throw new RuntimeException("Usuario nao encontrado");
		return user;
	}
	@Override
	public String toString() {
		return "Sistema [id=" + id + ", Usuario=" + usuarios + "]";
	}
}
