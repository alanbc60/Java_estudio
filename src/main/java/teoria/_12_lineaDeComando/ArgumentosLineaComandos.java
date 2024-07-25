package teoria._12_lineaDeComando;

public class ArgumentosLineaComandos {

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Debes ingresar argumentos!");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos "+i+": "+args[i] );
        }
    }
}
