package teoria._13_Arrays.Ejercicios;

public class IesimoNumero {

    // encontrar el i-esimo numero de principio y fin
    public static void main(String[] args) {

        int[] numeros = { 2,5,7,1,2,6,0,9,8};

        // i= 0; numeros.length - i recorreria hasta la mitad

        for (int i = 0; i < numeros.length - i; i++) {
            System.out.println(numeros[i] + " "+ numeros[numeros.length - i - 1]);
        }

    }
}
