package teoria._13_Arrays;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        int[] numeros = { 1,5,8,2,5};

        for (int i = 0; i < numeros.length - 1 ; i++) {
            for (int j = 0; j < numeros.length -  i - 1; j++) {

                if(numeros[j] > numeros[j+1]){
                    int numAux = numeros[j]; // 8
                    numeros[j] = numeros[j+1]; // numeros[2] -->  2
                    numeros[j+1] = numAux;   // numeros[ 3 ] --> 8
                }
            }

        }

        for(int num: numeros){
            System.out.println(num);
        }
    }
}
