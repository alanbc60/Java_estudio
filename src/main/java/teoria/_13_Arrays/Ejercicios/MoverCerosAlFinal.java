package teoria._13_Arrays.Ejercicios;

import java.util.Arrays;

public class MoverCerosAlFinal {

    public static void moverCerosArray(int[] array){
        int noCeroIndex = 0;

        for (int i = 0; i <array.length ; i++) {

            if (array[i] != 0){
                array[noCeroIndex++] = array[i];
            }
        }

        while (noCeroIndex < array.length){
            array[noCeroIndex++] = 0;
        }

    }


    public static void main(String[] args) {

        int[] array = {0, 1, 0, 3, 12};
        System.out.println("Array original: " + Arrays.toString(array));
        moverCerosArray(array);
        System.out.println("Array después de mover los ceros: " + Arrays.toString(array));
    }
}
