package teoria._03_operadores.Ejercicios;

//Pedir dos números y mostrarlos ordenados de mayor a menor

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        System.out.println("Ingresa un número: ");
        int numero2 = sc.nextInt();

        String numMayor = (numero > numero2) ? "Números mayor a menor: "+numero+" " + ","+numero2+" "
                : "El número mayor es: "+numero2+" " + ", "+numero+" ";
        System.out.println(numMayor);


        // método 2

        if(numero > numero2){
            System.out.println("El orden queda: "+numero+","+numero2);
        }
        else
            System.out.println("El orden queda: "+numero2+","+numero);

        sc.close();

    }
}
