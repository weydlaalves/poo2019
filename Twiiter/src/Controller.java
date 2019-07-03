import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema sist = new Sistema();
     
        while(true){
            String line = sc.nextLine();
            String ui[] = line.split(" ");
        try {
        	if (ui[0].equals("end"))
        		break;
        	else if (ui[0].equals("addUser")) {
        		sist.addUsuario(ui[1]);
            } else if (ui[0].equals("show")) {
                System.out.println(sist);
            } else if (ui[0].equals("seguir")) {
            	Usuario um = sist.getUsuario(ui[1]);
                Usuario dois = sist.getUsuario(ui[2]);
                um.seguir(dois);
            }else if (ui[0].equals("unfollow")) {
            	Usuario um = sist.getUsuario(ui[1]);
                Usuario dois = sist.getUsuario(ui[2]);
                dois.deseguir(um);
            }
            else if(ui[0].equals("twitar")) {
                String id = ui[1];
         		String mensagem = " ";
         		for(int i=2 ; i<ui.length; i++) {
         			mensagem += ui[i] + " ";
         		}   mensagem = mensagem.substring(0,mensagem.length()-1);
         		
         		Usuario user = sist.getUsuario(id);
         		Mensagem msg = new Mensagem (0,id,mensagem);
         		user.twitar(msg);
                
            } else if(ui[0].equals("timeline")) {
            	Usuario user = sist.getUsuario(ui[1]);
            	user.getTimeline();
            }else if(ui[0].equals("darlike")) {
            	Usuario user = sist.getUsuario(ui[1]);
            	user.darLike(Integer.parseInt(ui[2]));
            }
         	}catch(RuntimeException rt){
         		System.out.println(rt.getMessage());
         	}
        }
    }
}
