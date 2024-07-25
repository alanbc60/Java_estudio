package teoria._05_Bucles.Ejercicios;

import java.util.Scanner;

public class NumeroMenorNNumerosEjer2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Numero a  comparar: ");
        int total =  sc.nextInt();

        if(total >= 10){
            int menor = 0;
            for (int i = 0; i < total; i++) {

                System.out.println("Ingresa el numero " +(i+1));
                int num = sc.nextInt();

                if( i == 0 ) {
                    menor  = num;
                }
                else{
                    menor = (num <= menor) ? num : menor;
                }

            }

            String mensajeNumero = (menor >= 10) ? "El número "+menor+" es igual o mayor a 10"
                    : "El número "+menor+" es menor o igual a 10";

            System.out.println(mensajeNumero);
        }

    }
}
