import java.util.HashMap;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Funcionario> mapaf = new HashMap<String,Funcionario>(); 
		while (true){
			String line = sc.nextLine();
			String [] ui = line.split(" ");
			try{
			if (ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("addProf")){
				Funcionario fp = new Professor((ui[1]),ui[2].charAt(0));
				mapaf.put(ui[1], fp);
			}else if(ui[0].equals("addSta")){
				Funcionario fst = new ServidorTA((ui[1]),Integer.parseInt(ui[2])); 
				mapaf.put(ui[1],fst);
			}else if(ui[0].equals("addTer")){
				Funcionario ft = new Terc((ui[1]),Integer.parseInt(ui[2]),Boolean.parseBoolean(ui[3]));
				mapaf.put(ui[1],ft);
			}else if(ui[0].equals("addDiaria")) {
				Funcionario fp = mapaf.get(ui[1]);
				fp.add_diarias();
			}else if (ui[0].equals("addBonus")) {
				Funcionario fp = mapaf.get(Double.parseDouble(ui[1]));
				fp.setBonus();
			}
			else if(ui[0].equals("show")) {
				Funcionario fp = mapaf.get(ui[1]);
				if(fp != null) {
					System.out.println(fp);
				}
				else {
					System.out.println("fail: funcionario nao existe");
				}
				}else  if(ui[0].equals("remover")){
				Funcionario fp = mapaf.remove(ui[1]);
			}else {
				System.out.println("comando invalido");
			}
			}catch(NullPointerException e) {
				System.out.println("fail: Funcionario nao adicionado");		
			}catch(RuntimeException e) {
				System.out.println("fail: Paramentos incorretos");
				
			}
		}
		
	}
}