import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Sistema sist = new Sistema(0);
		Scanner sc = new Scanner(System.in);
		while (true) {
		
		String line = sc.nextLine();
		String []ui = line.split(" ");
			
		try {
		if (ui[0].equals("end")) {
			break;
		}
		else if (ui[0].equals("init")) {
			sist = new Sistema(Float.parseFloat(ui[1]));
		}else if(ui[0].equals("show")) {
			System.out.println(sist);
		}else if (ui[0].equals("cadastrar")) {
			String id = ui[1];
			String fullname = " ";
			for(int i=2 ; i<ui.length; i++) {
				fullname += ui[i] + " ";
			}	fullname = fullname.substring(0,fullname.length()-1);
				sist.cadastrar(new Cliente(id,fullname));
		}else if(ui[0].equals("emprestar")) {
				sist.emprestar(ui[1], Float.parseFloat(ui[2]));
		}else if(ui[0].equals("historico")) {
				for(Transacoes t : sist.historico()) {
					System.out.println(t);
				}
		}else if (ui[0].equals("matar")) {
				sist.matar(ui[1]);
		}
		}catch(NullPointerException e) {
			System.out.println("fail: usuario nao cadastrado");		
		}catch(RuntimeException e) {
			System.out.println("fail: Tente novamente");
			
		}
	}
	
	}
}