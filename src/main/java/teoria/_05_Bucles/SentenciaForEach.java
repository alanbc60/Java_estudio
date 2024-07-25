package teoria._05_Bucles;

public class SentenciaForEach {
    public static void main(String[] args) {
        // se usa para iterar arreglo u objetos de coleccion de java
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
