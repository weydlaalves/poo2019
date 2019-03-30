package topik;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Topik topik = new Topik(0,0);
	System.out.println("###################");
	System.out.println("inicializar topik");
	System.out.println("###################");
	while (true) {
		String line = sc.nextLine();
		String[] ui =line.split(" ");
		if(ui[0].equals("end")) {
			break;		
		}else if(ui[0].equals("init")) {
			topik = new Topik(Integer.parseInt(ui[1]),
							 Integer.parseInt(ui[2]));
		}else if(ui[0].equals("show")) {
			System.out.println(topik);
		}else if (ui[0].equals("embarcar")) {
			topik.embarcar(new Passageiro(ui[1],Integer.parseInt(ui[2])));
		}else if(ui[0].equals("remover")) {
			topik.remover(ui[1]);
			
			
		}else {
			System.out.println("comando inválido");
		}
				
	}
	}
}
