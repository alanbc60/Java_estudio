package teoria._16_POO.Interface.Ejemplos.Ejemplo3Calculadora;

interface Operable {
    int operar(int a, int b);
}

class Suma implements Operable {
    public int operar(int a, int b) {
        return a + b;
    }
}

class Resta implements Operable {
    public int operar(int a, int b) {
        return a - b;
    }
}

class Calculadora {
    public static void main(String[] args) {

        Operable suma = new Suma();
        Operable resta = new Resta();

        System.out.println("Suma: " + calcular(suma, 5, 3)); // Suma: 8
        System.out.println("Resta: " + calcular(resta, 5, 3)); // Resta: 2


    }

    public static int calcular(Operable operacion, int a, int b) {
        return operacion.operar(a, b);
    }
}


