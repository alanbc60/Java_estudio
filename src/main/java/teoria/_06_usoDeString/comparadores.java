package teoria._06_usoDeString;

public class comparadores {

    public static void main(String[] args) {
        // Definimos los string
        String str1 = new String("Hello");
        String str2 = "Hello";

        // Comparamos los string
        System.out.println("==== COMPARANDO STRINGS ====");
        // Esto ocurre porque str2 es una referencia a la memoria que se conoce como pool de strings
        System.out.println("str1 es el mismo objeto que str2: " +(str1 == str2));

        if (str1.equals(str2)) {
            System.out.println("str1 tiene el mismo valor que str2");
        }

    }
}
