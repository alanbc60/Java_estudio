package teoria._05_Bucles.Ejercicios;

import java.util.Scanner;

public class NumeroMayoEjer1 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int numMayor = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese un numéro");
            int num = sc.nextInt();
//            numMayor = (num > numMayor) ? numMayor = numMayor : numMayor = numMayor;

            if(num > numMayor)
                numMayor = num;
        }

        String mensajeNumero = (numMayor >= 10) ? "El número "+numMayor+" es igual o mayor a 10"
                : "El número "+numMayor+" es menor o igual a 10";

        System.out.println(mensajeNumero);
        
        sc.close();
                
        
    }
}
