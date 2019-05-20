
import java.util.Scanner;

	public class Controller {
		public static void main(String[] args) {
			Banco ag = new Banco();
			Scanner sc = new Scanner(System.in);
			while (true) {		
				String line = sc.nextLine();
				String []ui = line.split(" ");

				if(ui[0].equals("sair")) {
					break;
				}
				else if(ui[0].equals("addCli")) {
					Cliente cli = new Cliente(ui[1]);
					Conta cc = new Conta(0,0.00);
					ag.addcli(cli);
					
				}
				else if(ui[0].equals("show")) {
					System.out.println(ag);
				}

			}

		}


	}


