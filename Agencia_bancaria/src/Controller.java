import java.util.ArrayList;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Banco ag = new Banco();
		Conta_P cp = new Conta_P(0,0.00);
		Conta_C cc = new Conta_C(0,0.00);
		
		Scanner sc = new Scanner(System.in);
		while (true) {		
		String line = sc.nextLine();
		String []ui = line.split(" ");
		if(ui[0].equals("sair")) {
			break;
		}
		else if(ui[0].equals("addCli")) {			
			Cliente c = new Cliente((ui[1]));
			ag.addcli(c);
		}
		else if(ui[0].equals("show")) {
			System.out.println(ag);
		}
			

	}
	

}
}