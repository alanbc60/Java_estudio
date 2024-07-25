package teoria._11_claseMath;

public class EjemplosClaseMath {

    public static void main(String[] args) {

        // ==== Constantes =====

        //Math.PI: Representa la constante π (pi), aproximadamente 3.14159
        //Math.E: Representa la constante e (la base del logaritmo natural), aproximadamente 2.71828.


        // ====== Métodos de redondeo =======
        //Math.abs(double num): Devuelve el valor absoluto de num

        int valorAbsoluto = Math.abs(-4);
        System.out.println("El valor absoluto es: "+valorAbsoluto);
        
        //Math.ceil(double num): Devuelve el menor entero que es mayor o igual a num (redondea hacia arriba, aunque sea 3.1)
        double techo = Math.ceil(3.9);
        System.out.println("num ceil: "+techo);

        //Math.floor(double a): Devuelve el mayor entero que es menor o igual a num (redondea hacia abajo, aunque sea 3.9)
        double piso = Math.floor(3.9);
        System.out.println("num floor: "+piso);

        //Math.round(float num) y Math.round(double a): Devuelve el valor más cercano al entero de num
        double redondeo = Math.round(3.9);
        System.out.println("num round: "+redondeo);

        // Exponenciación y logaritmos

        // Math.exp(double a): Devuelve e^a.
        double e_al_cuadrado =  Math.exp(2);
        System.out.println("e^2 = "+e_al_cuadrado);

        // Math.hypot(double a, double b): Devuelve la hipotenusa de un triángulo rectángulo de catetos a y b.
        double hipotenusa =  Math.hypot(3, 4);
        System.out.println("Hipotenusa = "+hipotenusa);

        // Math.log(double a): Devuelve el logaritmo natural (base e) de a.
        double logaritmo =  Math.log(2);
        System.out.println("Logaritmo = "+logaritmo);

        // Math.log10(double a): Devuelve el logaritmo en base 10 de a.
        double log10 =  Math.log10(2);
        System.out.println("Log10 = "+log10);

        // Math.pow(double a, double b): Devuelve a^b.
        double potencia =  Math.pow(2, 3);
        System.out.println("Potencia = "+potencia);

        // Math.sqrt(double a): Devuelve la raíz cuadrada de a.
        double raiz =  Math.sqrt(9);
        System.out.println("Raiz = "+raiz);


        // ========= Métodos de Manipulación de Números  ============
        // Math.max(double a, double b): Devuelve el mayor de a y b.
        double valor_maximo  =  Math.max(3.5, 1.2);
        System.out.println("Max: "+ valor_maximo);

        // Math.min(double a, double b): Devuelve el menor de a y b.
        double valor_minimo  =  Math.min(3.5, 1.2);
        System.out.println("Max: "+ valor_minimo);

        // Math.random(): Devuelve un valor double aleatorio mayor o igual que 0.0 y menor que 1.0.
        double aleatorio =  Math.random();
        System.out.println("aleatorio: "+ aleatorio);


        // ==== Métodos trigonometricos ====

        //Math.sin(double a): Devuelve el seno de a en radianes.
        double seno =  Math.sin(90);
        System.out.println("seno: "+ seno);

        //Math.cos(double a): Devuelve el coseno de a en radianes.
        double coseno =  Math.cos(90);
        System.out.println("coseno: "+ coseno);

        //Math.tan(double a): Devuelve la tangente de a en radianes.
        double tangente =  Math.tan(90);
        System.out.println("tangente: "+ tangente);

        //Math.asin(double a): Devuelve el arco seno de a en radianes.
        double arcoseno =  Math.asin(0.5);
        System.out.println("arcoseno: "+ arcoseno);

        //Math.acos(double a): Devuelve el arco coseno de a en radianes.
        double arccoseno =  Math.acos(0.5);
        System.out.println("arccoseno: "+ arccoseno);

        //Math.atan(double a): Devuelve el arco tangente de a en radianes.
        double arctangente =  Math.atan(0.5);
        System.out.println("arctangente: "+ arctangente);

        //Math.toRadians(double angdeg): Convierte grados a radianes.
        double radianes =  Math.toRadians(90);
        System.out.println("radianes: "+ radianes);

        //Math.toDegrees(double angrad): Convierte radianes a grados.
        double grados =  Math.toDegrees(90);
        System.out.println("grados: "+ grados);

    }
}
