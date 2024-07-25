package teoria._06_usoDeString;

public class compareToString {

    public static void main(String[] args) {
        
        String str1 = "banano";
        String str2 = "bananu";

        // Comparamos los string lexicograficamente ( letra por letra )
        int resultado = str1.compareTo(str2);

        if (resultado < 0) {
            System.out.println(str1 + " es menor que " + str2);
        } else if (resultado > 0) {
            System.out.println(str1 + " es mayor que " + str2);
        } else {
            System.out.println(str1 + " es igual que " + str2);
        }

    }
    
}
