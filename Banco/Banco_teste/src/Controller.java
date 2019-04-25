import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("carlos","2555488",1500,778,2);
		System.out.println(g);
		System.out.println(g.contratar());
		Funcionario f = new Funcionario("joão"," 55578",980.0);
		System.out.println(f);
		System.out.println(f.contratado());
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			String []ui = line.split(" ");
			if (ui[0].equals ("end")) {
				break;
			}else if(ui[0].equals("contratar")) {
				g.cadastrarNovoFuncionario(ui[1], ui[2], Float.parseFloat(ui[3]));
			}else if(ui[0].equals("show")) {
				System.out.println(f);
			}
		}
	}
}
