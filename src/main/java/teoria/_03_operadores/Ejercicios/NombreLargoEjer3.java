package teoria._03_operadores.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

// Obtener el nombre mas largo de tres personas ( nombre  +  apellido )

public class NombreLargoEjer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un nombre: ");
        String nombreCompleto = sc.nextLine();

        String [] dividirNombreCompleto1 = nombreCompleto.split(" ");
        System.out.println(Arrays.toString(dividirNombreCompleto1));
        String nombre1 = dividirNombreCompleto1[0];

        System.out.println("Ingresa un nombre: ");
        String nombreCompleto2 = sc.nextLine();
        String [] dividirNombreCompleto2 = nombreCompleto2.split(" ");
        System.out.println(Arrays.toString(dividirNombreCompleto2));
        String nombre2 = dividirNombreCompleto2[0];

        System.out.println("Ingresa un nombre: ");
        String nombreCompleto3 = sc.nextLine();

        String [] dividirNombreCompleto3 = nombreCompleto3.split(" ");
        System.out.println(Arrays.toString(dividirNombreCompleto3));
        String nombre3 = dividirNombreCompleto3[0];

        String nombreMayor = (nombre1.length() > nombre2.length() && nombre2.length() > nombre3.length() )
                ? "El nombre mas largo es: "+nombre1+" "
                : ( nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length() )
                ? "El nombre mas largo es: "+nombre2+" "
                : "El nombre mas largo es: "+nombre3+" ";

        System.out.println(nombreMayor);

        sc.close();



    }
}
