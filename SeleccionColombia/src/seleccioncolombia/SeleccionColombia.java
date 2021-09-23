
package seleccioncolombia;

import java.util.Scanner;
import jugadores.Jugadores;


public class SeleccionColombia {

    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int seleccion;
        int contador=0;
        Jugadores[] jugadores=new Jugadores[23];
        
        
        do{
            // Menu de opciones
           System.out.println("Bienvenido");
           System.out.println("--------------------------------------");
           System.out.println("1. Agregar jugador.");
           System.out.println("2. Buscar jugador.");
           System.out.println("3. Editar jugador.");
           System.out.println("4 .Mostrar seleccion.");
           System.out.println("5. Salir");
           System.out.println("-------------------------------------");
           System.out.println("");
           
           System.out.print("Digite una opcion: ");
           seleccion = lea.nextInt();
                   
        }while(seleccion !=5);
        
        switch (seleccion){
            case 1:
                jugadores[contador]=new Jugadores();
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Proceso Terminado");
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
        
        
        
        
        
        
        
       
    }
    
}
