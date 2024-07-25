package teoria._13_Arrays.Ejercicios;

public class Combinar2Arreglos_EnUnTercero {

    public static void main(String[] args) {

        int[] numeros = { 2,5,7,1,2,6,0,9,8};

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }

        System.out.println("==== array 2 ====");

        for (int i = 0; i < array.length; i++) {
            System.out.println("valor: "+array[i]);
        }

        int[] arrayResultante = new int[numeros.length + array.length];
        //

        System.out.println("==== array resultante ====");
        // === Método 1 ===
        for (int i = 0; i < numeros.length; i++) {
            arrayResultante[i] = numeros[i];
        }

        for (int i = numeros.length; i < arrayResultante.length; i++) {
            arrayResultante[i] = array[i - array.length + 1];
        }

        // Fin del método 1

        // === Método 2 ===

        for (int i = 0; i < numeros.length; i++) {
            arrayResultante[i] = numeros[i];
        }

        for (int i = 0; i < array.length; i++) {
            arrayResultante[numeros.length + i] = array[i];
        }

        for (int i = 0; i < arrayResultante.length; i++) {
            System.out.println("valor: "+arrayResultante[i]);
        }



    }
}
