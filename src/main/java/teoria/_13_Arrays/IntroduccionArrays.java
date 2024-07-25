package teoria._13_Arrays;

public class IntroduccionArrays {

    public static void main(String[] args) {

        /*
            LOS ARREGLOS SON UNA COLECCION DE ELEMENTOS / ESTRUCTURA DE DATOS QUE PUEDEN SER DE VARIAS CANTIDADES
            LA LONGITUD ES INMUTABLE, CADA ELEMENTO ES UNICO

		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[]
		 *
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *
		 *
		 */

        // declaracion de un array
        String[] nombres;

        // ==== instaciacion de un array  ======
        //Cuando se crea un array, se utiliza el operador new, más el tipo de los
        //elementos, más el número de elementos

        int[] numeros = new int[10];//crea un array con 10 elementos ( no se puede modificar su tamaño, es inmutable)

        //Pero, no solo podemos almacenar elementos del tipo primitivos, sino que
        //también del tipo de referencia, objetos!
        //Producto[] productos = new Producto[3];


        // ==== inicialización de arrays ====
        String[] array = new String[5];

        // inicializando un array mediante llaves o indices
        array[0] = "uno";
        array[1] = "dos";
        array[2] = "tres";
        array[3] = "cuatro";
        array[4] = "cinco";

        // ==== obtener elementos de un arreglo ====

        String num1 = array[0];
        String num2 = array[0];
        String num3 = array[0];

        // === declaracion, instancia e inicializacion ==
        // Cuando ya se conoce el num de elementos y su valor, es preferible declarar asi el arreglo
        int[] numeros2 = { 1,2,3,4};


        // ========= recorrer un arreglo ==========

        // forma 1 ---> for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // forma 2 ---> foreach
        for (String i : array) {
            System.out.println(i);
        }

        // forma 3 ---> while
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        // forma 4 ---> do while
        i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);





    }

}
