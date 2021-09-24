
package seleccioncolombia;

import java.util.Scanner;
import jugadores.Jugadores;


public class SeleccionColombia {

    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int seleccion;
        int contador=1;
        Jugadores[] jugadores=new Jugadores[23];
        
        System.out.println("----Bienvenido------------");
        do{
            // Menu de opciones
           System.out.println("Seleccione un opcion del menu.");
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
           
          switch (seleccion){
                //Agregar
            case 1 :
                jugadores[contador]=new Jugadores();
                System.out.print(" Digite el numero de la camiseta: ");
                jugadores[contador].setNumCamiseta(lea.nextInt());
                System.out.print(" Digite el nombre del jugador: ");
                jugadores[contador].setNombre(lea.next());
                System.out.print(" Digite el apellido del jugador: ");
                jugadores[contador].setApellido(lea.next());
                System.out.print(" Digite la posicion del jugador: ");
                jugadores[contador].setPosicion(lea.next());
                System.out.print(" Digite la edad del jugador: ");
                jugadores[contador].setEdad(lea.nextInt());
                System.out.print(" Digite el equipo de la liga donde juega: ");
                jugadores[contador].setEquipoLiga(lea.next());
                
                contador++;
                
                break;
                //Buscar
            case 2 :
               seleccion=1;
               
                System.out.print(" Ingrese el numero de la camiseta del jugador: ");
                seleccion = lea.nextInt();
                            
                if (seleccion>0 && seleccion<23){
                    System.out.println("--------------------------------------");
                    System.out.print("Numero de la camiseta: "+jugadores[seleccion].getNumCamiseta()+"\n");
                    System.out.print("Nombre: "+jugadores[seleccion].getNombre()+" "+jugadores[seleccion].getApellido()+"\n");
                    System.out.print("Posicion: "+jugadores[seleccion].getPosicion()+" "+"Edad: "+jugadores[seleccion].getEdad()+"\n");
                    System.out.print("Equipo: "+jugadores[seleccion].getEquipoLiga()+"\n");
                    System.out.println("--------------------------------------");
                    
                }
                break;
                //Editar
            case 3 :
                seleccion=1;
               
                System.out.print(" Ingrese el numero de la camiseta del jugador que va a editar: ");
                seleccion = lea.nextInt();
                    System.out.print("El jugador a editar es: "+jugadores[seleccion].getNombre()+" "+jugadores[seleccion].getApellido()+"\n");
                    System.out.println("Efectue los cambio a este jugador:");
                    System.out.println("-------------------------------------------------------------");
                    /* System.out.print(" Digite el numero de la camiseta: ");
                     jugadores[seleccion].setNumCamiseta(lea.nextInt());*/
                     System.out.print(" Digite el nombre del jugador: ");
                     jugadores[seleccion].setNombre(lea.next());
                    System.out.print(" Digite el apellido del jugador: ");
                     jugadores[seleccion].setApellido(lea.next());
                      System.out.print(" Digite la posicion del jugador: ");
                      jugadores[seleccion].setPosicion(lea.next());
                       System.out.print(" Digite la edad del jugador: ");
                        jugadores[seleccion].setEdad(lea.nextInt());
                        System.out.print(" Digite el equipo de la liga donde juega: ");
                        jugadores[seleccion].setEquipoLiga(lea.next());
                    
                break;
                //Listar
            case 4 :
                for(int i=1; i<contador; i++){
                    System.out.println("--------------------------------------");
                    System.out.print("Numero de la camiseta: "+jugadores[i].getNumCamiseta()+"\n");
                    System.out.print("Nombre: "+jugadores[i].getNombre()+" "+jugadores[i].getApellido()+"\n");
                    System.out.print("Posicion: "+jugadores[i].getPosicion()+" "+"Edad: "+jugadores[i].getEdad()+"\n");
                    System.out.print("Equipo: "+jugadores[i].getEquipoLiga()+"\n");
                    System.out.println("--------------------------------------");
                }
                break;
                //Salir
            case 5 :
                System.out.println("Proceso Terminado"); 
                System.exit(0);
                break;
            default :
                System.out.println("Opcion no valida");
                break;
                
          }
        }while(seleccion !=5);
        
        }
        
    
    }
    

