
package seleccioncolombia;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
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
            //Agregar
            case 1:
                jugadores[contador]=new Jugadores();
                System.out.println(" Digite el numero de la camiseta: ");
                jugadores[contador].setNumCamiseta(lea.nextInt());
                System.out.println(" Digite el nombre del jugador: ");
                jugadores[contador].setNombre(lea.next());
                System.out.println(" Digite el apellido del jugador: ");
                jugadores[contador].setApellido(lea.next());
                System.out.println(" Digite la posicion del jugador: ");
                jugadores[contador].setPosicion(lea.next());
                System.out.println(" Digite la edad del jugador: ");
                jugadores[contador].setEdad(lea.nextInt());
                System.out.println(" Digite el equipo de la liga donde juega: ");
                jugadores[contador].setEquipoLiga(lea.next());
                
                contador++;
                
                break;
                //Buscar
            case 2:
                break;
                //Editar
            case 3:
                break;
                //Listar
            case 4:
                for(int i=0; i<contador; i++){
                    System.out.println("-"+i+"--"+jugadores[i].getNombre()+" "+jugadores[i].getApellido());
                }
                break;
                //Salir
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
