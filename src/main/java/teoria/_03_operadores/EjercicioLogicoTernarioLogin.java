package teoria._03_operadores;

import java.util.Scanner;

public class EjercicioLogicoTernarioLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/
        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String user = scanner.next();

        System.out.println("Ingrese el password");
        String password = scanner.next();

        boolean esAutenticado = false;





        for(int i = 0; i < usernames.length; i++){

            // if( usernames[i].equals(user) && passwords[i].equals(password) ){ {
            //     esAutenticado = true;
            //     System.out.println("Bienvenido usuario ".concat(user).concat("!"));
            //     break;
            // }
            // usando el operador ternario
            esAutenticado = (usernames[i].equals(user) && passwords[i].equals(password))? true: esAutenticado;
        }
        // verificacion usando operador ternario
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(user).concat("!") :
                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Los siento, requiere autenticación");
        }*/

        scanner.close();
    }
}
