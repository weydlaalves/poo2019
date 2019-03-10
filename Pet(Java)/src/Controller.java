import java.util.Scanner;

class Controller{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet tamagotchi = new Pet(" ",0,0,0);
        System.out.println("end para sair:"+"init para iniciar e colocar o nome" +
                " digitar a energia, saciedade e limpeza"+ "show para mostrar os valores iniciais e maximos e tambem os" +
                "diamantes e idade do seu pet");

        while (true){
            String line = sc.nextLine();
            String [] ui= line.split(" ");
                if (ui[0].equals("end")) {
                    break;
                }else if(ui[0].equals("init")){
                    tamagotchi = new Pet(ui[1],
                            Integer.parseInt(ui[2]),
                            Integer.parseInt(ui[3]),
                            Integer.parseInt(ui[4]));
                    
                }else if(ui[0].equals("show")) {
                    System.out.println(tamagotchi);
                }else if(ui[0].equals("play")) {
                    tamagotchi.play();
                }else if(ui[0].equals("dormir")) {
                	tamagotchi.dormir();
                }else if (ui[0].equals("banho")) {
                	tamagotchi.banho();
                }else if (ui[0].equals("comer")) {
                	tamagotchi.comer();
                	
                }else {
                    System.out.println("comando invalido");

                }
           }

        }

    }
