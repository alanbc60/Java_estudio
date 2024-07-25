package teoria._13_Arrays.Ejercicios;

public class CombinarUnElem2Arrays_EnOtroArray {

    public static void main(String[] args) {
        int[] numeros = { 2,5,7,1,2,6,0,9,8,6};

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

        // numeros  = 2, 5, 7, 1, 2, 6, 0, 9, 8, 6
        // array  =   2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        // arrayResultante = 2,2,5,3,7,4,1,5,2,6,6,7,0,8, 9, 9, 8, 10, 6, 11

        System.out.println("==== array 2 ====");

        for(int i = 0; i < array.length; i++) {
            System.out.println("valor: "+array[i]);
        }

        System.out.println("==== Array Resultante ====");

        int[] arrayResultante = new int[numeros.length + array.length];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            arrayResultante[aux++] = numeros[i];
            arrayResultante[aux++] = array[i];
        }

        for (int i = 0; i < arrayResultante.length; i++) {
            System.out.println("valor: "+arrayResultante[i]);
        }
    }


}
