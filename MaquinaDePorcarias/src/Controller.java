import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maquina maq = new Maquina(0, 0);
        while(true){
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if(ui[0].equals("end")){
                break;
            }else if(ui[0].equals("init")){
                maq = new Maquina(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if(ui[0].equals("show")){
                System.out.println(maq);
            }else if(ui[0].equals("addProd")) {
            	maq.setMolinhas(Integer.parseInt(ui[1]),(ui[2]),Integer.parseInt(ui[3]),Double.parseDouble(ui[4]));
            }else if(ui[0].equals("addDin")){
            	maq.inserirDinheiro(Double.parseDouble(ui[1]));
            	
            }else if(ui[0].equals("comprar")) {
            	
            }
            
        }
    }
}