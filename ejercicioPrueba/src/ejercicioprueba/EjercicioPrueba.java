/*
 registrar la venta de 3 libros. la cantidad de copias vendidas de los sgte libros. el programa debe entregar libro con mayor recaudacion, cant de libros vendidosm cabt y recaudación de c/libro, % de venta y salir programa
 */
package ejercicioprueba;

import java.util.Scanner;

/**
 *
 * @author alumnos09
 */
public class EjercicioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ruise=3000, woT=20000, Lamora=5000, venta=0;
        double cantLam=0, cantWoT=0, cantRuise=0, cantTotal=0, total=0;
        double totalWoT=0, totalRuise=0, totalLamora=0;
        
        Scanner scan= new Scanner(System.in);
        boolean salir= false;
        int respuesta=0;
        
        
        do{
            System.out.println("¿Qué acción desea realizar? 1- Venta 2-Estadisticas 3- Salir");
            do{
                respuesta=validar(scan.next());
            }while(respuesta>4&&respuesta<1);
            switch(respuesta){
                case 1: 
                {
                   do{
                       
                        do{
                             System.out.println("Que desea comprar? 1-Wheel of Time 2-Como matar a un ruiseñor 3-Las mentiras de Locke Lamora 0-Salir" );
                            venta=validar(scan.next());
                          //  System.out.println("Opcion invalida e.e");
                        } while(venta<0||venta>4);
                        if(venta==1){
                            System.out.print("¿Cuantas Copias? ");
                            do{
                            cantWoT=Venta(scan.next());
                            }while(cantWoT<0);
                        }
                        if(venta==2){
                            System.out.print("Cuantas copias? ");
                            
                             do{
                            cantRuise=Venta(scan.next());
                            }while(cantRuise<0);
                            
                        }
                        if(venta==3){
                            System.out.print("Cuantas copias? ");
                            
                             do{
                            cantLam=Venta(scan.next());
                            }while(cantLam<0);
                        }
                    } while(venta!=0);  
                   
                    totalWoT+=cantWoT*woT;
                    totalRuise+=cantRuise*ruise;
                    totalLamora+=Lamora*cantLam;
                    total=totalLamora+totalRuise+totalWoT;
                    cantTotal=cantLam+cantRuise+cantWoT;
                    System.out.println("Su total es: " +total );  
                    break;
                }
                 /*   System.out.println("seleccione libro a la venta 1: Saga La rueda del tiempo, 2: Como matar a un ruiseñor, 3: Las mentiras de locke lamora");
                    seleccion=scan.nextInt();
                    System.out.println("Cuantos desea comprar?");
                    compra=scan.nextInt();
                    switch(seleccion){
                        case 1: 
                            
                                 totalWoT=woT*compra+totalWoT;
                                 cantWoT+=compra;
                                 
                        break;
                        case 2: totalRuise=ruise*compra+totalRuise;
                                cantRuise+=compra;
                        break;
                        case 3: totalLamora= Lamora*compra+totalLamora;
                                cantLam+=compra;
                         break;
                             
                    */
                    
                    
                case 2: 
               // {
                    System.out.println("Libro con mayor recaudación");
                    
                
                
                
                        if(totalWoT>totalRuise&&totalWoT>totalLamora){
                            System.out.println("Es Wheel of Time");
                        } else if(totalRuise>totalWoT&&totalRuise>totalLamora){
                            System.out.println("Es Como Matar a un Ruiseñor ");
                        }else{
                            System.out.println("Es Las mentiras de Locke Lamora");
                        }
                        System.out.println("Se vendieron " + cantWoT + " de Wheel of time, " + cantRuise + " de Como matar a un ruiseñor y " + cantLam + " de Las Mentiras de Locke Lamora");
                      System.out.println("cada uno recaudó: " + totalWoT +", " + totalRuise+ ", " + totalLamora); 
                      System.out.println("En porcentaje: " + (cantWoT/cantTotal)*100 + "% , " + (cantRuise/cantTotal)*100 + "% y "+ (cantLam/cantTotal)*100+"%" );
                //}  
                      break;
                case 3:
                    salir=true;
                    
                default:   System.out.println("Ingrese una opcion válida");
                    
            }
            
            
        }while(!salir);
       
        // TODO code application logic here
    }
    public static int validar(String n){
       int x=0;
        try{    
            x= Integer.parseInt(n);
            return x;
        } catch (Exception e) {
            return 100;
        }
        
    }
    public static int Venta(String cantidad){
        int y=0;
        try {
            y=Integer.parseInt(cantidad);
            return y;
        } catch (Exception f) {
            return 0;
        }
        
    }
        
}
    

