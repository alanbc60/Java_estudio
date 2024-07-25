package teoria._05_Bucles.Ejercicios;

// Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). 
// Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, 
// ademas mostrar el promedio total.

// Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para 
// realizar los cálculos (contadores, sumas).

// Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error 
// finalizando el programa.


import java.util.Scanner;

public class NotasAlumnosEjer3 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double promedioNotasMayores5  = 0.0;
        int contNotasMayores5 = 0;
        double promedioNotasMenor4 = 0;
        int contNotasMenores4 = 0;
        int contNotasConValor1 = 0;

        double promedioTotal = 0;

        System.out.println("=== Escala de notas 1 -- 7 ===");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa la nota "+(i+1)+": ");
            double nota = sc.nextDouble();

            if(nota == 0 ) {
                System.out.println("Error --> Saliendo del programa...");
                break;
            }
            else{
                if( nota == 1 ){
                    contNotasConValor1++;
                }

                else if( nota > 5) {
                    promedioNotasMayores5 += nota;
                    contNotasMayores5++;
                }
                else if (nota < 4 ) {
                    promedioNotasMenor4 += nota;
                    contNotasMenores4++;
                }
            }

        }
        promedioTotal = promedioNotasMayores5 + promedioNotasMenor4;
        promedioNotasMayores5 /= contNotasMayores5;
        promedioNotasMenor4 /= contNotasMenores4;

        promedioTotal /= 20;

        System.out.println("Promedio de las notas mayor a 5: "+promedioNotasMayores5);
        System.out.println("Promedio de las notas menores a 4: "+promedioNotasMenor4);
        System.out.println("Total de notas con valor 1: "+contNotasConValor1);

        System.out.println("Promedio total de las notas: "+promedioTotal);

    }

}
