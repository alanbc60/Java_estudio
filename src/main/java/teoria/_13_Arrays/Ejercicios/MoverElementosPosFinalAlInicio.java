package teoria._13_Arrays.Ejercicios;

import java.util.Arrays;

public class MoverElementosPosFinalAlInicio {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        int ultimo = numeros[numeros.length - 1];
        System.out.println("ultimo: "+ultimo);
        Arrays.fill(numeros, ultimo);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
