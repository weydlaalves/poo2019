import java.util.Scanner;

public class Contoller {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	       Calc calc = new Calc (0);
	        System.out.println("calculadora");

	        while (true){
	            String line = sc.nextLine();
	            String [] ui = line.split(" ");
	                if (ui[0].equals("end")) {
	                    break;
	                }else if(ui[0].equals("init")) { 
	                	calc = new Calc(Integer.parseInt(ui[1]));            	
	                }else if (ui[0].equals("show")) {
	                	System.out.println(calc);
	                }else if (ui[0].equals("carregar")) {
	                	calc.carregar(Integer.parseInt(ui[1])); 
	                }else if(ui[0].equals("somar")) {
	                	String valor = calc.soma(Integer.parseInt(ui[1]),Integer.parseInt(ui[2]));
	                	if(!valor.equals(""))
	        				System.out.println(valor);
	                }else if(ui[0].equals("dividir")) {
	                	String valor = calc.divisao(Integer.parseInt(ui[1]),Integer.parseInt(ui[2]));
	                	if(!valor.equals(""))
	        				System.out.println(valor);
	                }else {
	                	System.out.println("comando inválido");
	                }
	                
	        }
	}
}