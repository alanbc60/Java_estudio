package teoria._06_usoDeString.Ejercicios;

public class Palindromo {

    public boolean verificarPalindromo(String palabra){
        boolean exito = false;
        String palabraInversa = "";
        for (int i = palabra.length() - 1; i >=0 ; i--) {
            palabraInversa+= palabra.charAt(i);
        }
        for (int i = 0; i < palabra.length() - 1; i++) {
            exito = palabra.charAt(i) == palabraInversa.charAt(i);
        }

        return exito;
    }

    public boolean esPalindromo(String cadena){
        // Eliminar espacios en blanco y convertir a minúsculas
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();
        StringBuffer buffer = new StringBuffer(cadenaLimpia);
        System.out.println("cadena: "+buffer.toString());
        buffer.reverse();
        // Convertir el StringBuffer invertido de nuevo a String
        String cadenaInvertida = buffer.toString();

        System.out.println("cadena invertida: "+cadenaInvertida);

        return cadenaLimpia.equals(cadenaInvertida);
    }

    public static void main(String[] args) {
        Palindromo palabra1 = new Palindromo();
        System.out.println("La palabra es palindromo: "+palabra1.verificarPalindromo("Juanita"));

        System.out.println("La palabra es palindromo: "+palabra1.esPalindromo("anita lava la tina"));
    }
}
