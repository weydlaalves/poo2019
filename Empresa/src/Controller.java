package pooWeydla;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		String line = scan.nextLine();
		String  ui[] = line.split(" ");
		if(ui[0].equals("end")) {
			break;
		}else if (ui[0].equals("addF")) {// addF nome e salario
			emp.addFuncionario(new Funcionario (ui[1], Double.parseDouble(ui[2])));
		}else if (ui[0].equals("addG")) {// addG nome, salario , senha
			emp.addFuncionario(new Gerente (ui[1], Double.parseDouble(ui[2]),ui[3]));
		}else if (ui[0].equals("addD")) {// addF nome e salario, senha e gratificacao
			emp.addFuncionario(new Diretor (ui[1], Double.parseDouble(ui[2]),Double.parseDouble(ui[3])));
		}else if (ui[0].equals("show")) {
			System.out.println(emp);
		}else if (ui[0].equals("Folha")){
			emp.calcFolha();
		}else if (ui[0].equals("remover")){
			emp.removerFuncionario(ui[1]);
		}
						
		}

	}
}