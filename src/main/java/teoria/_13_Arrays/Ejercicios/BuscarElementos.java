package teoria._13_Arrays.Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BuscarElementos {

    public static int buscarElemento(int[] arr, int elemento){
        int indiceBuscar = Arrays.binarySearch(arr, elemento);
        return indiceBuscar;
    }

    public static void main(String[] args) {

        Scanner sc  =  new Scanner(System.in);
        int[] numeros = new int[7];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 2;
        }

        System.out.print("Ingrese su numero a buscar: ");
        int num = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == num){
                System.out.println("El Número "+num+ " encontrado en la pos: "+i);
                encontrado = true;
            }
        }

        if(encontrado == false){
            System.out.println("Número no encontrado");
        }

        int indiceBuscar = BuscarElementos.buscarElemento(numeros, 5 );

        if(indiceBuscar < 0 ||  indiceBuscar > numeros.length){
            System.out.println("Error: Indice no encontrado");
        }
        else{
            System.out.println("Elemento encontrado!! en la pos: "+indiceBuscar);
        }

    }
}
