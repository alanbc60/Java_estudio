package teoria._13_Arrays.Ejercicios;

public class NumMayorArray {
    public static void main(String[] args) {

        int[] numeros = { 72,89,20,92,0};

        int numMayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if( numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: "+numMayor);
    }
}
