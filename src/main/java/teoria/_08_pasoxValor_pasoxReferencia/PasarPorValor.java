package teoria._08_pasoxValor_pasoxReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        Integer num = 10;

        System.out.println("iniciamos el método main con i = " + i);
        System.out.println(" === Método pasar argumento por valor ===");
        test(i);
        System.out.println("Finaliza el método main con el valor de i (se mantiene igual) = " + i);


        System.out.println(" === Método pasar argumento por referencia ===");
        System.out.println("iniciamos el método main con num = " + num);
        test2(num);
        // Integer es inmutable, cada vez que se modifica el valor , se retorna una nueva instancia
        System.out.println("Finaliza el método main con el valor de  num(se mantiene igual) = " + num);
    }
    // cualquier dato que no sea un objeto ( no primitivo ) se pasa por valor
    // método para pasar el valor por valor
    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con i = " + i);
    }

    // Método que pasa por referencia.
    public static void test2( Integer num) {
        System.out.println("Iniciamos el método test con num = " + num);
        num = 35;
        System.out.println("Finaliza el método test con num = " + num);
    }
}
