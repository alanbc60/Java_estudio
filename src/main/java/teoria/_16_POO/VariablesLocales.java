package teoria._16_POO;

class Ejemplo {
    public void sumar(int a, int b) {
        int suma = a + b; // Variable local
        System.out.println("La suma es: " + suma);
    }
}

public class VariablesLocales {

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.sumar(5, 10); // Salida: La suma es: 15
    }
}
