package teoria._05_Bucles.Ejercicios;

import java.util.Scanner;

//Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero
//sin usar el símbolo de multiplicación (*).

//Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
//donde menos por menos es positivo.
public class Multiplicar2NumerosEjer4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingresa el numero 1: ");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el numero 2: ");
        int num2 = sc.nextInt();

        int numMayor = (num1> num2) ? num1: num2;
        int numMenor  = (num1 > num2) ? num1 : num2;

        // Ejemplo -3  x -1

        for (int i = numMenor; i < numMayor; i++) {

            if( i ==  numMayor){
                int resultado = +(numMayor);
            }
        }
        sc.close();

    }
}
