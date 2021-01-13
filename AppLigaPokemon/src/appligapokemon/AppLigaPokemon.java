package appligapokemon;

import java.util.Scanner;

public class AppLigaPokemon{

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        boolean exit = false;
        
        while(!exit){
            System.out.println("---------------------------------------------");
            System.out.println("Menú");
            System.out.println("");
            System.out.println("1. Registrar nuevo Entrenador");
            System.out.println("2. Registrar nueva batalla");
            System.out.println("3. Lista de combates");
            System.out.println("4. Buscar entrenador");
            System.out.println("5. Modificar datos de entrenador");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("Opción: ");
            String opc = inp.next();
            System.out.println(".............................................");
            
            switch(opc){
                case "1":
                    System.out.println("");
                    System.out.print("Nombre entrenador: ");
                    inp.nextLine();
                    String namT= inp.nextLine();
                    
                    if(Entrenador.buscarEntrenador(namT)==null){
                        System.out.print("Ciudad de origen: ");
                        String city= inp.next(namT);
                        System.out.print("Programa: "+Entrenador.createTrainer(namT, city));
                    System.out.println("-------------------------------------");
                    
                    for(int i = 0 ; i < 6; i++){
                        System.out.println("");
                        System.out.println("Ingrese pokemon |n°"+(i+1)+"|");
                        System.out.print("Pokemon: ");
                        String pok = inp.next();
                        System.out.print("Tipo: ");
                        String typ = inp.next();
                        System.out.println("Programa: "+Entrenador.assignPoke(nom, i, pok, typ));
                        
                    }

                        
                    }else{
                        System.out.println("Error: Entrenador ya existe en el registro");
                    }
                    break;
                //Registrar nueva batalla
                case "2":
                    System.out.println("Registrar nueva batalla");
                    System.out.println("");
                    System.out.println("Ingrese título del duelo: ");
                    inp.nextLine();
                    String title = inp.nextLine();
                    System.out.println("Ingrese ciudad: ");
                    String ciud = inp.next();
                    DueloPokemon.createDuel(title, ciud);
                    
                    System.out.print("Ingrese Día: ");
                    String d = inp.next();
                    System.out.print("Ingrese Mes: ");
                    String m = inp.next();
                    System.out.print("Ingrese Año: ");
                    String a = inp.next();
                  
                   
                    DueloPokemon.setDate(d,m,a);
                    int x=DueloPokemon.getLista().size()-1;
                    DueloPokemon dp= DueloPokemon.getLista().get(x);
                    DueloPokemon.getFecha(dp); 
      
 
                                        
                    for(int i = 0 ; i < 2; i++){
                        System.out.printf("Entrenador %d%n",(i+1));
                        System.out.println("Ingrese nombre entrenador: ");
                        String nom = inp.next();
                        System.out.println("Ingrese ciudad de origen:");
                        ciud = inp.next();
                        
                    }
                    
                    
                    
                    
                    
                    break;
                    
                //Lista de combates
                case "3":
                    System.out.println("Los combates agendandos son ");
                    
                    
                    break;
                    
                //Buscar entrenador
                case "4":
                    System.out.print("Ingrese nombre de entrenador: "); 
                    Entrenador tnr = Entrenador.buscarEntrenador(inp.next());
                    System.out.println("Buscando...");
                    if(tnr==null){
                        System.out.println("Entrenador no encontrado");
                        
                    }else{
                        System.out.println("El entrenador " + tnr.getNombre() + " proviniente de " + tnr.getCiudad() + ", tiene los siguientes pokemones : ");
                        for (int i = 0; i < tnr.getPokes().size(); i++) {
                            System.out.println( i+1 + "-" + tnr.getPokes().get(i));
                            
                        }
                        
                        
                        
                        
                    }
                    
                    
                    
                    break;
                    
                //Modificar datos de entrenador    
                case "5":
                    break;
                    
                //Salir del programa    
                case "6":
                    System.out.println("");
                    System.out.println("¿Desea salir del programa? (y/n)");
                    System.out.print("Opción: ");
                    opc = inp.next();
                    
                    if(opc.equalsIgnoreCase("y")){
                        System.out.println("");
                        System.out.println("Saliendo...");
                        System.out.println("");
                        exit = true;
                        
                    }else{
                        System.out.println("");
                        System.out.println("Retornando al menú principal");
                        System.out.println("");
                    }
                    
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println("Ingrese un número válido");
                    System.out.println("");
                    break;
                    
            }
            
        }

    }

}

        // TODO code application logic here
