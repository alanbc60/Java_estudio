package teoria._12_lineaDeComando;

public class EjemploCalculadora {

    public static void main(String[] args) {

        if(args.length < 3){
            System.out.println("Debe ingresar 3 argumentos");
            System.out.println("Ejemplo: mult/div/res/sum/ num1 num2");
        }
        else{
            String operacion = args[0];
            double num1 = Double.parseDouble( args[1] );
            double num2 = Double.parseDouble(args[2]);
            double resultado = 0.0;
            switch (operacion) {

                case "mult":
                    resultado = num1 * num2;
                    break;
                case "div":
                    resultado = num1 / num2;
                    break;

                case "res":
                    resultado = num1 - num2;
                    break;

                case "sum":
                    resultado = num1 + num2;
                    break;
            }
            System.out.println("El resultado es: "+resultado);
        }

    }
}
