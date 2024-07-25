package teoria._06_usoDeString.Ejercicios;

public class InvertirCadena {

    static String invertir(String cadena){
        String cadenaInversa = "";
        for (int i = cadena.length() - 1; i >= 0 ; i--) {
            cadenaInversa+= cadena.charAt(i);
        }
        return cadenaInversa;
    }

    // ============== StringBuffer ===============
    static String invertirCadenaStringBuffer(StringBuffer cadena){
        return cadena.reverse().toString();
    }

    static String invertirCadenaStringBufferV2(String cadena){
        return new StringBuffer(cadena).reverse().toString();
    }

    // ============== StringBuilder ===============
    static String invertirCadenaStringBuilder(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

    public static void main(String[] args) {

        String cadena = InvertirCadena.invertir("Hola");
        System.out.println(cadena);

        StringBuffer cadenaInversa = new StringBuffer("Abigail");
        System.out.println("Cadena inversa: "+InvertirCadena.invertirCadenaStringBuffer(cadenaInversa));

        System.out.println("Cadena inversa: "+InvertirCadena.invertirCadenaStringBufferV2("Alan"));

        System.out.println("Cadena inversa:" +InvertirCadena.invertirCadenaStringBuilder("Esmeralda"));
    }


}
