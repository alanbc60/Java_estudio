package teoria._06_usoDeString.Ejercicios;

//Escribe un método que reemplace todos los caracteres específicos en una cadena utilizando
public class CambiarCaracteres {

    public static String reemplazarCaracteres(String cadena, char nuevo, char viejo) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == viejo) {
                resultado.append(nuevo);
            } else {
                resultado.append(cadena.charAt(i));
            }
        }

        return resultado.toString();
    }


    public static void main(String[] args) {

        String res = CambiarCaracteres.reemplazarCaracteres("Escuchando musica", 'i', 'o');
        System.out.println("Cadena: "+res);
    }

}
