package teoria._16_POO.Interface.Ejemplos.Ejemplo3Calculadora;

interface Operaciones {
    int operar(int a, int b);

    default void mostrarOperacion(int a, int b) {
        System.out.println("Operando con " + a + " y " + b);
    }
}

class SumaOp implements Operaciones {
    public int operar(int a, int b) {
        return a + b;
    }
}

class RestaOp implements Operaciones {
    public int operar(int a, int b) {
        return a - b;
    }
}


public class CalculadoraDefaultMetodos {

    public static void main(String[] args) {
        Operaciones suma = new SumaOp();
        Operaciones resta = new RestaOp();

        suma.mostrarOperacion(5, 3);
        System.out.println("Resultado: " + suma.operar(5, 3));

        resta.mostrarOperacion(5, 3);
        System.out.println("Resultado: " + resta.operar(5, 3));
    }

}
