package teoria._06_usoDeString;

public class Concatenacion {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = str1 + str2;
        System.out.println(str3);

        int numero1 = 5;
        int numero2 = 10;
        // Como la primera variable es un string, java lo toma como las demas variables serian una concatenacion        
        System.out.println(str1 + numero1 + numero2);

        // se puede usar un método para concatenar

        String nombre = new String("Alan Bastida");
        String prefesion = "Desempleado";

        String detalles = nombre.concat(prefesion);
        System.out.println(detalles);

        // los concat se pueden ir anidando
        String usuario = nombre.concat(" ".concat(prefesion));
        System.out.println(usuario);



    }
}

