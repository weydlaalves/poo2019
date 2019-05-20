
import java.util.Scanner;


	public class Controller {
		public static void main(String[] args) {
			Banco b = new Banco();
			Scanner sc = new Scanner(System.in);
			while (true) {		
				String line = sc.nextLine();
				String []ui = line.split(" ");

				if(ui[0].equals("sair")) {
					break;
				}
				else if(ui[0].equals("addCli")) {
					Cliente cli = new Cliente(ui[1]);
					Conta cc = new ContaCorrente(0,0.00,0);
					Conta cp = new ContaPoupanca(0,0.00,0);
					b.addcli(cli,cc,cp);
					
				}
				else if(ui[0].equals("show")) {
					System.out.println(b.toString());
				}

			}

		}


	}


