/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraprueba;
import java.util.Scanner;
/**
 *
 * @author Ninry
 */
public class PrimeraPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double money=0; //Penita :'c
        double conversion[]= {708, 784.03, 6.55, 36.41, 884.36};   //Dolar, euro, yen, peso algo xd, sdads
        
        
        for(int i = 0; i< 10; i++) {
        System.out.println("Ingrese Valor");
        money=scan.nextDouble();
        System.out.println("Dolar a CLP: " + money*conversion[0]);
        System.out.println("Euro a CLP: " + money*conversion[1]);
        System.out.println("YEN a CLP: " + money*conversion[2]);
        System.out.println("MEX a CLP: " + money*conversion[3]);
            System.out.println("Esterlina a CLP: " + money*conversion[4]);  
            System.out.println("------------------------------- ");
            
        }
    }
    
}
