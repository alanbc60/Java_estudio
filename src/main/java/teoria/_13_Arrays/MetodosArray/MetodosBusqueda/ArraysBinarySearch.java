package teoria._13_Arrays.MetodosArray.MetodosBusqueda;

import java.util.Arrays;

public class ArraysBinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};

        int indiceBuscar = Arrays.binarySearch(array, 4);

        String resultado =  (indiceBuscar >=0) &&  (indiceBuscar <= array.length -1 ) ?
            "El numero se encuentra en la posicion: " + indiceBuscar
                    : "El numero no se encuentra";

        System.out.println(resultado);

    }
}
