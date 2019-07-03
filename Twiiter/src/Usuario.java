import java.util.ArrayList;

public class Usuario {
	
	String id;
	int nao_lidos;
	ArrayList<Mensagem>timeline;
	ArrayList<Mensagem> meustwits;
	ArrayList<Usuario>seguidores;
	ArrayList<Usuario>seguidos;

	public Usuario(String id) {
		this.id = id;
		this.nao_lidos = 0;
		timeline = new ArrayList<Mensagem>();
		meustwits = new ArrayList <Mensagem>();
		seguidores = new ArrayList<Usuario>();
		seguidos = new ArrayList<Usuario>();
	}
	
	public void seguir(Usuario usuario){
        for(Usuario user : seguidos)
            if(user.id.equals(usuario.id))
                return;
        this.seguidos.add(usuario);
        usuario.seguidores.add(this);
    }
	
	public void deseguir(Usuario usuario){
        this.seguidos.remove(usuario);
        usuario.seguidores.remove(this);
    }
	
	public void twitar(Mensagem msg) {
			timeline.add(msg);
		for(Usuario us : seguidores) {
			meustwits.add(msg);
			timeline.add(msg);
			this.nao_lidos += 1;
			if(msg.nome == null) {
				msg.nome = id;
				msg.setNumero(msg.numero);
			}
		}
		
	}
	
	public  ArrayList<Mensagem> getTimeline() {
		for(Mensagem ms : meustwits)
			System.out.println(meustwits);
		for(Usuario us : seguidores)
			
			System.out.println(us.timeline);
		return timeline;
	}

	public void darLike(int numero) {
		for(Mensagem ms : timeline) {
			if(ms != null) {
				ms.like(id);
			}
		}
	}
	
	public int getNao_lidos() {
		return nao_lidos;
	}
	
	public String toString() {
		String saida = "" + id + "\n"+"<-[";
		for(Usuario user : seguidos )
			saida+= user.id+",";
			saida += "]" + " \n" + "->[";
		for(Usuario user : seguidores)
			saida += user.id+",";
		
		return saida+ "]";
	}
}
	
	
	