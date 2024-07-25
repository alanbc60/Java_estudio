package teoria._19_programacionFuncional.stream.Ejemplos.Ejemplo1;


import java.util.Arrays;
import java.util.List;

public class SumaElementos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int suma = numeros.stream()
                .peek(n -> System.out.println("Elemento: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Contenido después del map: " + n))
                .reduce(0, (total, numero) -> total + numero);

        System.out.println("La suma de los números es: " + suma);
    }

}
