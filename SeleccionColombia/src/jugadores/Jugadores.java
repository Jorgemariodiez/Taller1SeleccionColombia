
package jugadores;


public class Jugadores {
    //Atributos
    private int numCamiseta;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipoLiga;
    //Constructor vacio
    
    public Jugadores() {
    }
    //Constructor vacio
    public Jugadores(int numCamiseta, String nombre, String apellido, String posicion, int edad, String equipoLiga) {
        this.numCamiseta = numCamiseta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoLiga = equipoLiga;
    }
  //Los getters y setters     
      public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipoLiga() {
        return equipoLiga;
    }

    public void setEquipoLiga(String equipoLiga) {
        this.equipoLiga = equipoLiga;
    }
    
     //Metodos
    
    
    
    
}

