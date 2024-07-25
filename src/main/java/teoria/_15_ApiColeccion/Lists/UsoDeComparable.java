package teoria._15_ApiColeccion.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public int compareTo(Persona otraPersona) {
        return this.edad - otraPersona.edad; // Ordenar por edad ascendente
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

}

public class UsoDeComparable {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Alice", 30));
        personas.add(new Persona("Bob", 25));
        personas.add(new Persona("Charlie", 35));

        Collections.sort(personas);     // Ordena con base a la edad

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
