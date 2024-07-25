package teoria._13_Arrays.MetodosArray;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoArraysMetodoSort {
    public static void main(String[] args) {

        String[] celulares = new String[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < celulares.length; i++) {
            System.out.print("Ingresa el nombre del celular: ");
            celulares[i] = sc.nextLine();
        }

        // mostrar el arreglo
        for (int i = 0; i < celulares.length; i++) {
            System.out.println(celulares[i]);
        }

        // == ordenar el arreglo ==
        Arrays.sort(celulares);
        System.out.println("=== Arreglo ordenado ===");
        for (int i = 0; i < celulares.length; i++) {
            System.out.println(celulares[i]);
        }

    }
}
