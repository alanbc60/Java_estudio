package teoria._13_Arrays;

public class IteracionArrays {

    public static void main(String[] args) {
        String[] celulares = {"Motorola", "Apple", "xioami", "Samsung", "Sony", "Realme"};


        // iteración de arrays


        for (int i = 0; i < celulares.length ; i++) {
            System.out.println(celulares[i]);
        }
        System.out.println("== iteracion 2 ==");
        for (int i = 0; i <= celulares.length -1 ; i++) {
            System.out.println(celulares[i]);
        }

        // usando foreach
        System.out.println("=== forEach ===");
        for (String celular: celulares ){
            System.out.println(celular);
        }

        // Importante:
        System.out.println("=== iteracion al reves ===");
        // iterando al reves
        for (int i = celulares.length - 1; i >= 0 ; i--) {
            System.out.println(celulares[i]);
        }
    }
}
