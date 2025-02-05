public class Main {
    public static void main(String[] args) {

        Persona antonio = new Persona();
        Persona maria = new Persona();

        antonio.setNombre("Antonio");
        antonio.addNombre("Moratilla");

        maria.setNombre("María");
        maria.addNombre("Pérez");


        System.out.println("Nombre: " + antonio.getNombre());
        System.out.println("Nombre: " + maria.getNombre());

    }
}