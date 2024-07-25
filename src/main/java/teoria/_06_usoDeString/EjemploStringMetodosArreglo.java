package teoria._06_usoDeString;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray(); // lo convertimos a array el String
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for(int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.jsf";
        String[] archivoArr = archivo.split("\\.");
        //Aquí, archivo.split("\\.") divide la cadena archivo en partes donde encuentra
        //el carácter punto (.). Como resultado, la cadena "alguna.imagen.jsf" se divide en un array
        //que contiene ["alguna", "imagen", "jsf"].

        String archivo2 = "alguna.imagen.jsf";
        String[] archivoArr2 = archivo2.split("\\."); // [.]
        System.out.println("l = " + l);
        for (String s : archivoArr2) {
            System.out.println(s);
        }
        System.out.println("extension = " + archivoArr2[ (archivoArr2.length) -1]);
    }
}
