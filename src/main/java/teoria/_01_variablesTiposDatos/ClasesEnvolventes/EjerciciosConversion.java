package teoria._01_variablesTiposDatos.ClasesEnvolventes;
/*
    Declara una cadena que contenga un número entero y una cadena que contenga un número de punto flotante.
    Convierte estas cadenas a tipos primitivos int y double usando los métodos de las clases envolventes Integer y
    Double.
    Convierte los valores primitivos de nuevo a cadenas usando los métodos toString de las clases envolventes.
    Imprime los valores antes y después de la conversión.
*/
public class EjerciciosConversion {
    public static void main(String[] args) {
        String cadena1 = "1000";
        String cadena2 = "10.01";

        // convertir en datos primitivos

        int numero1 = Integer.parseInt(cadena1);
        double numero2 = Double.parseDouble(cadena2);

        System.out.println("num 1: "+numero1);
        System.out.println("num 2: "+numero2);


        // convertir los datos de nuevo a cadenas

        String numCadena1 =  Integer.toString(numero1);
        String numCadena2 =  Double.toString(numero2);

        System.out.println("num act 1: "+numCadena1);
        System.out.println("num act 2: "+numCadena2);



    }
}
