package teoria._06_usoDeString.Ejercicios;

/* 
 La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como 
argumentos de línea de comandos.
Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero 
convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. 
Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
N.es_A.ia_E.pe

*/


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Ingresa el nombre del familiar/amigo ");
//        String usuario1 = sc.nextLine();
//
//        System.out.println("Ingresa el nombre del familiar/amigo ");
//        String usuario2 = sc.nextLine();
//
//        System.out.println("Ingresa el nombre del familiar/amigo ");
//        String usuario3 = sc.nextLine();


        String usuario1 = "Andres";
        String usuario2 = "Maria";
        String usuario3 = "Pepe";

        String resultado = "";

        // tomar el segundo caracter y convertirlo a mayusculas.
        String usuario1_ = usuario1.substring(1,2)
            .toUpperCase().concat(".").concat(usuario1.substring(usuario1.length() - 2));
        System.out.println("El primer nombre es: " + usuario1_);

        String usuario2_ = usuario2.substring(1,2)
        .toUpperCase().concat(".").concat(usuario2.substring(usuario2.length() - 2, usuario2.length()));
        System.out.println("El segundo nombre es: " + usuario2_);

        String usuario3_ = usuario3.substring(1,2)
            .toUpperCase().concat(".").concat(usuario3.substring(usuario3.length() - 2, usuario3.length()));
        System.out.println("El tercer nombre es: " + usuario3_);

        resultado = usuario1_ + "_" + usuario2_ + "_" + usuario3_;
        System.out.println("El resultado es: " + resultado);

        // Método 2
        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);
                
        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);
                
        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);
        
        String resultado2 = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
        System.out.println(resultado2);

    }
}
