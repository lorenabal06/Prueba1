public class Persona {

    private String nombre="-vacío-";

    void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    String getNombre(){
        return nombre;
    }

    void addNombre(String nuevaCadena){
        //int nombre = 7;  <-- Razón para usar this en la siguiente intrucción
        this.nombre = nombre + " " + nuevaCadena;
    }
}
