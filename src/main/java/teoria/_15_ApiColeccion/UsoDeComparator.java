package teoria._15_ApiColeccion;
import java.util.*;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

}



public class UsoDeComparator {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Alice", 30));
        personas.add(new Persona("Bob", 25));
        personas.add(new Persona("Charlie", 35));

        // Comparator para ordenar por nombre
        Comparator<Persona> ordenarPorNombre = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };

        // Comparator para ordenar por edad descendente
        Comparator<Persona> ordenarPorEdadDesc = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getEdad() - p1.getEdad();
            }
        };

        // Comparator para ordenar por edad ascedente
        Comparator<Persona> ordenarPorEdadAsc = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getEdad() - p2.getEdad();
            }
        };


        // Ordenar por nombre
        personas.sort(ordenarPorNombre);
        System.out.println("Ordenadas por nombre:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // Ordenar por edad descendente
        personas.sort(ordenarPorEdadDesc);
        System.out.println("\nOrdenadas por edad descendente:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        personas.sort(ordenarPorEdadAsc);
        System.out.println("\nOrdenadas por edad ascedente:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

}
