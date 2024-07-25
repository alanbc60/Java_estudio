package teoria._16_POO;


class Persona {
    private String nombre; // Variable de instancia
    private int edad; // Variable de instancia

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}



public class VariablesInstancia {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);

        persona1.mostrarInformacion(); // Salida: Nombre: Juan, Edad: 25
        persona2.mostrarInformacion(); // Salida: Nombre: Ana, Edad: 30

    }
}
