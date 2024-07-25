package teoria._13_Arrays.Ejercicios;

public class DetectarOrdenArreglo {
//    Detectar si un array esta ordenado acendente, descendente o desordenado
    public static void main(String[] args) {

        int[] numeros = { 72,89,20,92,0};

        boolean ascendente  = false;
        boolean descendente  = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor pos "+i+" : "+numeros[i]);
            System.out.println("Valor pos "+i + 1+" : "+numeros[i+1]);

            if (numeros[i] > numeros[i+1]){
                descendente = true;
            }
            else if (numeros[i] < numeros[i+1]){
                ascendente = true;
            }

        }

        if(ascendente == true && descendente == true)
            System.out.println("Arreglo desordenado");

        else if(ascendente == true && descendente == false)
            System.out.println("Arreglo ascendente");
    }
}
