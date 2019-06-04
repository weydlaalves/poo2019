
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
					b.addcli(ui[1]);
				}
				else if(ui[0].equals("show")) {
					System.out.println(b);
				}

			}

		}


	}


