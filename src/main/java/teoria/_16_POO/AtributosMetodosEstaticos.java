package teoria._16_POO;

public class AtributosMetodosEstaticos {


    private static String nombre = "Andres";
    private static String apellidos = "Gonzalez";
    private static int edad = 30;
    public String dni = "12345678A";

    // ===== Métodos estaticos =====



    // no se puede usar this en el static y para usar atributos en métodos estaticos se debe poner
    // NombreDeLaClase.atributo
    private static void modificarNombre(String nombre){
        AtributosMetodosEstaticos.nombre = nombre;
    }

    public static void main(String[] args) {

        // la opcion dni no es accesible desde la clase AtributosMetodosEstaticos, ya que como no es 
        // estatico, no se puede acceder desde la clase porque debe de haber una instancia (objeto)
        AtributosMetodosEstaticos.nombre = "Pepe";

        System.out.println(AtributosMetodosEstaticos.nombre);
        AtributosMetodosEstaticos.modificarNombre("Juan");

        System.out.println("El nombre es: "+AtributosMetodosEstaticos.nombre);


    }

}
