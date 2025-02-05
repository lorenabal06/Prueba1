public class Jugueteo {

    // ZONA DE ATRIBUTOS (Variables de clase)

    // tipo nombre [opcional = valor]
    int edad;
    int miedad=99;

    Integer miEntero;

    boolean verdadero=true;
    boolean falso=false;

    Boolean miVerdadero;
    Boolean miFalso;


    // ZONA DE MÉTODOS (Funciones de clase)
    // tipo devuelto nombre (parametros)
    void prueba(){
        edad = miedad;
    }

    void llamadaAPrueba(){
        prueba();
    }

    void pruebaTipos(){
        miEntero = edad;
        edad = miEntero + 1;

        miedad = miEntero.intValue();
    }

    void pruebaIf(){
        if (true){
            //Esto es true siempre
        } else {
            //Esto nunca es false
        }

        if (1>2){
            //Nunca entraré aquí
        } else {
            //Siempre verdadero
        }

        if ((1>2) || (2>1)) {     // También sirve && para AND, || OR, ! negado
            // entrará siempre aquí
        } else {
            //nunca entrará aquí
        }
        // OJO CON LAS CLASES!!!! NO SE COMPARAN FÁCILMENTE
    }

    void pruebaFor(){

        // for (variables;condicion;postactualización) {}

        for (int x=0;x<10;x++){
            //Cuenta desde 0 hasta 9 ambos incluidos
        }

    }

    void pruebaWhile(){

        while (true){
            //bucle infinito
            break;
        }
        
        int x = 0;
        while (x<25) {

        }
    }

}
