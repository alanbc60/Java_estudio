package teoria._06_usoDeString.Ejercicios;

public class VocalesConsonantes {

    // Escribe un método que cuente el número de vocales y consonantes en una cadena.


    public static int[] totalVocalesConsonantes(String cadena){

        String cadenaMinisculas  = cadena.toLowerCase();

        // definir variables
        int totalVocales = 0;
        int totalConsonantes = 0;

        System.out.println("Cadena: "+cadenaMinisculas);
        for (int i = 0; i < cadenaMinisculas.length() ; i++) {

            if( cadenaMinisculas.charAt(i) >= 'a' && cadenaMinisculas.charAt(i) <= 'z'){
                if("aeiou".indexOf(cadenaMinisculas.charAt(i)) != - 1 ){
                    System.out.println("Entro en vocales: "+cadenaMinisculas.charAt(i));
                    totalVocales++;
                }
                else{
                    totalConsonantes++;
                    System.out.println("Entro en consonantes: "+cadenaMinisculas.charAt(i));
                }

            }
        }

        return new int[]{totalVocales, totalConsonantes};

    }

    public static void main(String[] args) {

        // argumentos en consola
        if(args.length == 0) {
            System.out.println("Debes ingresar argumentos!");
            System.exit(-1);
        }

        String palabra = args[0];
        int[] respuestas = VocalesConsonantes.totalVocalesConsonantes(palabra);
        System.out.println("total de vocales: "+respuestas[0]);
        System.out.println("total de consonantes: "+respuestas[1]);
    }
}
